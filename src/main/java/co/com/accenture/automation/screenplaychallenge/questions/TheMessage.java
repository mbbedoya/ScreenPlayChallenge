package co.com.accenture.automation.screenplaychallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheMessage implements Question<String> {

	private static Target target;

	public static TheMessage of(Target target) {

		TheMessage.target = target;

		return new TheMessage();
	}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(target).viewedBy(actor).asString();
	}



}