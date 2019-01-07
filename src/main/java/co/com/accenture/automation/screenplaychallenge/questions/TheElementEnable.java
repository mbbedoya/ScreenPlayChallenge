package co.com.accenture.automation.screenplaychallenge.questions;

import co.com.accenture.automation.screenplaychallenge.userinterfaces.SimuladorDeAhorroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.SelectedStatus;;

public class TheElementEnable implements Question<String> {

	public static TheElementEnable is() {

		return new TheElementEnable();
	}

	@Override
	public String answeredBy(Actor actor) {

		if (SelectedStatus.of(SimuladorDeAhorroPage.SIMULA_TUS_AHORROS_SEND_FORM_BUTTON).viewedBy(actor).asString()
				.equals("false")) {
			return "It is not enabled";
		} else {
			return "Enabled";
		}

	}

}
