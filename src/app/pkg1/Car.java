/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pkg1;

/**
 *
 * @author Tomide James
 */
public class Car {

    String colour;
    int enginesize;
    String configuration;
    int noofdoors;

    public void honk(String soundType) {
        System.out.println("Beep");
        System.out.println("A car is approaching");
        System.out.println("Step back from the vehicle");
        System.out.println("I just used " + soundType);
    }

    private String beep() {
        return "I have beeped";
    }

    public String momentum() {
        return "Stopped";
    }

}
