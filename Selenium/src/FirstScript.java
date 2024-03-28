import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class FirstScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\chara\\Downloads\\Firefox Setup 124.0.1.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\chara\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver1 = new FirefoxDriver();
        WebDriver driver2=new ChromeDriver();
        WebDriver driver3=new EdgeDriver();
        driver1.get("https://www.google.co.in/");
        driver2.get("https://www.youtube.com/");
        driver3.get("https://chat.openai.com/c/0db9ee4b-c3c4-41ae-afde-5db575a485a1");
    }
}

