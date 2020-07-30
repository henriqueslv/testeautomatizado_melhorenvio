package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnderecoPage {
    private WebDriver driver;

    private By cep = By.id("iptCep");
    private By numeroCasa = By.id("iptNumero");
    private By btnAvancar = By.className("btnAvancar");

    public EnderecoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inserirCep(String string){
        driver.findElement(cep).clear();
        driver.findElement(cep).sendKeys(string);
    }

    public void inserirNumeroCasa(String string){
        driver.findElement(numeroCasa).clear();
        driver.findElement(numeroCasa).sendKeys(string);
    }

    public ConfirmacaoPage clicarAvancar(){
        driver.findElement(btnAvancar).click();
        return new ConfirmacaoPage(driver);
    }

}