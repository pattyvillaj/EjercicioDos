package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamDataTrip {

    public static final Target SPAN_DATATRIP = Target.the("sub menu data trip").located(By.xpath("//span[text()='Ingresa con los datos de tu viaje']"));
}
