package co.com.accenture.automation.screenplaychallenge.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas/necesidades/carro-moto/simulador-ahorro-inversion")
public class SimuladorDeAhorroPage extends PageObject {

	public static final Target SIMULA_TUS_AHORROS_SEND_FORM_BUTTON = Target.the("Buttom to send the firts form")
			.located(By.xpath("//*[@id=\"browser-Off\"]/div/div/div[1]/form/div[8]"));

	public static final Target PARA_QUE_QUIERES_AHORRAR_MESSAGE = Target
			.the("Message that says if is there a problem with the field ¿Para que quieres ahorrar?")
			.located(By.xpath("//*[@id=\"browser-Off\"]/div/div/div[1]/form/div[2]/div/div"));

	public void simuladorDeAhorroPage() {

		SimuladorDeAhorroPage forgotPasswordPage = this.switchToPage(SimuladorDeAhorroPage.class);
		forgotPasswordPage.open();

	}
}
