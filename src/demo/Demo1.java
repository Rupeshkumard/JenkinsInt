package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupesh Kumar D\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		String s1 = driver.getTitle();
		System.out.println(s1);
		driver.findElement(By.xpath("//a[.='Download']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
