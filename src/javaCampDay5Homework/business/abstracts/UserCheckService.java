package javaCampDay5Homework.business.abstracts;

public interface UserCheckService {
	boolean checkPassword(String string);

	boolean checkEmail(String string);

	boolean checkFullName(String string);
}
