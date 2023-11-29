package studentRegisteration;
//abstract class to intiate the abstract method that has its impementation in the subclass that extends the superclass 
//StudInfo
abstract public class StudInfo {
    protected int number_of_students;
    String firstName, sirName, lastName, id, dept;
    int age;


//abstract method which is overriden with code implementation in subclass of student
    
    abstract void displayInfo();
//abstract method which is overriden with code implementation in subclass of student
    abstract public void underGraduateRegisteration(int y);
//abstract method which is overriden with code implementation in subclass of student
    abstract public void graduateRegistration(int x);

//abstract method which is overriden with code implementation in subclass of student
    abstract void displayInfo(String firstName, String sirName, String lastName, String id, String dept,int age);
}
