package da;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
 public static void main(String args[]) {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\saran\\da\\drivers\\chromedriver.exe");
 WebDriver d= new ChromeDriver();
 d.get("https://github.com/");
 }
}
