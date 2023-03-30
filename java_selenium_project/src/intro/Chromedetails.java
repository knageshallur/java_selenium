package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedetails {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\K NageshKumar\\eclipse-workspace\\java_selenium_project\\all_necessary_file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
driver.get("https://www.ecoders.in");
		
		driver.navigate().to("https://www.ecoders.in");
		
		Thread.sleep(1000);
		
		String s1=driver.getTitle();
		System.out.println(s1);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String ps=driver.getPageSource();
		System.out.println(ps);
		
		driver.close();
	
	}

}
