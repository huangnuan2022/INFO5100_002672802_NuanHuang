public class Student{
    //Properties
    private int age;
    private String phoneNumber;
    private String studentNumber;
    private double weight;
    private double height;
    private String name;
    private String major;
    private String gender;

    //Constructor
    public Student(String studentNumber) {
        System.out.println("student created with number " + studentNumber);
    }

    //Methods
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printGender() {
        System.out.println("the student is" + gender);
    }

    public void emptyMethod() {

    }
}