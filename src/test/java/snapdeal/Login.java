package snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
        driver.findElement(By.xpath("//span[@class='catText']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]")).click();
        Select dropdown = new Select(driver.findElement(By.xpath("//span[@class='sort-label'")));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]")).click();

	}

}