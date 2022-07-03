package junits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ParameterProvideExample.class)

public class ChromeDriverParameterEx {
	
	
	@Test
	public void LoginTest(ChromeDriverParameterEx driver) {
		
		driver.get("https://www.simplilearn.com/");
		
	}

	private void get(String string) {
		// TODO Auto-generated method stub
		
	}
}
