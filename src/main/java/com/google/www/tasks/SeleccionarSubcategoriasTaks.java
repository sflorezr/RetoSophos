package com.google.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.www.userinterfaces.HomeInterface;

public class SeleccionarSubcategoriasTaks implements Task{
	private final String subcategoria;
	
	public SeleccionarSubcategoriasTaks(String subcategoria) {
		this.subcategoria=subcategoria;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		switch (subcategoria) {
		case "Tecnología":
			actor.attemptsTo(Click.on(HomeInterface.Tegnologia));			
			break;
		default:
			break;
		}

		
	}
	
	public static SeleccionarSubcategoriasTaks SeleccionaSubcategoria(String subcategoria) {
		return instrumented(SeleccionarSubcategoriasTaks.class,subcategoria);
	}

}
