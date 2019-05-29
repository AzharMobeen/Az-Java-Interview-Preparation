package com.az.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {

	private List<User> userList = new ArrayList<>();
	
	public static void main(String[] args) {

		BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
		
		binarySearchDemo.generateDumyUserList();
		binarySearchDemo.printUserList();
		System.out.println("***********************************");
		
		
		User user = binarySearchDemo.searchUser("AZ-41-A");				
		if(user!=null) {			
			System.out.println(user.toString());
		}
		
		user = binarySearchDemo.binarySearchForUser("AZ-41-A");
		if(user!=null) {			
			System.out.println(user.toString());
		}

	}
	
	public void printUserList() {
		userList.forEach(user->System.out.println("User :: "+user.getName()+" | "+user.getId()));
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public User searchUser(String name) {
		long startTime = System.currentTimeMillis();
		User tempUser = null;
		for(User user: userList) {
			System.out.print(".");
			if(user.getName().equalsIgnoreCase(name)) {
				tempUser = user;
				System.out.println("User found!");
				break;
			}							
		}
		long endTime = System.currentTimeMillis();		
		System.out.println("Processing Time in milisecond :: "+(endTime-startTime));
		return tempUser;
	}
	
	public User binarySearchForUser(String searchUserName) {
		long startTime = System.currentTimeMillis();
		User tempUser = new User(searchUserName, 0);		
		int foundUser = Collections.binarySearch(userList, tempUser,null);
		if(foundUser>=0) {
			System.out.println("User found!");
			tempUser = userList.get(foundUser);
		}else {
			System.out.println("User not found!");
			tempUser= null;
		}
		long endTime = System.currentTimeMillis();		
		System.out.println("Processing Time in milisecond :: "+(endTime-startTime));
		return tempUser;
		
	}
	
	
	public void generateDumyUserList() {
		for(int i = 0; i<50;i++) {
			this.addUser(new User("AZ-"+i+"-A", i));
		}
	}
	
	private static class User implements Comparable<User>{

		private String name;
		private int id;
		public User(String name) {
			super();
			this.name = name;
		}
		public User(String name, int id) {
			this(name);			
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", id=" + id + "]";
		}

		@Override
		public int compareTo(User user) {
			//System.out.println("This : "+ name+ " == user "+ user.getName());		
			return this.name.compareToIgnoreCase(user.getName());
		}
	}
}
