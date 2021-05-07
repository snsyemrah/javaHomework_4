package javaCampDay5Homework.business.concretes;

import java.util.ArrayList;

import javaCampDay5Homework.business.abstracts.UserService;
import javaCampDay5Homework.core.AccountService;
import javaCampDay5Homework.dataAccess.abstracts.UserDao;
import javaCampDay5Homework.entities.concretes.User;

public class UserManager implements UserService {

	UserCheckManager userCheckManager = new UserCheckManager();
	ArrayList<String> emails = new ArrayList<String>();
	private UserDao userDao;
	private AccountService accountService;

	public UserManager(UserDao userDao, AccountService accountService) {
		super();
		this.userDao = userDao;
		this.accountService = accountService;
	}

	@Override
	public void add(User user) {
		if (userCheckManager.checkEmail(user.getEmail()) == false) {
			System.out.println("Invalid email adress!");
		} else if (emails.indexOf(user.getEmail()) != -1) {
			System.out.println("This email is available.Please try another email address!");
		} else if (userCheckManager.checkFullName(user.getFirstName()) == false
				|| userCheckManager.checkFullName(user.getLastName()) == false) {
			System.out.println("Please control your fullName");
		} else if (userCheckManager.checkPassword(user.getPassword()) == false) {
			System.out.println("The password you entered is incomplete");
		}
		System.out.println(user.getFirstName() + " " + user.getLastName() + " was added");
		emails.add(user.getEmail());
		userDao.add(user);
	}

	@Override
	public void addByGoogleAccount(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " was added byGoogleAccount");
		accountService.signUpWith(user);
		userDao.add(user);
	}

	@Override
	public void logIn(User user) {
		if (user.getPassword().length() == 0 || user.getEmail().length() == 0) {
			System.out.println("Please, You have to fill email and password!");
		}
			System.out.println("Login is successful!");

		

	}

}
