public class Supermarket {
    //Properties
    private String name;
    private String address;
    private int numberOfEmployees;
    private boolean isOpen24Hours;
    private String managerName;
    private int numberOfAisles;
    private String openingHours;
    private String closingHours;

    //Constructors
    public Supermarket(String name) {
        this.name = name;
        System.out.println("Supermarket " + name + " created");
    }

    //Methods
    public void restockShelves() {
        System.out.println("Restocking shelves");
    }

    public void openStore() {
        System.out.println("Opening the store");
    }

    public void closeStore() {
        System.out.println("Closing the store");
    }
}
