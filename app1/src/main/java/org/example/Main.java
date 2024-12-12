package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello everybody!");
        System.out.println("Goodbye everybody!");
        System.out.println("First!");
        System.out.println("Second!");
        System.out.println("Third!");

        // 5 пункт - Слияние веток
        Animal animalByPerson1 = new Animal("person1");
        System.out.println("Animal with name: " + animalByPerson1.getName());
    }

    public static class Animal {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}