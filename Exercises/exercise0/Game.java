public class Game {
    //Properties
    private String title;
    private String developer;
    private String genre;
    private double price;
    private boolean multiplayerSupport;
    private int minimumAge;
    private String releaseDate;
    private String platform;

    //Constructor
    public Game() {
        System.out.println("Game created");
    }

    //Methods
    public void startGame() {
        System.out.println("Starting the game");
    }

    public void saveGame() {
        System.out.println("Saving the game");
    }

    public void exitGame() {
        System.out.println("Exiting the game");
    }
}
