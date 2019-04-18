 package com.guideme.restapidemo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class SpottrUser{
	
	private String email, password, bio, gender, preferredGender, location;
	// Still have to add vector of genres and matchIDs
	private int age; 
	
	public SpottrUser()
	{ 
		
		
	}  

	public SpottrUser(String username, String password, String Bio , String gender, String preferredGender, String location, int age) {
		super();
		this.email = username;
		this.password = password;
		this.bio = Bio;
		this.gender = gender;
		this.preferredGender = preferredGender;
		this.location = location;
		this.age = age;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void setBio(String bio)
	{
		this.bio = bio;
		
	}
	
	public String getBio()
	{
		return this.bio;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public void setPreferredGender(String preferredGender)
	{
		this.preferredGender = preferredGender;
	}
	
	public String getPreferredGender()
	{
		return this.preferredGender;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
		
	}
	
}
