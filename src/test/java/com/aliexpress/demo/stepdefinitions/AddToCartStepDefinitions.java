package com.aliexpress.demo.stepdefinitions;

import com.aliexpress.demo.interactions.SearchInteractions.SearchProduct;
import com.aliexpress.demo.interactions.SearchInteractions.AddFirstProductToCart;
import com.aliexpress.demo.models.ProductUserModel;
import com.aliexpress.demo.questions.CorrectElementText;
import com.aliexpress.demo.questions.CorrectPresenceElement;
import com.aliexpress.demo.tasks.OpenBrowserTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.util.List;

import static com.aliexpress.demo.userinterfaces.CartPage.PREPRICE_BTN;
import static com.aliexpress.demo.userinterfaces.HomePage.CART_BTN;
import static com.aliexpress.demo.userinterfaces.PreCartPage.PREBUY_BTN;
import static com.aliexpress.demo.userinterfaces.PreCartPage.PRICE_BAN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class AddToCartStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver webDriver;

    private Actor bryan = Actor.named("Bryan");

    @Before
    public void preparedActorStage() {
        OnStage.setTheStage(new OnlineCast());
        bryan.can(BrowseTheWeb.with(webDriver));
    }

    @Dado("^Que el usuario ingresa a Ali Express$")
    public void queElUsuarioIngresaAAliExpress() {
        bryan.attemptsTo(
                OpenBrowserTask.openBrowser()
        );
    }

    @Cuando("^Ingresa en la barra de busqueda el producto a buscar$")
    public void ingresaEnLaBarraDeBusquedaElProductoABuscar(List<ProductUserModel> productList) {
        bryan.attemptsTo(
                SearchProduct.inputProduct(productList.get(0).getProduct())
        );
    }



    @Y("^Selecciona agregar el primer producto$")
    public void agregaAlCarritoElPrimerArticuloDeLaLista() {
        bryan.attemptsTo(
                AddFirstProductToCart.onList()
        );
    }

    @Cuando("^Verifica el precio de la precompra$")
    public void verificaElPrecioDelProducto(List<ProductUserModel> productList) {
        bryan.should(
                seeThat(CorrectPresenceElement.displayed(PRICE_BAN)),
                seeThat(CorrectElementText.displayed(PRICE_BAN), containsString(productList.get(0).getPrice()))
                );

    }

    @Y("^Termina de agregar el producto$")
    public void terminaDeAgregarElProducto() {
        bryan.attemptsTo(
           Click.on(PREBUY_BTN)
        );

    }

    @E("^Ingresa al carro de compras$")
    public void ingresaAlCarroDeCompras() {
        bryan.attemptsTo(
                Click.on(CART_BTN)
        );
    }


    @Entonces("^Verifica el precio de la compra$")
    public void verificaElPrecioDeLaCompra(List<ProductUserModel> productList) {
        bryan.should(
                seeThat(CorrectPresenceElement.displayed(PREPRICE_BTN)),
                seeThat(CorrectElementText.displayed(PREPRICE_BTN), containsString(productList.get(0).getPrice()))
        );

    }
}
