package com.aliexpress.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenBrowserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://es.aliexpress.com/"));

    }

    public static OpenBrowserTask openBrowser() {
        return Tasks.instrumented(OpenBrowserTask.class);
    }


}
