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
public class Engine {
    private int engineSize;
    private String FuelType;
    private int numberOfPistons;
    
    public void condition (String PerformanceCondition){
        System.out.println("Engine is performing optimally " + PerformanceCondition);
    }
    
    public String checkEngineLight (){
        return "On";
    }
    
}
