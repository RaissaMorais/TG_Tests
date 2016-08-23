package myTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class ClassTest {
	
	@Test
	public void ladosTeste() throws MalformedURLException {
		// caminho da aplicacao
		String mensagem;
		File fileDirectory = new File("C:/Ferramentas-Teste/Apks");
		File fileName = new File(fileDirectory,"MyApplication.apk");
		
		//Set Desired Capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		capabilities.setCapability(MobileCapabilityType.APP,fileName.getAbsolutePath());
		
		//Open connection with server
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.findElementById("com.example.leopoldomt.myapplication:id/lado1").sendKeys("3");
		driver.findElementById("com.example.leopoldomt.myapplication:id/lado2").sendKeys("3");
		driver.findElementById("com.example.leopoldomt.myapplication:id/lado3").sendKeys("3");
		driver.findElementById("com.example.leopoldomt.myapplication:id/botao").click();
		mensagem = driver.findElementById("com.example.leopoldomt.myapplication:id/resultado").getText();
		
		Assert.assertEquals("Tudo ok!", mensagem);
		
		
	}

}
