package ru.geekbrins.Lesson7;

public class Cat {
    private String name;
    private int appetite;
    //public int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        System.out.println("Кот " + name + " хочет cъесть " + appetite + " котлеты");
    }
    public void eat (Plate p){
        p.decreaseFood(appetite);
        System.out.println(name + " Поел!");
    }

  //  public boolean satietyCat(Plate p){
  //      if(appetite < p.food);
  //      return true;
  //  }
}
