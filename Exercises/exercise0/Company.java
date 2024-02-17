public class Company{
    //Properties
    private String name;
    private String address;
    private String logoPath;
    private int size;
    private int industry;
    private boolean isLocal;
    private double income;
    private double loss;

    //Constructor
    public Company() {
        System.out.println("Company created");
    }

    //Methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void emptyMethod() {
        
    }

}