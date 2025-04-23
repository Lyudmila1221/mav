package lesson11;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 150),
                new Cat("Мурзик", 180),
                new Cat("Том", 160)
        };

        Dog[] dogs = {
                new Dog("Рекс", 400, 5),
                new Dog("Шарик", 450, 7)
        };

        Bowl bowl = new Bowl(50);

        System.out.println("Тестируем бег и плавание:");
        for (Animal animal : cats) {
            animal.run(animal.runLimit);
            animal.swim(5);
        }

        for (Animal animal : dogs) {
            animal.run(animal.runLimit);
            animal.swim(animal.swimLimit);
        }

        System.out.printf(
                "\nОбщее количество животных: %d\nКотов: %d\nСобак: %d\n",
                Animal.getAnimalCount(),
                Cat.getCatCount(),
                Dog.getDogCount()
        );

        System.out.println("\nКоты пытаются покушать:");
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
        }

        System.out.println("\nСытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " - " + (cat.isFull() ? "Сыт" : "Голоден"));
        }

        System.out.println("\nПополняем миску...");
        bowl.addFood(30);

        System.out.println("Коты пытаются покушать снова:");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 20);
            }
        }

        System.out.println("\nИтоговая сытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " - " + (cat.isFull() ? "Сыт" : "Голоден"));
        }
    }
}