package PriorityEp4;

import org.testng.annotations.Test;
                                                           //Uses graph thorey
public class priority {
	@Test(priority=-1)
	public void login() {
		System.out.println("Login sucessfull");
	}
	@Test(priority=0)
	public void enterthehomescreen() {
		System.out.println("Home sucessfull");
	}

	@Test(priority=1)
	public void addToCart() {
		System.out.println("Addsucessfull");
	}

	@Test(priority=2)
	public void EnterAdress() {
		System.out.println("EnterAdress");
	}

	@Test(priority=3)
	public void signout() {
		System.out.println("SignOut sucessfull");
	}


}
