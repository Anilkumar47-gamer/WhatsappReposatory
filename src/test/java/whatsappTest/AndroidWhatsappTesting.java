package whatsappTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidWhatsappTesting {

	static AndroidDriver<MobileElement>driver;
	@BeforeSuite
		public void lunchWhatsApp() throws MalformedURLException {
	DesiredCapabilities caps=	 new DesiredCapabilities(); 
	
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 12");
	caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\hp\\Desktop\\javaworks\\MobileTesting\\Whatsapp\\apps\\PLAYit.lnk");
	caps.setCapability(MobileCapabilityType.UDID, "49c3e8db90dd");
	
	
	@SuppressWarnings("deprecation")
	URL ur= new URL("http://127.0.0.1:4723/wd/hub");
	
	driver =new AndroidDriver<MobileElement>(ur,caps);
	}
	
	@Test
	public void start() {
		System.out.println("pass");
	}
	
	@AfterSuite
	public void close() {
		System.out.println("close ");
	}
	
	
}
