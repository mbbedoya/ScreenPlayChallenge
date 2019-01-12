package co.com.accenture.automation.screenplaychallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentlyEnabled;
import net.serenitybdd.screenplay.targets.Target;;

public class TheElementEnable implements Question<String> {

	private Target target;

	public TheElementEnable(Target target) {

		this.target = target;
	}

	public static TheElementEnable of(Target target) {

		return new TheElementEnable(target);
	}

	@Override
	public String answeredBy(Actor actor) {

		if (CurrentlyEnabled.of(target).viewedBy(actor).asString().equals("false")) {
			return "It is not enabled";
		} else {
			return "Enabled";
		}

	}

}
