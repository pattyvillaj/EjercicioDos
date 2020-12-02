package co.com.choucair.certification.RetoLatam.stepdefinitions;

import co.com.choucair.certification.RetoLatam.questions.Answer;
import co.com.choucair.certification.RetoLatam.task.DataTrip;
import co.com.choucair.certification.RetoLatam.task.LinkCode;
import co.com.choucair.certification.RetoLatam.task.MyTrips;
import co.com.choucair.certification.RetoLatam.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LatamStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Ana wants enter the Latam page$")
    public void thanAnaWantsEnterTheLatamPage() {
        OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.onThe(), MyTrips.the());

    }


    @When("^she enter where to find them$")
    public void sheEnterWhereToFindThem() {
        OnStage.theActorInTheSpotlight().attemptsTo(DataTrip.the(), LinkCode.the());

    }

    @Then("^validate the size (.*) of reservation code$")
    public void validateTheSizeOfReservationCode(int size) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.onThe(size)));

    }
}
