package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamLinkCode extends PageObject {


    public static final Target LINK_CODE = Target.the(" Link of Code").located(By.xpath("//a[@data-testid='undefined-dialog-open-link']//span[1]"));
}
