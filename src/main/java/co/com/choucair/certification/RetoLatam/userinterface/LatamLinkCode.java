package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamLinkCode {
    public static final Target LINK_CODE = Target.the("Link the code").located(By.xpath("//a[@data-testid='undefined-dialog-open-link']//span[1]"));
}
