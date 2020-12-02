package co.com.choucair.certification.RetoLatam.task;

import co.com.choucair.certification.RetoLatam.userinterface.LatamPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private LatamPage latamPage;


    public static OpenUp onThe() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(latamPage));

    }
}
