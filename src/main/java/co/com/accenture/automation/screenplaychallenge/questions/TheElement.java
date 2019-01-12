package co.com.accenture.automation.screenplaychallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.accenture.automation.screenplaychallenge.exceptions.NoMatchingElementIsVisible;

public class TheElement implements Question<Boolean> {

	private Target target;

	public TheElement(Target target) {

		this.target = target;
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		if (CurrentVisibility.of(target).viewedBy(actor).asString().equals("true")) {
			return the(target).answeredBy(actor).isCurrentlyVisible();
		} else {
			throw new NoMatchingElementIsVisible("The element " + target +" is not visible", null);
		}

	}

	public static TheElement isDisplayed(Target target) {
		return new TheElement(target);
	}
}