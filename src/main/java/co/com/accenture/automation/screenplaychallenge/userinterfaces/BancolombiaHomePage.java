package co.com.accenture.automation.screenplaychallenge.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/acerca-de")
public class BancolombiaHomePage extends PageObject {

	public static final Target PERSONAS_BUTTON = Target.the("The button to link to the Personas page")
			.located(By.id("linkPersonas"));

	/**
	 * Here in this page we can see the application of the "Single responsibility
	 * principle" because this class is only for mapping the elements of this page,
	 * this is its responsibility.
	 */
}
