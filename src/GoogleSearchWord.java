import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class GoogleSearchWord {
    public static void main(String[] args){

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.google.com/");
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver1.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Who's your daddy?");
        driver1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        driver1.close();
    }
}
