public class Park {

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
}

