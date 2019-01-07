package co.com.accenture.automation.screenplaychallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class ClickTo implements Task {

	public ClickTo(Target target) {

		this.target = target;
	}

	private Target target;

	@Override
	@Step("{0} click the button '#target' ")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(target));

	}

	public static ClickTo the(Target target) {

		return Tasks.instrumented(ClickTo.class, target);

	}

}
