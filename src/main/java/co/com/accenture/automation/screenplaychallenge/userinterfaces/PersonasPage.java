package co.com.accenture.automation.screenplaychallenge.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class PersonasPage extends PageObject {

	public static final Target NECESIDADES_BUTTON = Target.the("The button that opens Necesidades windows")
			.located(By.xpath("//a[@href='#necesidadesPersonas']"));

	public static final Target CARRO_O_MOTO_OPTION = Target.the("One of the needs options")
			.locatedBy("//*[@id=\"necesidadesPersonas\"]/div/div[1]/div[1]/div/div[7]/div/a");

}
