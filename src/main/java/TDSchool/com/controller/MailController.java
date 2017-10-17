package TDSchool.com.controller;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailParseException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import TDSchool.com.controller.HomeController;


@Controller
public class MailController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping("sendmail")
	public String send(HttpServletRequest request) {
		   		String from = request.getParameter("tu");
				String to = request.getParameter("den");
				String subject = request.getParameter("tieude");
				String body = request.getParameter("noidung");
		String name = "ducdung";
		String blog = "http://ducdung.blogspot.com";
		String filePath = request.getSession().getServletContext().getRealPath("/") + "/WEB-INF/classes/hello.txt";
		logger.info("send mail simple");
		sendMail(from, to, subject, body);
		logger.info("send mail with template");
		sendMailWithTemplate(name, blog);
		logger.info("send mail with file attachment");
		sendMailWithAttachment(name, blog, filePath);
		return "sendmailsuccess";
	}

		@Autowired
		private MailSender mailSender;
		@Autowired
		private SimpleMailMessage templateMailMessage;
		@Autowired
		private JavaMailSenderImpl javaMailSender;

		public void sendMail(String from, String to, String subject, String body) {
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setFrom(from);
			simpleMailMessage.setTo(to);
			simpleMailMessage.setSubject(subject);
			simpleMailMessage.setText(body);
			mailSender.send(simpleMailMessage);
		}

		public void sendMailWithTemplate(String name, String blog) {
			SimpleMailMessage message = new SimpleMailMessage(templateMailMessage);
			message.setText(String.format(templateMailMessage.getText(), name, blog));
			mailSender.send(message);
		}

		public void sendMailWithAttachment(String name, String blog, String filePath) {
			MimeMessage message = javaMailSender.createMimeMessage();
			try {
				MimeMessageHelper helper = new MimeMessageHelper(message, true);
				helper.setFrom(templateMailMessage.getFrom());
				helper.setTo(templateMailMessage.getTo());
				helper.setSubject(templateMailMessage.getSubject());
				helper.setText(String.format(templateMailMessage.getText(), name, blog));
				FileSystemResource file = new FileSystemResource(filePath);
				helper.addAttachment(file.getFilename(), file);
			} catch (MessagingException e) {
				throw new MailParseException(e);
			}
			javaMailSender.send(message);
		}

	}
	

