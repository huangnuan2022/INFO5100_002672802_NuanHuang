public class MovieTheater {
    //Properties
    private String name;
    private String location;
    private int numberOfScreens;
    private boolean has3DCapability;
    private String currentShowings;
    private int seatingCapacityPerScreen;
    private String openingTime;
    private String closingTime;

    public MovieTheater() {
        System.out.println("Movietheater created");
    }

    public void playMovie() {
        System.out.println("Playing a movie");
    }

    public void sellTickets() {
        System.out.println("Selling tickets");
    }

    public void cleanTheater() {
        System.out.println("Cleaning the theater");
    }
}
