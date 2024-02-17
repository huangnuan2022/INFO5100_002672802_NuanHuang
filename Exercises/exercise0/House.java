public class House {
    //Properties
    private String address;
    private String color;
    private double price;
    private double rent;
    private int age;
    private int squarefoot;
    private boolean isNew;
    private boolean isSold;

    //Constructor
    public House(String address) {
        this.address = address;
        System.out.println("House created at " + address);
    }

    //Methods
    public void sold(){
        this.isSold = false;
    }

    public void showAddress(){
        System.out.println("House in " + address);
    }

    public void question(){
        System.out.println("Do you like the house?");
    }

    //Nested Classes
    class Bedroom {
        //Properties
        int squarefoot;

        //Constructor
        public Bedroom(int squarefoot){
            this.squarefoot = squarefoot;
            System.out.println("The bedroom is " + squarefoot + " squarefoot");
        }
    }

    //Nested Classes
    class Bathroom {
        //Properties
        String color;

        //Constructor
        public Bathroom(String color){
            this.color = color;
            System.out.println("The bathroom is in " + color);
        }
    }
}