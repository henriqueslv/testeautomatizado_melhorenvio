package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CadastroPage {
    private WebDriver driver;

    private By nome = By.id("iptNome");

    private By sobrenome = By.id("iptSobrenome");

    private By nomeDaLoja = By.id("iptNomeLoja");

    private By celular = By.id("iptCelular");

    private By cpf = By.id("iptCPF");

    private By dataDeNascimento = By.id("iptDtNascimento");

    private By ondeVoceVende = By.id("iptOndeVoceVende");

    private By vendasPorMes = By.id("iptMediaEnviosMensal");

    private By email = By.id("iptEmail");

    private By confirmarEmail = By.id("iptConfirmaEmail");

    private By senha = By.id("iptSenha");

    private By confirmarSenha = By.id("iptConfirmaSenha");

    private By aceitarTermos = By.cssSelector(".formLineBox .checkLine .inputBox label");

    private By avancar = By.className("btnAvancar");

    private By mensagemErro = By.className("errorText");


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }


    public void inserirSobreNome(String string) {
        driver.findElement(sobrenome).clear();
        driver.findElement(sobrenome).sendKeys(string);
    }

    public void inserirNome(String string) {
        driver.findElement(nome).clear();
        driver.findElement(nome).sendKeys(string);
    }

    public void inserirNomeDaLoja(String string) {
        driver.findElement(nomeDaLoja).clear();
        driver.findElement(nomeDaLoja).sendKeys(string);
    }

    public void inserirCelular(String string) {
        driver.findElement(celular).clear();
        driver.findElement(celular).sendKeys(string);
    }

    public void inserirCpf(String string) {
        driver.findElement(cpf).clear();
        driver.findElement(cpf).sendKeys(string);
    }

    public void inserirDataNascimento(String string) {
        driver.findElement(dataDeNascimento).clear();
        driver.findElement(dataDeNascimento).sendKeys(string);
    }

    public void ondeVoceVendeDropDown(String string) {
        driver.findElement(ondeVoceVende).clear();
        driver.findElement(ondeVoceVende).sendKeys(string);
        driver.findElement(ondeVoceVende).sendKeys(Keys.DOWN);
        driver.findElement(ondeVoceVende).sendKeys(Keys.ENTER);
    }

    public void vendasPorMes(String string) {
        driver.findElement(vendasPorMes).clear();
        driver.findElement(vendasPorMes).sendKeys(string);
        driver.findElement(vendasPorMes).sendKeys(Keys.DOWN);
        driver.findElement(vendasPorMes).sendKeys(Keys.ENTER);
    }

    public void inserirEmail(String string) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(string);
    }

    public void inserirConfirmacaoEmail(String string) {
        driver.findElement(confirmarEmail).clear();
        driver.findElement(confirmarEmail).sendKeys(string);
    }

    public void inserirSenha(String string) {
        driver.findElement(senha).clear();
        driver.findElement(senha).sendKeys(string);
    }

    public void inserirConfirmacaoSenha(String string) {
        driver.findElement(confirmarSenha).clear();
        driver.findElement(confirmarSenha).sendKeys(string);
    }

    public void aceitarTermos() {
        driver.findElement(aceitarTermos).click();
    }

    public EnderecoPage avancar() {
        driver.findElement(avancar).click();
        return new EnderecoPage(driver);
    }

    public String  mensagemDeErro() {
        return driver.findElement(mensagemErro).getText();
    }
}