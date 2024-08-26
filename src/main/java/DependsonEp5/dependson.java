package DependsonEp5;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class dependson {
	@Test()
	public void login() {
		System.out.println("Login sucessfull");
		
	}
	@Test(dependsOnMethods="Dependson.dependson.login")
	public void enterthehomescreen() {
		System.out.println("Home sucessfull");
	}

	@Test(dependsOnMethods="enterthehomescreen")
	public void addToCart() {
		System.out.println("Addsucessfull");
		
	}

	@Test(dependsOnMethods="addToCart")
	public void EnterAdress() {
		System.out.println("EnterAdress");
		throw new NoSuchElementException("onnu illa");
	}

	@Test(dependsOnMethods="EnterAdress")
	public void signout() {
		System.out.println("SignOut sucessfull");
	}

}
