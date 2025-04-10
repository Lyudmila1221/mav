public class Product {
    private final String name;
    private final String manufactureDate;
    private final String manufacturer;
    private final String country;
    private final double price;
    private final boolean isReserved;

    public Product(String name, String manufactureDate, String manufacturer, String country, double price, boolean isReserved) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

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
