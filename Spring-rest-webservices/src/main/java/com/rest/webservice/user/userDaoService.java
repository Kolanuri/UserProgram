package com.rest.webservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class userDaoService {
	public static List<User>users=new ArrayList<>();
	
	private static int usersCount=10;
	static {
		users.add(new User(1,"Adam",new Date()));
		users.add(new User(2,"Jack",new Date()));
		users.add(new User(3,"Meghana",new Date()));
		users.add(new User(4,"Vinay",new Date()));
		users.add(new User(5,"Karthik",new Date()));
		users.add(new User(6,"walz",new Date()));
		users.add(new User(7,"Kajal",new Date()));
		users.add(new User(8,"Ashok",new Date()));
		users.add(new User(9,"Brenz",new Date()));
		users.add(new User(10,"smith",new Date()));
		
	}
	public List<User> findAll(){
		return users;
	}
	public User save(User user) {
		if(user.getId()==0) {
			user.setId(++usersCount);
		}
		
		users.add(user);
		return user;
		
	}
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	public User deleteById(int id) {
		Iterator<User>iterator=users.iterator();
		while(iterator.hasNext()) {
			User user=iterator.next();
			if(user.getId()==id) {
				iterator.remove();
				return user;
			}
		}
		
				
			
		return null;
	}
	

}
