package co.com.accenture.automation.screenplaychallenge.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.accenture.automation.screenplaychallenge.exceptions.NoMatchingElementIsVisible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class VerifyTheElement implements Task {

	private Target target;

	public VerifyTheElement(Target target) {

		this.target = target;
	}

	@Step("{0} verify if the element '#target' is visible")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.should(seeThat(the(target), isVisible()).orComplainWith(NoMatchingElementIsVisible.class,
				getMissingElementMessage()));

	}

	public String getMissingElementMessage() {
		return String.format("Missing element or is not visible '%s'", target);
	}

	public static VerifyTheElement visibilityOf(Target target) {

		return Tasks.instrumented(VerifyTheElement.class, target);

	}
}
