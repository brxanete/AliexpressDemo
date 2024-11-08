package com.aliexpress.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PreCartPage {

    public static final Target PRICE_BAN = Target.the("Price banner").located(By.xpath("//span[@class='price--currentPriceText--V8_y_b5 pdp-comp-price-current']"));
    public static final Target PREBUY_BTN = Target.the("Add to cart button").located(By.xpath("//button/span[text()='Agregar al carrito']"));

}
