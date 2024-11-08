package com.aliexpress.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {

    public static final Target ADDTOCART_BTN = Target.the("Add to cart first button").located(By.xpath("//span[@class='image--icon--HQGC-D_']"));

}
