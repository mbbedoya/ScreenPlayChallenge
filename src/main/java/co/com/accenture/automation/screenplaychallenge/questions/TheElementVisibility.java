package co.com.accenture.automation.screenplaychallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;

public class TheElementVisibility implements Question<String> {

	private Target target;

	public TheElementVisibility(Target target) {

		this.target = target;

	}

	public static TheElementVisibility of(Target target) {

		return new TheElementVisibility(target);
	}

	@Override
	public String answeredBy(Actor actor) {

		if (CurrentVisibility.of(target).viewedBy(actor).asString().equals("true")) {
			return "Visible";
		} else {
			return "Is not visible";
		}

	}

}
