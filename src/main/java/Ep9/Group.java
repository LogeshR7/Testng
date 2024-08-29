package Ep9;

import org.testng.annotations.Test;

public class Group {
	@Test(groups= {"smoke"})
	public void login() {
		System.out.println("Login sucessfull");
	}
	@Test(groups= {"sanity"})
	public void enterthehomescreen() {
		System.out.println("Home sucessfull");
	}

	@Test()
	public void addToCart() {
		System.out.println("Addsucessfull");
	}

	@Test()
	public void EnterAdress() {
		System.out.println("EnterAdress");
	}
	
	@Test()
	public void signout() {
		System.out.println("SignOut sucessfull");
	}
}
