package co.com.accenture.automation.screenplaychallenge.tasks;

import co.com.accenture.automation.screenplaychallenge.userinterfaces.SimuladorDeAhorroPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class SwitchTo implements Task {

	private PageObject page;

	public SwitchTo(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} opens the browser on the '#page' ")
	public <T extends Actor> void performAs(T actor) {

		PageObject newPage = page.switchToPage(SimuladorDeAhorroPage.class);

		actor.attemptsTo(Open.browserOn(newPage));
		
		////actor.attemptsTo(Switch.toWindow("Simulador Ahorro e Inversión para Carro ó Moto"));

		// actor.attemptsTo(Switch.toWindow(page.getTitle()));

		// actor.attemptsTo(Switch.toWindow("https://www.grupobancolombia.com/wps/portal/personas/necesidades/carro-moto/simulador-ahorro-inversion"));

	}

	public static SwitchTo page(PageObject page) {

		return Tasks.instrumented(SwitchTo.class, page);
	}
}
