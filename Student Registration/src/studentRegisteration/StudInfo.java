package studentRegisteration;

abstract public class StudInfo {
    protected int number_of_students;
    String firstName, sirName, lastName, id, dept;
    int age;



    abstract void displayInfo();

    abstract public void underGraduateRegisteration(int y);
    abstract public void graduateRegistration(int x);

    //abstract void displayInfo(String firstName, String sirName, String lastName, String id, String dept, int age);

    abstract void displayInfo(String firstName, String sirName, String lastName, String id, String dept,int age);
}
