package co.com.accenture.automation.screenplaychallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.WebDriver;

import co.com.accenture.automation.screenplaychallenge.interactions.ChangeTo;

public class Switch implements Task {

	private WebDriver browser;

	public Switch(WebDriver browser) {
		this.browser = browser;
	}

	@Override
	@Step("{0} switch to the active windows")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(ChangeTo.Windows(browser));

	}

	public static Switch to(WebDriver browser) {

		return Tasks.instrumented(Switch.class, browser);

	}
}
