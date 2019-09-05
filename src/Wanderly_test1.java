import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wanderly_test1 {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.wanderly.us/nurse");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/main/div/section[1]/div/div/a")).click();
		//Specialties
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[1]/div")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[1]/div/ul[1]/li/input")).sendKeys("Antepartum");
		WebDriverWait wait = new WebDriverWait(driver,11);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[1]/div/ul[2]/li/div")));
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[1]/div/ul[2]/li/div")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[1]/div/ul[1]/li[2]/input")).sendKeys("Dialysis");
		WebDriverWait wait2 = new WebDriverWait(driver,11);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[1]/div/ul[2]/li/div")));
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[1]/div/ul[2]/li/div")).click();
		//location
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[2]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/ul[1]/li/input")).sendKeys("California");
		WebDriverWait wait3 = new WebDriverWait(driver,11);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/ul[2]/li/div")));
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/ul[2]/li/div")).click();
        //Agencies
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[3]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/ul[1]/li/input")).sendKeys("Atlas Medstaff");
		WebDriverWait wait4=new WebDriverWait(driver,11);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/ul[2]/li/div")));
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/ul[2]/li/div")).click();
		Thread.sleep(5000);
		//pay rate and also cursor hold and move
		WebElement move= driver.findElement(By.xpath("//*[@id=\"desktop-mode\"]/div[2]/div/div/div[1]/div[4]/span/span[6]"));
		Actions act =new Actions(driver);
		act.clickAndHold(move).moveByOffset(40, 0).release(move).build().perform();
		Thread.sleep(5000);
		//calender
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[5]/div/div[1]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[8]/div[1]/table/tbody/tr[2]/td[4]")).click();
		//shift
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[6]/div/div[3]/label")).click();
		//result
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div[8]/button")).click();
		
		
	}

}
