package base;

import com.google.common.io.Files;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private static WebDriver driver;
    protected CadastroPage cadastroPage;

    @BeforeAll
    public static void inicializar(){
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\84\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeEach
    public void abrirPagina(){
        driver.get("https://sandbox.melhorenvio.com.br/cadastre-se");
        cadastroPage = new CadastroPage(driver);
    }

    public void capturarTela(String nome, String nomeDaLoja, String resultado){
        TakesScreenshot camera = (TakesScreenshot) driver;
        File capturaDeTela = camera.getScreenshotAs(OutputType.FILE);

        try {
            Files.move(capturaDeTela, new File("resources/screenshots/" + nome + "_" + nomeDaLoja + "_" + resultado + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @AfterAll
    public static void finalizar(){
        driver.quit();
    }


}
