package co.com.choucair.certification.RetoLatam.task;

import co.com.choucair.certification.RetoLatam.userinterface.LatamLinkCode;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class LinkCode implements Task {

    public static LinkCode the() {
        return Tasks.instrumented(LinkCode.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LatamLinkCode.LINK_CODE));
    }
}
