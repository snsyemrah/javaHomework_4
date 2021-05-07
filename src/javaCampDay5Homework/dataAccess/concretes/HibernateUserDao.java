package javaCampDay5Homework.dataAccess.concretes;

import javaCampDay5Homework.dataAccess.abstracts.UserDao;
import javaCampDay5Homework.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " was added by Hibernate.");
		
	}

}
