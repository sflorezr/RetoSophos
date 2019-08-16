package com.google.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.www.userinterfaces.HomeInterface;
public class SeleccionarCategoriaTask implements Task{
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomeInterface.NoGracias));
		actor.attemptsTo(Click.on(HomeInterface.Categorias));		
	}
	public static SeleccionarCategoriaTask SeleccionaCatergia() {
		return instrumented(SeleccionarCategoriaTask.class);
	}
}
