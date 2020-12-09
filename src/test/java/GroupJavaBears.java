import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GroupJavaBears extends BaseTest {

    @Test
    public void victoriaRogozhkina() {

        WebDriver driver = getDriver();
        driver.get("https://developer.mozilla.org/en-US/docs/Web/XPath/Functions");

        WebElement link = driver.findElement(By.xpath("//li/a[contains(text(), 'contains()')]"));
        link.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.mozilla.org/en-US/docs/Web/XPath/Functions/contains");
    }
    @Test
    public void Alex_Mack() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://en.wikipedia.org/wiki/Golden_Gate");

        WebElement title = driver.findElement(By.xpath("//span[@id='History']"));
        Assert.assertEquals(title.getText(), "History");

        Thread.sleep(3000);
    }

    @Test
    public void olgaGTest1() {

        WebDriver browser = getDriver();
        browser.get("https://korrespondent.net/");
        WebElement second_nav_link = browser.findElement(By.xpath("//div[@class='header-menu']//ul/li[3]/a"));

        Assert.assertEquals(second_nav_link.getText(), "УКРАИНА");
    }

    @Test
    public void olgaGTest2() {

        WebDriver browser = getDriver();
        browser.get("https://korrespondent.net/");

        WebElement second_nav_link = browser.findElement(By.xpath("//div[@class='header-menu']//ul/li[3]/a"));
        second_nav_link.click();
        Assert.assertEquals(browser.getCurrentUrl(), "https://korrespondent.net/ukraine/");

        WebElement caption_title = browser.findElement(By.xpath("//h1[@class='caption-title']"));
        Assert.assertEquals(caption_title.getText(), "НОВОСТИ УКРАИНЫ");
    }

    @Test
    public void olgaGTest3() {

        WebDriver browser = getDriver();
        browser.get("https://korrespondent.net/");

        WebElement nav_link = browser.findElement(By.xpath("//div[@class='header-menu']//b"));
        Assert.assertEquals(nav_link.getText(), "ВСЕ РАЗДЕЛЫ");
        nav_link.click();

        WebElement sitemap = browser.findElement(By.xpath("//div[@id='sitemap']"));
        Assert.assertTrue(sitemap.isDisplayed());
    }
}