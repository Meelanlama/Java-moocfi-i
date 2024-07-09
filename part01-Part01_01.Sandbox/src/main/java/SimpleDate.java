/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    //used for chekcing if this. date object ('this') is small or before
    //the date object given as parameter is ('compared)
    public boolean before(SimpleDate compared) {
        //First comparing the years
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        //Years are same so comparing months
        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }
        // years and months are same so comparing days

        if (this.day < compared.day) {
            return true;
        }
        return false;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal as it checks 
        if (this == compared) {
            return true;
        }
        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate
        //Type casting
        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.day == comparedSimpleDate.day
                && this.month == comparedSimpleDate.month
                && this.year == comparedSimpleDate.year) {
            return true;
        }
        return false;
    }
}
