package ru.geekbrins.Lesson7;

public class Main {

    public static void main(String[] args) {

	Plate plate = new Plate(10);
	plate.info();
	eatingMeal(plate);
	plate.infoFin();
    }

	private static void eatingMeal(Plate plate) {
    	Cat[] cats = new Cat[4];
		cats[0] = new Cat("Барсик",2);
		cats[1] = new Cat("Мурзик",3);
		cats[2] = new Cat("Фантик",7);
		cats[3] = new Cat("Пушок",1);

		for (int i = 0; i < cats.length; i++) {
			cats[i].eat(plate);
		}
	}

}
