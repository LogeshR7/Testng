package DynamicExcel;

import org.testng.annotations.DataProvider;

public class data {
	@DataProvider(name="logins")
	String[][] kim() throws Exception {
		
		String[][] kurepu = part2.excel();
		return kurepu;
		
	}
	

}
