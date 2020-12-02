package co.com.choucair.certification.RetoLatam.task;

import co.com.choucair.certification.RetoLatam.userinterface.LatamDataTrips;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DataMyTrip implements Task {

    public static DataMyTrip the() {
        return Tasks.instrumented(DataMyTrip.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LatamDataTrips.DATA_TRIPS));

    }
}
