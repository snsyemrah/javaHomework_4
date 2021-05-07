package javaCampDay5Homework;

import javaCampDay5Homework.business.concretes.UserManager;
import javaCampDay5Homework.core.GoogleAccountAdapter;
import javaCampDay5Homework.dataAccess.concretes.HibernateUserDao;
import javaCampDay5Homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleAccountAdapter());
		User user1 = new User(1, "Emrah", "Þensoy","emrah@gmail.com", "123456");
		User user2 = new User(1, "Emrah", "Þensoy","emrah1@gmail.com", "1234");
		userManager.add(user1);
		System.out.println("******************************");
		userManager.add(user2);
		System.out.println("******************************");
		userManager.addByGoogleAccount(user1);
	}
}
