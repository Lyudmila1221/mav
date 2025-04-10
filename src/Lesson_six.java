import java.util.Arrays;

/*class Product {
    private String name;
    private String manufactureDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isReserved;

    public Product(String name, String manufactureDate, String manufacturer, String country, double price, boolean isReserved) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + manufactureDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + (isReserved ? "Да" : "Нет"));
        System.out.println("-----------------------------");
    }
}

public class Lesson_six {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Корея", 5599, true);
        productsArray[1] = new Product("iPhone 15", "10.09.2024", "Apple Inc.", "США", 999, false);
        productsArray[2] = new Product("Sony PlayStation 6", "15.11.2025", "Sony", "Япония", 699, true);
        productsArray[3] = new Product("Xiaomi MiPad 7", "05.06.2024", "Xiaomi", "Китай", 499, false);
        productsArray[4] = new Product("Dell XPS 16", "20.08.2025", "Dell", "США", 1899, true);
        for (Product product : productsArray) {
            product.displayInfo();
        }
    }
}

   class Park {
        private String name;
        private String location;
        public Park(String name, String location) {
            this.name = name;
            this.location = location;
        }
        class Attraction {
            private String attractionName;
            private String workingHours;
            private double price;

            public Attraction(String attractionName, String workingHours, double price) {
                this.attractionName = attractionName;
                this.workingHours = workingHours;
                this.price = price;
            }

            public void displayInfo() {
                System.out.println("Аттракцион: " + attractionName);
                System.out.println("Время работы: " + workingHours);
                System.out.println("Стоимость: " + price + " €");
                System.out.println("-----------------------------");
            }
        }

        public void displayParkInfo() {
            System.out.println("Парк: " + name);
            System.out.println("Местоположение: " + location);
            System.out.println("-----------------------------");
        }
    }

   /* public class Lesson_six {
        public static void main(String[] args) {
            // Создание объекта парка (Диснейленд в Париже)
            Park disneylandParis = new Park("Disneyland", "Paris, France");

            disneylandParis.displayParkInfo();

            Park.Attraction spaceMountain = disneylandParis.new Attraction("Space Mountain", "10:00 - 23:00", 20);
            Park.Attraction piratesOfCaribbean = disneylandParis.new Attraction("Pirates of the Caribbean", "09:30 - 22:30", 18);
            Park.Attraction phantomManor = disneylandParis.new Attraction("Phantom Manor", "10:00 - 22:00", 15);

            spaceMountain.displayInfo();
            piratesOfCaribbean.displayInfo();
            phantomManor.displayInfo();
        }
    }*/



