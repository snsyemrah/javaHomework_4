package javaCampDay5Homework.core;

import javaCampDay5Homework.GoogleAccount.GoogleAccountManager;
import javaCampDay5Homework.entities.concretes.User;

public class GoogleAccountAdapter implements AccountService{

		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
	@Override
	public void signUpWith(User user) {
		
		googleAccountManager.signUp(user.getEmail());
	}

	
		
	}


