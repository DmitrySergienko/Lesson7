package ru.geekbrins.Lesson7;

import java.util.Scanner;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {

        if (food <= 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Котлеты закончились! Добавьте котлет!");
            food = sc.nextInt();
        }
        food -= n;
    }

    public void info(){
        System.out.println("в тарелке: " + food + " котлет!");
    }
    public void infoFin(){
        System.out.println("Коты сыты! И в тарелке осталось: " + food + " котлет!");
    }
}
