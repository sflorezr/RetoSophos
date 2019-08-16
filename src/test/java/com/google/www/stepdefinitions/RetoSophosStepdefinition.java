package com.google.www.stepdefinitions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.containsString;

import com.google.www.questions.AgregoAlCarritoQuestion;
import com.google.www.tasks.SeleccionarCategoriaTask;
import com.google.www.tasks.SeleccionarPrimerProductoTask;
import com.google.www.tasks.SeleccionarSubcategoriasTaks;
import com.google.www.userinterfaces.HomeInterface;
import com.google.www.userinterfaces.ProductosInterface;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RetoSophosStepdefinition {
	HomeInterface pagina;
	
    @Before
    public void set_the_stage() {
    	OnStage.setTheStage(new OnlineCast());

    }
	@Given("^Estando en la pagina princial de metro$")
	public void estandoEnLaPaginaPrincialDeMetro() {
		theActorCalled("actor").wasAbleTo(Open.browserOn(pagina));
	}


	@When("^Ingreso a categorias y subcategoria \"([^\"]*)\"$")
	public void ingresoACategoriasYSubcategoria(String subcategoria) {
	    OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarCategoriaTask.SeleccionaCatergia());
	    OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarSubcategoriasTaks.SeleccionaSubcategoria(subcategoria));
	}

	@When("^Selecciono primer producto$")
	public void seleccionoPrimerProducto() {
	    OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPrimerProductoTask.SeleccionarPrimerProducto());	    
	}

	@Then("^Valido titulo del carrito \"([^\"]*)\"$")
	public void validoTituloDelCarrito(String mensaje) {		
		OnStage.theActorInTheSpotlight().should(eventually(seeThat(AgregoAlCarritoQuestion.ElTexto(ProductosInterface.TituloCarrito), containsString(mensaje))));
	    
	}


}
