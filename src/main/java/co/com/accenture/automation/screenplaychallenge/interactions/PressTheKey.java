package co.com.accenture.automation.screenplaychallenge.interactions;

import java.awt.Robot;

import java.awt.event.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class PressTheKey implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);

		} catch (Exception e) {
		}

	}

	public static PressTheKey escape() {
		return Tasks.instrumented(PressTheKey.class);
	}

}
