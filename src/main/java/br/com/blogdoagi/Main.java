package br.com.blogdoagi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
       static String URL_BLOG = "https://blogdoagi.com.br/";
    public static void  abrindonavegador(){
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        navegador.get(URL_BLOG);
    }
}