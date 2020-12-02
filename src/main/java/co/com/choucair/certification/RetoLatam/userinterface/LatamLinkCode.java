package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamLinkCode extends PageObject {

    public static final Target SPAN_LINKCODE = Target.the("Link where to find it ").located(By.xpath("//a[@data-testid='undefined-dialog-open-link']//span[1]"));
}
