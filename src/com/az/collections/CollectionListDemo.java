package com.az.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionListDemo {

	private List<User> userList = new ArrayList<>();
	
	public static void main(String[] args) {

		CollectionListDemo collectionListDemo = new CollectionListDemo();
		
		collectionListDemo.generateDumyUserList();
		collectionListDemo.printUserList(collectionListDemo.userList);
		System.out.println("*****************Revers List******************");
		
		Collections.reverse(collectionListDemo.userList);
		collectionListDemo.printUserList(collectionListDemo.userList);
		System.out.println("\n**************Shuffle List*********************");
		Collections.shuffle(collectionListDemo.userList);
		collectionListDemo.printUserList(collectionListDemo.userList);
		System.out.println("\n************** Min and Max *********************");
		// Min and Max item needs Comparable Interfaces and toCompareMethod
		CollectionListDemo.User minUser = Collections.min(collectionListDemo.userList);
		CollectionListDemo.User maxUser = Collections.max(collectionListDemo.userList);
		System.out.println("Min "+minUser.toString());
		System.out.println("Max "+maxUser.toString());
		System.out.println("\n************** Collection Copy Method *********************");
		collectionListDemo.collectionCopyMethod(collectionListDemo.userList);

	}
	
	public void printUserList(List<CollectionListDemo.User> userList) {
		userList.forEach(user->System.out.print(user.getName()+"|"+user.getId()));
	}
	
	
	public void addUser(User user) {
		userList.add(user);
	}			
	
	public void generateDumyUserList() {
		for(int i = 0; i<=50;i++) {
			if(i<10)
				this.addUser(new User("AZ-0"+i+"-A", i));
			else
				this.addUser(new User("AZ-"+i+"-A", i));
		}
	}
	
	public void collectionCopyMethod(List<CollectionListDemo.User> userList) {
		
		List<CollectionListDemo.User> newUserList = new ArrayList<>(userList.size());
		Collections.copy(newUserList, userList);
		//newUserList.add(new User("Testing"));
		CollectionListDemo collectionListDemo = new CollectionListDemo();
		collectionListDemo.printUserList(collectionListDemo.userList);		
		collectionListDemo.printUserList(newUserList);
	}
	
	private static class User implements Comparable<User> {

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
			  
		  return this.name.compareToIgnoreCase(user.getName()); 
		}
		 
	}
}
