package util;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.BaseSteps;

public class Elements extends BaseSteps {

    // Método para pegar um elemento
    public static WebElement element(By by){

        return driver.findElement(by);
    }

    // Metodo para esperar um elemento
    public static void waitElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
