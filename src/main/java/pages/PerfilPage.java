package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerfilPage {
    private WebDriver driver;

    private By nomeMenu = By.cssSelector(".navHeader__item .userData .toggleUser");

    private By sair = By.cssSelector(".navHeader__item .subNav .subNav__item.subNav__item--logout a");

    public PerfilPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sair (){
        driver.findElement(nomeMenu).click();
        driver.findElement(sair).click();
    }
}
