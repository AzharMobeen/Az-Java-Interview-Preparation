package com.az.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// 	Best implementation of Set is HashSet
//	HashSet have a implementation of HashMap in java 8
// 	No ordering in Set
// 	No Duplication in Set
// 	No indexing
// 	Faster than List because no indexing. 

public class CollectionSetDemo {


	private Set<User> userList = new HashSet<>();
	private Set<User> userList2 = new HashSet<>();
	private Set<Integer> sequre = new HashSet<>();
	private Set<Integer> cube = new HashSet<>();
	
	public static void main(String[] args) {

		CollectionSetDemo collectionListDemo = new CollectionSetDemo();
		
		collectionListDemo.generateDumyUserList();		
		
		collectionListDemo.printUserList(collectionListDemo.userList);
		System.out.println("\n**************Shuffle List*********************");
		
		collectionListDemo.printUserList(collectionListDemo.userList);
		System.out.println("\n************** Min and Max *********************");
		// Min and Max item needs Comparable Interfaces and toCompareMethod
		CollectionSetDemo.User minUser = Collections.min(collectionListDemo.userList);
		CollectionSetDemo.User maxUser = Collections.max(collectionListDemo.userList);
		System.out.println("Min "+minUser.toString());
		System.out.println("Max "+maxUser.toString());
		System.out.println("\n************** Union and Intersection of SET *********************");
		
		for (int i = 1; i<=100; i++)  {
			collectionListDemo.sequre.add(i*i);
			collectionListDemo.cube.add(i*i*i);
		}
		
		Set<Integer> unionList = collectionListDemo.unionMethod(); 
		System.out.println("Union Set Size :: "+unionList.size());
		Set<Integer> intersectionList = collectionListDemo.intersectionMethod(); 
		System.out.println("intersection Set Size :: "+intersectionList.size());

	}
	
	public void printUserList(Set<CollectionSetDemo.User> userList) {
		userList.forEach(user->System.out.print("\t"+user.getName()+"|"+user.getId()));
	}
	
	public Set<Integer> unionMethod(){
		
		Set<Integer> union = new HashSet<>(this.sequre);
		union.addAll(this.cube);
		System.out.println("union elements");
		for (int integer : union) {
			System.out.println(Math.cbrt(integer));
		}
		return union;
	}
	
	public Set<Integer> intersectionMethod(){
		
		Set<Integer> union = new HashSet<>(this.sequre);
		union.retainAll(this.cube);
		System.out.println("intersection elements");
		for (int integer : union) {
			System.out.println(Math.sqrt(integer));
		}
		return union;
	}
	
	
	private void addUser(User user) {

		if(userList.isEmpty() || userList.size()<=50)
			userList.add(user);
		else
			userList2.add(user);
	}			
	
	public void generateDumyUserList() {
		for(int i = 1; i<=50;i++) {
			if(i<10)
				this.addUser(new User("AZ-0"+i+"-A", i));
			else
				this.addUser(new User("AZ-"+i+"-A", i));
		}
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cube == null) ? 0 : cube.hashCode());
		result = prime * result + ((sequre == null) ? 0 : sequre.hashCode());
		result = prime * result + ((userList == null) ? 0 : userList.hashCode());
		result = prime * result + ((userList2 == null) ? 0 : userList2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectionSetDemo other = (CollectionSetDemo) obj;
		if (cube == null) {
			if (other.cube != null)
				return false;
		} else if (!cube.equals(other.cube))
			return false;
		if (sequre == null) {
			if (other.sequre != null)
				return false;
		} else if (!sequre.equals(other.sequre))
			return false;
		if (userList == null) {
			if (other.userList != null)
				return false;
		} else if (!userList.equals(other.userList))
			return false;
		if (userList2 == null) {
			if (other.userList2 != null)
				return false;
		} else if (!userList2.equals(other.userList2))
			return false;
		return true;
	}
	
}
