package co.com.choucair.certification.RetoLatam.task;

import co.com.choucair.certification.RetoLatam.userinterface.LatamMyTrips;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class MyTrips implements Task {

    public static MyTrips the() {
        return Tasks.instrumented(MyTrips.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LatamMyTrips.MY_TRIPS));

    }
}
