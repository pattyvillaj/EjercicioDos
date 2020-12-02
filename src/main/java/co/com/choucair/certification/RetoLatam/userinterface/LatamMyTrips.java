package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamMyTrips extends PageObject {

    public static final Target MENU_MYTRIPS= Target.the("Menu my trips").located(By.xpath("//a[@class='sc-kUaPvJ jSdLHl']"));
}
