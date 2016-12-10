package com.khasim;

import org.testng.annotations.Test;

public class AppTest {
	
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("login done");
	}
	
	@Test(priority=5)
	public void registrationTest()
	{
		System.out.println("registration");
	}
	
	@Test(priority=2)
	public void logoutTests()
	{
		System.out.println("logout");
	}
	

}
