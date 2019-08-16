package com.google.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.www.userinterfaces.ProductosInterface;
public class SeleccionarPrimerProductoTask implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ProductosInterface.PrimerProducto));
		
	}
	
	public static SeleccionarPrimerProductoTask SeleccionarPrimerProducto() {
		return instrumented(SeleccionarPrimerProductoTask.class);
	}
}
