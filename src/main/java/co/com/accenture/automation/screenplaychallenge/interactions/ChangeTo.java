package co.com.accenture.automation.screenplaychallenge.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import org.openqa.selenium.WebDriver;

public class ChangeTo implements Interaction {

	private WebDriver browser;

	public ChangeTo(WebDriver browser) {
		this.browser = browser;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		for (String winHandle : browser.getWindowHandles()) {
			browser.switchTo().window(winHandle);
		}

	}

	public static ChangeTo Windows(WebDriver browser) {

		return Tasks.instrumented(ChangeTo.class, browser);
	}

}