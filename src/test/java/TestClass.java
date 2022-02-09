import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    @Test
    public void Webdrivergoogle () {

        WebDriver navegador = new ChromeDriver();
        navegador.get("http://localhost:4200/");

    }

}
