package javaCampDay5Homework.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampDay5Homework.business.abstracts.UserCheckService;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkPassword(String string) {
		if(string.length()<6) {
			return false;	
		}
		return true;
		
	}

	@Override
	public boolean checkEmail(String string) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		return matcher.matches();
	}

	@Override
	public boolean checkFullName(String string) {
		if(string.length()<2) {
			return false;
		}
		return true;
	}

}
