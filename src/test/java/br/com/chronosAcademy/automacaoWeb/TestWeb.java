package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeb {
    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaDriver(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
    }
    @After
    public void finalizaDriver(){
        driver.quit();
    }
    @Test
    public void primeiroTeste(){
        String xPathTitulo = "//section[2]//h4";
        WebElement txtTitulo =  driver.findElement(By.xpath(xPathTitulo));
        Assert.assertEquals("Porque Tempo É Conhecimento", txtTitulo.getText());
    }

    @Test
    public void deveClicarLink(){
        String botao = "//section[2]//div[3]//a";
        driver.findElement(By.xpath(botao)).click();
        String txtConhecaCursos = "//*[@id=\"block-214\"]/div/div/div/div[1]/div/div";
        Assert.assertEquals("Conheça todos os nossos cursos",
                driver.findElement(By.xpath(txtConhecaCursos)).getText());
    }

}
