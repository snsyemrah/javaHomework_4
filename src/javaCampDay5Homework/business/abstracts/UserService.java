package javaCampDay5Homework.business.abstracts;

import javaCampDay5Homework.entities.concretes.User;

public interface UserService {
	void add(User user);

	void addByGoogleAccount(User user);
	
	void logIn(User user);
}
