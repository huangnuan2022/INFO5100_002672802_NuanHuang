public class Hospital{
    //Properties
    private String name;
    private String address;
    private int numberOfBeds;
    private int numberOfDoctors;
    private int numberOfNurses;
    private int numberOfPatients;
    private boolean emergencyServices;
    private String specialization;

    //Constructor
    public Hospital(String name) {
        this.name = name;
        System.out.println("Hospital " + name + " created");
    }

    //Methods
    public void admitPatients() {
        System.out.println("Admit patients");
    }

    public void dischargePatients() {
        System.out.println("discharge patients");
    }

    public void emptyMethod(){
        
    }
}