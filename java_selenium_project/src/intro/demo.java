package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\K NageshKumar\\eclipse-workspace\\java_selenium_project\\all_necessary_file\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\K NageshKumar\\eclipse-workspace\\java_selenium_project\\all_necessary_file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
////		
		
//		System.setProperty("webdriver.ie.driver",
//				"C:\\Users\\K NageshKumar\\eclipse-workspace\\java_selenium_project\\all_necessary_file\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
		
//		
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\K NageshKumar\\eclipse-workspace\\java_selenium_project\\all_necessary_file\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		
//		
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
