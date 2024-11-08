package com.aliexpress.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class HomePage {
    public static final Target SEARCH_BAR = Target.the("Search bar").located(By.id("search-words"));
    public static final Target SEARCH_BTN = Target.the("Search button").located(By.xpath("//input[@class='search--submit--2VTbd-T search--newSubmit--3BlVRKw']"));
    public static final Target CART_BTN = Target.the("Cart button").located(By.xpath("//span[@class='shop-cart--number--axE62FE']"));


}
