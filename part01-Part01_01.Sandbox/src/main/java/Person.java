/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Person {

    //Class defines the attributes and behaviours of object
    //This is just a blueprint
//    private String name;
//    private int age;
//
//    public Person(String initialName) {
//        this.age = 0;
//        this.name = initialName;
//    }
//
//    public String toString() {
//        return this.name + ", age " + this.age + " years";
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void growOlder() {
//        if (this.age < 30) {
//            this.age = this.age + 1;
//        }
//    }
//
//    public int returnAge() {
//        return this.age;
//    }
//
//    public boolean isOfLegalAge() {
//        return this.age >= 18;
//    }
    private String name;
    private SimpleDate birthday;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

//    public Person(String name, int age, int height, int weight) {
//        this.age = age;
//        this.weight = weight;
//        this.height = height;
//        this.name = name;
//    }
    //Constructor for setting the birthday
    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    //Constructor for giving the birthday details
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    public void growOlder() {
        this.age += 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred / heightPerHundred);
    }

    public boolean OlderThan(Person compared) {
        if (this.birthday.before(compared.getBirthday())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name.equals(comparedPerson.name)
                && // .equals because its string
                this.age == comparedPerson.age
                && this.weight == comparedPerson.weight
                && this.height == comparedPerson.height) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + /*", age " + this.age + " years"*/ ", born on " + this.birthday;

    }

}
