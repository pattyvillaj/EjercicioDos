package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamDataTrip {
    public static final Target DATA_TRIP = Target.the("Data the trip").located(By.xpath("//span[text()='Ingresa con los datos de tu viaje']"));
}
