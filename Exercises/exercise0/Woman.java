public class Woman {
    //Properties
    private int age;
    private double height;
    private String name;
    private String originality;
    private boolean isMarried;
    private boolean isHealthy;
    private String job;
    private double weight;

    //Constructore
    public Woman(String name) {
        this.name = name;
        System.out.println("Women named " + name + " created");
    }

    //Methods
    public void growUp() {

    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}