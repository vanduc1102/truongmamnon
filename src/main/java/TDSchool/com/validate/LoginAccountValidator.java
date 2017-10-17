package TDSchool.com.validate;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.LoginAccount;

public class LoginAccountValidator implements Validator {
	
	private LoginAccountDAO accountlogDao;
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return LoginAccount.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		LoginAccount accountlog = (LoginAccount) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty");
        if (accountlog.getUserName().length() < 6 || accountlog.getUserName().length() > 32) {
            errors.rejectValue("userName", "Size.accForm.userName");
        }
        if (accountlogDao.findAccountByName(accountlog.getUserName()) != null) {
            errors.rejectValue("userName", "Duplicate.accForm.userName");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passWord", "NotEmpty");
        if (accountlog.getPassWord().length() < 8 || accountlog.getPassWord().length() > 32) {
            errors.rejectValue("passWord", "Size.accForm.passWord");
        }

        if (!accountlog.getConfirmPassword().equals(accountlog.getPassWord())) {
            errors.rejectValue("confirmPassword", "Diff.accForm.confirmPassword");
        }
	}

}

