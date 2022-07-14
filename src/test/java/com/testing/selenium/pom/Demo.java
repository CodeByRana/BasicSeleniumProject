package com.testing.selenium.pom;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test(priority=1)
	public void createUser(){
	System.out.println("createUser...user created successufuly");
	Assert.fail();
	}

	@Test(priority=3, dependsOnMethods="createUser")
	public void deleteUser(){
	System.out.println("deleteUser...");
	}

}
