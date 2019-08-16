package com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.google.www.userinterfaces.HomeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class IngresaraHomeTask implements Task{
	HomeInterface pagina;

	@Step("{0} ingresa al pagina")
    @Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Open.browserOn(pagina));
		
	}
	
	public static IngresaraHomeTask ingresar() {
		return instrumented(IngresaraHomeTask.class);	
	}

}
