package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmacaoPage {
    private WebDriver driver;

    private By mensagemConfirmacao = By.cssSelector(".form .wrapper p");

    private By btnComecar = By.cssSelector(".buttons a");

    public ConfirmacaoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String mensagemConfirmacao(){
        return driver.findElement(mensagemConfirmacao).getText();
    }

    public PerfilPage clicarBotaoComecar(){
        driver.findElement(btnComecar).click();
        return new PerfilPage(driver);
    }
}
