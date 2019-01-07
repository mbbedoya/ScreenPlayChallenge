package co.com.accenture.automation.screenplaychallenge.questions;

import co.com.accenture.automation.screenplaychallenge.userinterfaces.SimuladorDeAhorroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

public class TheElementVisibility implements Question<String> {

	public static TheElementVisibility is() {

		return new TheElementVisibility();
	}

	@Override
	public String answeredBy(Actor actor) {

		if (CurrentVisibility.of(SimuladorDeAhorroPage.SIMULA_TUS_AHORROS_SEND_FORM_BUTTON).viewedBy(actor).asString()
				.equals("true")) {
			return "Visible";
		} else {
			return "Is not visible";
		}

	}

}
