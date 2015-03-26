package com.ipcs.model;

import java.util.HashSet;
import java.util.Set;

public class Person extends BasicObject{
	
	private String account_name;
	
	private String password_hash;
	
	private Set<Role> roles = new HashSet<Role>();
	
	private Contact contact;
	
	public Person(String name, String password){
		super();
		this.account_name = name;
		this.password_hash = password;
	}
	
	public Person(){
		super();
	}
	
	
	public String getAccount_name() {
		return account_name;
	}
	
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	
	public String getPassword_hash() {
		return password_hash;
	}
	
	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public void addRole(Role role){
		this.roles.add(role);
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int hashCode(){
		return 31*17+account_name.hashCode();
	}
	
	public boolean equals(Object obj){
		if (null ==obj)
			return false;
		if(this == obj)
			return true;
		if(obj.getClass() != Person.class)
			return false;
		Person person = (Person)obj;
		return person.getAccount_name().equals(this.account_name);
	}
	
	public String toString(){
		return "Account name is "+ account_name +super.toString();
	}
	

}
