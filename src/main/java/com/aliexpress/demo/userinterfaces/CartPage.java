package com.aliexpress.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target PREPRICE_BTN = Target.the("Pre price amount").located(By.xpath("(//div[@class='cart-summary-item-content'])[1]"));


}
