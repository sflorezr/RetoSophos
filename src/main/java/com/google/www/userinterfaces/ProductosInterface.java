package com.google.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosInterface {

	public static final Target PrimerProducto = Target.the("Primer producto").located(By.xpath("//div/ul/li[1]/div[1]/div[3]/div[5]/button/span[5]"));
	public static final Target TituloCarrito = Target.the("Titulo carrito").located(By.xpath("//div[4]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]"));
	
}
