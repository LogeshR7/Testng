package Ep13;

import org.testng.annotations.DataProvider;

public class data {

	@DataProvider(name="field")
	public String[][] data(){
		String[][] datas=new String[2][4];
		datas[0][0]="manamathain";
		datas[0][1]="kutty";
		datas[0][2]="jetty";
		datas[0][3]="himko";
		
		datas[1][0]="makata";
		datas[1][1]="gym";
		datas[1][2]="imi";
		datas[1][3]="pop";
		
		return datas;
	
}

}
