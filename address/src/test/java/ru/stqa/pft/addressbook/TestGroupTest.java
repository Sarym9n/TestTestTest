package ru.stqa.pft.addressbook;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class TestGroupTest {
  private WebDriver wd;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    wd = new ChromeDriver();
    js = (JavascriptExecutor) wd;
    vars = new HashMap<String, Object>();
    wd.get("http://localhost/addressbook/group.php");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.manage().window().setSize(new Dimension(822, 824));
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.name("pass")).sendKeys(Keys.ENTER);
  }

  @After
  public void tearDown() {
    wd.quit();
  }
  @Test
  public void testGroup() {
    wd.findElement(By.name("new")).click();
    wd.findElement(By.name("group_name")).click();
    fillGroupForm("esT", "test1", "test12");
    wd.findElement(By.name("submit")).click();
    wd.findElement(By.linkText("groups")).click();
    wd.findElement(By.linkText("Logout")).click();
  }

  private void fillGroupForm(String name, String hedder, String futer) {
    wd.findElement(By.name("group_name")).sendKeys(name);
    wd.findElement(By.name("group_header")).sendKeys(hedder);
    wd.findElement(By.name("group_footer")).sendKeys(futer);
  }
}
