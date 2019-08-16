package com.google.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class AgregoAlCarritoQuestion implements Question<String>{
	private Target label;

	public AgregoAlCarritoQuestion(Target Label) {
		this.label=Label;
	}
	public String answeredBy(Actor actor) {
		BrowseTheWeb.as(actor).getDriver().switchTo().activeElement();
		return label.resolveFor(actor).getTextValue();
	}

	public static AgregoAlCarritoQuestion ElTexto(Target Label) {
		return new AgregoAlCarritoQuestion(Label);
	}

}
