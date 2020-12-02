package co.com.choucair.certification.RetoLatam.task;

import co.com.choucair.certification.RetoLatam.userinterface.LatamMyTrips;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class MenuMyTrips implements Task {


    public static MenuMyTrips the() {
        return Tasks.instrumented(MenuMyTrips.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LatamMyTrips.MENU_MYTRIPS));

    }
}
