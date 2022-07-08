package COM.TEST;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import COM.PAGE_OBJECT.LoginPom;
import COM.UTILITY.BaseClass;

public class Test_001 extends BaseClass {

	
@Test

public void Test001() {
	
	LoginPom login=PageFactory.initElements(driver,LoginPom.class);
	login.getEmail_tex().sendKeys("chanchal");
	login.getPass_tex().sendKeys("12456");
	
}
	
@Test

public void Test002() {
	
	LoginPom login=PageFactory.initElements(driver,LoginPom.class);
	login.getEmail_tex().sendKeys("123054");
	login.getPass_tex().sendKeys("000225");
			
}

@Test

public void Test003() {
	
	LoginPom login=PageFactory.initElements(driver,LoginPom.class);
	login.getEmail_tex().sendKeys("1230542");
	login.getPass_tex().sendKeys("0002250");
}
}
