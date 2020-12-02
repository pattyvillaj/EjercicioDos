package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamSixLetter {
    public static final Target NUMBER_CONFIRMATION = Target.the("Confirmation number").located(By.xpath("(//div[@class='sc-pJVLq dIjrXL']//span)[2]"));
}
