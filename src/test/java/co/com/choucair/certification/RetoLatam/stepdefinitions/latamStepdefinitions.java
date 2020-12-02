package co.com.choucair.certification.RetoLatam.stepdefinitions;

import co.com.choucair.certification.RetoLatam.questions.Answer;
import co.com.choucair.certification.RetoLatam.task.LinkCode;
import co.com.choucair.certification.RetoLatam.task.MenuMyTrips;
import co.com.choucair.certification.RetoLatam.task.OpenUp;
import co.com.choucair.certification.RetoLatam.task.SubMenuDataTrip;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class latamStepdefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Ana wants to enter the latam page$")
    public void thanAnaWantsToEnterTheLatamPage() {
        OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.thePage(), MenuMyTrips.the());

    }

    @When("^you enter the link where to find them$")
    public void youEnterTheLinkWhereToFindThem() {
        OnStage.theActorInTheSpotlight().attemptsTo(SubMenuDataTrip.the(), LinkCode.the());

    }

    @Then("^validate the size (.*) of reservation code$")
    public void validateTheReservationCode(int size) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(size)));

    }
}
