package co.com.accenture.automation.screenplaychallenge.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;


@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas/necesidades/carro-moto")
public class CarroMotoPage extends PageObject {

	public static final Target SIMULA_TUS_AHORROS_OPTION = Target.the("Option that link to Simula tus ahorros")
			.located(By.xpath("//*[@id=\"wizard1\"]/div/div[1]/div/div/div[1]/p[2]/strong/a"));

}
