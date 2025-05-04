
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class WeatherMan {

    public static void main(String[] args) {
        Weather forecaster = new Weather();

        //Saving days of week;
        ArrayList<String> days = new ArrayList<>();
        days.add("Sun");
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        
        System.out.println("Next week's weather forecast: ");
        
        for(String day: days){
        String weatherForecast = forecaster.forecast();
        int tempForecast = forecaster.makeAForeCast();
        
            System.out.println(day +": " + weatherForecast  + " " + tempForecast + " degrees.");
        }
    }
}
