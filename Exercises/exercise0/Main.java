public class Main {
    //Open a terminal in the directory containing your .java files.
    //Compile the program using javac Main.java.
    //Run the program with java Main.
    
    public static void main(String[] args) {
        //Instantiate House objects
        House house1 = new House("1 San Jose Rd");
        House house2 = new House("2 San Jose Rd");
        //first create an instance of the outer class (House) and then use that instance to create an instance of the nested class.
        House house3 = new House("3 San Jose Rd");
        House.Bedroom bedroomAtHouse3 = house3.new Bedroom(80);

        //Instantiate Woman objects
        Woman emily = new Woman("Emily");
        Woman sarah = new Woman("Sarah");
        Woman rebecca = new Woman("Rebecca");

        //Instantiate Company objects
        Company companyA = new Company();
        Company companyB = new Company();
        Company companyC = new Company();

        //Instantiate Student objects
        Student student1 = new Student("001");
        Student student2 = new Student("002");
        Student student3 = new Student("003");

        //Instantiate BankAccount objects
        BankAccount account1 = new BankAccount("RBC");
        BankAccount account2 = new BankAccount("HSBC");
        BankAccount account3 = new BankAccount("CHASE");

        //Instantiate Hospital objects
        Hospital A = new Hospital("A");
        Hospital B = new Hospital("B");
        Hospital C = new Hospital("C");

        //Instantiate Supermarket objects
        Supermarket ranch99 = new Supermarket("Ranch99");
        Supermarket costco = new Supermarket("Costco");
        Supermarket farmBoy = new Supermarket("Farm Boy");

        //Instantiate Game objects
        Game gameA = new Game();
        Game gameB = new Game();
        Game gameC = new Game();

        //Instantiate Movie Theater objects
        MovieTheater movieTheaterA = new MovieTheater();
        MovieTheater movieTheaterB = new MovieTheater();
        MovieTheater movieTheaterC = new MovieTheater();

        //Instantiate Pickleball objects
        Pickleball pickleballA = new Pickleball();
        Pickleball pickleballB = new Pickleball();
        Pickleball pickleballC = new Pickleball();
        
    }
}