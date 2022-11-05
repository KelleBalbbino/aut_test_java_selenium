package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import util.Elements;

public class BasePage extends Elements {


    public static void click(By by) {
        waitElement(by);
        element(by).click();
    }


    public static void sendKeys(By by, String texto) {
        waitElement(by);
        element(by).sendKeys(texto);
    }


    public static String lerText(By by){
        waitElement(by);
        return element(by).getText();
    }

    public void limparCampo (By by){
        for(int i = 0; i < 20; i++) {
            element(by).sendKeys(Keys.BACK_SPACE);
        }
    }



}
