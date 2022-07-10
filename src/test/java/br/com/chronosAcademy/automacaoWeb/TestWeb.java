package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeb {

    @Test
    public void primeiroTeste(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");

        String xPathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo =  driver.findElement(By.xpath(xPathTitulo));
        Assert.assertEquals("Porque Tempo É Conhecimento", txtTitulo.getText());
        driver.quit();
    }

    @Test
    public void deveClicarBotao(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br/");
        String botao = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a";
        driver.findElement(By.xpath(botao)).click();
        String txtConhecaCursos = "//*[@id=\"block-214\"]/div/div/div/div[1]/div/div";
        Assert.assertEquals("Conheça todos os nossos cursos", driver.findElement(By.xpath(txtConhecaCursos)).getText());
        driver.quit();
    }

















}
