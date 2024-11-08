package com.aliexpress.demo.interactions.SearchInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.aliexpress.demo.userinterfaces.SearchPage.ADDTOCART_BTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddFirstProductToCart implements Interaction {
    public static AddFirstProductToCart onList() {
        return instrumented(AddFirstProductToCart.class);
    }

    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.wasAbleTo(
                WaitUntil.the(ADDTOCART_BTN, isVisible()),
                Click.on(ADDTOCART_BTN)
        );
    }




}
