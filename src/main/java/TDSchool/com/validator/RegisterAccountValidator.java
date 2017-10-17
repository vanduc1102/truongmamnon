package TDSchool.com.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import TDSchool.com.dao.RegisterAccountDAO;
import TDSchool.com.model.RegisterAccount;

@Service
public class RegisterAccountValidator implements Validator {
	
	@Autowired(required = true)
	@Qualifier(value = "accountDao")
	private RegisterAccountDAO accountDao;
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return RegisterAccount.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password","Field is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirm", "required.passwordConfirm","Field is required");
		
		RegisterAccount acc = (RegisterAccount) target;
		
		if(!(acc.getPassword().equals(acc.getPasswordConfirm()))){
			errors.rejectValue("password","notmatch.password");
		}
		
		RegisterAccount username = accountDao.findByUsername(acc.getUsername());
		if(username!=null){
			errors.rejectValue("username","exist.username");
		}
	}
	
}
