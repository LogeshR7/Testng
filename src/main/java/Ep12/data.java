package Ep12;

public class data {
	@org.testng.annotations.DataProvider(name="login",indices = {0})
	public String[][] data() {
		String[][]da=new String[2][2];
		da[0][0]="dosth";
		da[0][1]="itsmedosth";
		
		da[1][0]="ragu";
		da[1][1]="ragu@123";
		return da;
	}
	
	
	
	

}
