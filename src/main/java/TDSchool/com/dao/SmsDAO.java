package TDSchool.com.dao;

import java.io.IOException;
import java.util.List;

import TDSchool.com.model.Sms;

public interface SmsDAO {
	public String execute();
	public String send() throws IOException;
	
}
