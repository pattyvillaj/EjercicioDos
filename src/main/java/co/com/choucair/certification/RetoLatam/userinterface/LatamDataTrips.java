package co.com.choucair.certification.RetoLatam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LatamDataTrips {
    public static final Target DATA_TRIPS = Target.the("Data the trips").located(By.xpath("//span[text()='Ingresa con los datos de tu viaje']"));
}
