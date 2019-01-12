package co.com.accenture.automation.screenplaychallenge.stepdenitions;

/**
 * @author michael.bedoya.cano
 */

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;
import co.com.accenture.automation.screenplaychallenge.questions.TheElement;
import co.com.accenture.automation.screenplaychallenge.questions.TheMessage;
import co.com.accenture.automation.screenplaychallenge.tasks.GoTo;
import co.com.accenture.automation.screenplaychallenge.tasks.OpenTheBrowser;
import co.com.accenture.automation.screenplaychallenge.tasks.Switch;
import co.com.accenture.automation.screenplaychallenge.tasks.VerifyTheElement;
import co.com.accenture.automation.screenplaychallenge.userinterfaces.BancolombiaHomePage;
import co.com.accenture.automation.screenplaychallenge.userinterfaces.CarroMotoPage;
import co.com.accenture.automation.screenplaychallenge.userinterfaces.PersonasPage;
import co.com.accenture.automation.screenplaychallenge.userinterfaces.SimuladorDeAhorroPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;

public class BancolombiaSimulationStepDefinitios {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor michael = Actor.named("Michael");
	private BancolombiaHomePage bancolombiaHomePage;

	@Before
	public void setUp() {
		hisBrowser.manage().window().maximize();
		michael.can(BrowseTheWeb.with(hisBrowser));

	}

	@Given("^that I am in the form page$")
	public void thatIAmInTheFormPage() throws Exception {
		michael.wasAbleTo(OpenTheBrowser.on(bancolombiaHomePage), 
				GoTo.the(BancolombiaHomePage.PERSONAS_BUTTON),
				GoTo.the(PersonasPage.NECESIDADES_BUTTON), 
				GoTo.the(PersonasPage.CARRO_O_MOTO_OPTION),
				GoTo.the(CarroMotoPage.SIMULA_TUS_AHORROS_OPTION), 
				Switch.to(hisBrowser));
	}

	@When("^I click the button to sent the information$")
	public void iClickTheButtonToSentTheInformation() throws Exception {
		michael.attemptsTo(VerifyTheElement.visibilityOf(SimuladorDeAhorroPage.SIMULA_TUS_AHORROS_SEND_FORM_BUTTON),
				GoTo.the((SimuladorDeAhorroPage.SIMULA_TUS_AHORROS_SEND_FORM_BUTTON)));

	}

	@SuppressWarnings("unchecked")
	@Then("^I hope to see the button disable$")
	public void iHopeToSeeTheButtonDisable() throws Exception {

		michael.should(seeThat(TheElement.isDisplayed(SimuladorDeAhorroPage.SIMULA_TUS_AHORROS_SEND_FORM_BUTTON)));
		michael.should(seeThat(the(SimuladorDeAhorroPage.SIMULA_TUS_AHORROS_SEND_FORM_BUTTON), isVisible(),
				                                                                              isCurrentlyVisible(), 
				                                                                              isEnabled(), 
				                                                                              isCurrentlyEnabled()));

	}

	@When("^I see the fields below$")
	public void iSeeTheFieldsBelow() throws Exception {
		michael.attemptsTo(GoTo.the((SimuladorDeAhorroPage.SIMULA_TUS_AHORROS_SEND_FORM_BUTTON)));
	}

	@Then("^I hope to see the error message \"([^\"]*)\" for every field$")
	public void iHopeToSeeTheErrorMessageForEveryField(String errorMessage) throws Exception {
		michael.should(
				seeThat(TheMessage.of(SimuladorDeAhorroPage.PARA_QUE_QUIERES_AHORRAR_MESSAGE), equalTo(errorMessage)));
	}

	@Pending
	@When("^I try to fill the field Para que quieres ahorrar \"([^\"]*)\" with wrong information$")
	public void iTryToFillTheFieldParaQueQuieresAhorrarWithWrongInformation(String errorMessage) throws Exception {

	}

	@Pending
	@Then("^I hope to see the error message (.*) for this field$")
	public void iHopeToSeeTheErrorMessageForThisField(String errorMessage) throws Exception {

	}

}
