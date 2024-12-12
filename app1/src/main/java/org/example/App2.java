package org.example;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Test amend commit");

        // 5 пункт - Слияние веток
        Car carByPerson2 = new Car("Audi for person2");
        System.out.println("Car with name: " + carByPerson2.getName());
    }

    public static class Car {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}