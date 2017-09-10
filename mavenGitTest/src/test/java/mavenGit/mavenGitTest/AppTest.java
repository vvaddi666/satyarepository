package mavenGit.mavenGitTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

public static void main(String[] args) {
	WebDriver driver;
String FirefoxDriverPath = "E:\\Selenium\\geckodriver.exe";
System.setProperty("webdriver.gecko.driver", FirefoxDriverPath);


// create a new instance of the Firefox driver
driver = new FirefoxDriver();
driver.get("http://www.google.com");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

}
}

