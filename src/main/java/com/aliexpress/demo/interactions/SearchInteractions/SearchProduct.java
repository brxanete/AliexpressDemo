package com.aliexpress.demo.interactions.SearchInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.aliexpress.demo.userinterfaces.HomePage.SEARCH_BAR;
import static com.aliexpress.demo.userinterfaces.HomePage.SEARCH_BTN;
import static com.aliexpress.demo.userinterfaces.SearchPage.ADDTOCART_BTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchProduct implements Interaction {

    public static String product;

    public SearchProduct(String product) {
        this.product= product;
    }
    public static SearchProduct inputProduct(String product) {
        return instrumented(SearchProduct.class, product);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.attemptsTo(
                WaitUntil.the(SEARCH_BAR, isVisible()),
                theValue(product).into(SEARCH_BAR),
                WaitUntil.the(SEARCH_BTN, isVisible()),
                Click.on(SEARCH_BTN)

        );



    }
}
