package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleAutomationFUN {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/deepti/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		/*
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("roblox" + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/table/tbody/tr[2]/td[1]/div/h3/a")).click();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("HelloIshaanMandore");
		driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("12345678@" + Keys.ENTER);
		*/


		//driver.close();
	

	}

}

/*
 * Open Google [Done]
 * Search a term Click on a fifth line
 */
