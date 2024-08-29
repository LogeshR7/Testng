package Ep7;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class EnableAlwaysrunDescrition {
	@Test(enabled=false)
	public void login() {
		System.out.println("Login sucessfull");
		
	}
	@Test()
	public void enterthehomescreen() {
		System.out.println("Home sucessfull");
		throw new NoSuchElementException("Achoo");
	}

	@Test(dependsOnMethods="enterthehomescreen",alwaysRun=true)
	public void addToCart() {
		System.out.println("Addsucessfull");
		
	}

	@Test()
	public void EnterAdress() {
		System.out.println("EnterAdress");
		
	}

	@Test(description="loke mamu")
	public void signout() {
		System.out.println("SignOut sucessfull");
	}


}
