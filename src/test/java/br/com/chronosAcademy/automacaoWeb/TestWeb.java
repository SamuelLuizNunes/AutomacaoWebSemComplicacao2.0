package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TestWeb {
    Driver driverWeb;
    PrincipalPage pricipalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaDriver(){
        driverWeb = new Driver("chrome");
        driverWeb.getDriver().get("https://www.chronosacademy.com.br");
        pricipalPage = new PrincipalPage(driverWeb.getDriver());
        cursoPage = new CursoPage(driverWeb.getDriver());
    }

    @After
    public void finalizaDriver(){
        driverWeb.getDriver().quit();
    }

    @Test
    public void primeiroTeste(){
        Assert.assertEquals("Porque Tempo É Conhecimento", pricipalPage.getTitulo());
    }

    @Test
    public void segundoTeste(){
        pricipalPage.clickBotao();
        Assert.assertEquals("Conheça todos os nossos cursos", cursoPage.getTitulo2());
    }




}
