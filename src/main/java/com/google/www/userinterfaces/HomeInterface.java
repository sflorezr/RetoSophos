package com.google.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.metro.pe/especiales/cybermetro")
public class HomeInterface extends PageObject{	
	public static final Target NoGracias = Target.the("No gracias").located(By.id("onesignal-popover-cancel-button"));
	public static final Target Categorias = Target.the("Categorias").located(By.xpath("//span[1][text()='Categorías']"));
	public static final Target Tegnologia = Target.the("Tegnologia").located(By.xpath("//span[1][text()='Tecnología']"));
}
