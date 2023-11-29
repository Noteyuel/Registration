package studentRegisteration;
//code for student registration 
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentRegister extends Student{
    //subclass constructor 
    StudentRegister(String firstName, String sirName, String lastName, String id, String dept, int age) {
        //calls the super class constructor.
        super(firstName, sirName, lastName, id, dept, age);
    }

    public static void main(String[] args) {
        int choice;
        boolean con = true;
        int number_of_students;
        Scanner in = new Scanner(System.in);
//
while (con){
            try {
                System.out.println("Enter number of students to be registered.");
                number_of_students = in.nextInt();
                System.out.println("choose the status of your student.");
                System.out.println("1.Undergraduate student.");
                System.out.println("2.Graduate student.");
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Under graduate students.");
                        for (int i = 0; i < number_of_students; i++) {

                            Student n = new StudentRegister("eyuel", "fiseha", "wasu", "2737", "SWE", 22);

                            n.underGraduateRegisteration(number_of_students);

                        }
                        break;
                    case 2:
                        System.out.println("Graduate students.");
                        for (int i = 0; i < number_of_students; i++) {

                            Student x = new StudentRegister("eyuel", "fiseha", "wasu", "2737", "SWE", 22);

                            x.graduateRegistration(number_of_students);


                        }

                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("wrong input " + "please try again.");
                in.nextLine();

            }
        }

    }
}

class Student extends StudInfo{
    int age;
    String firstName;
    String lastName;
    String sirName;
    String id;
    String dept;
//constructor for instantiation of the instance variables.
    Student(String firstName, String sirName, String lastName, String id, String dept, int age) {
        this.age = age;
        this.firstName = firstName;
        this.sirName = sirName;
        this.lastName = lastName;
        this.id = id;
        this.dept = dept;
    }
//Method for the dedicated display student information.
//overriden method for the abstract class of StudInfo.

    @Override
    void displayInfo() {
        System.out.println("Student's name : " + firstName + " " + sirName + " " + lastName);
        System.out.println("Student's Id : " + id);
        System.out.println("Student's age : " + age);
        System.out.println("Student's Department : " + dept);
    }
    //Method for the dedicated graduate registration
//overriden method for the abstract class of StudInfo

    @Override
    public void graduateRegistration(int x) {
            //declared array for the purpose of storing student information.
            ArrayList<String> gradStudInfo = new ArrayList<String>();
            Scanner get = new Scanner(System.in);
            System.out.println(">>>>>>>>>>>>>>>STUDENT REGISTERATION<<<<<<<<<<<<<<<<");
            System.out.println("Enter student first name :");
            String firstName = get.nextLine();
            System.out.println("Enter student sir name : ");
            String sirName = get.nextLine();
            System.out.println("Enter student last name : ");
            String lastName = get.nextLine();
            System.out.println("Enter Student Id number: ");
            String id = get.nextLine();
            System.out.println("Enter the Student department or major : ");
            String dept = get.nextLine();
            try{
            System.out.println("Enter the student's age : ");
            int age = get.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());

            }
            System.out.println("--------registered student-----------");
            System.out.println("Student's name : " + firstName + " " + sirName + " " + lastName);
            System.out.println("Student's Id : " + id);
            System.out.println("Student's age : " + age);
            System.out.println("Student's Department : " + dept);
            gradStudInfo.add(firstName);
            gradStudInfo.add(sirName);
            gradStudInfo.add(lastName);
            gradStudInfo.add(id);
            gradStudInfo.add(dept);
            System.out.println(gradStudInfo);
    }


//Method for the dedicated undergraduate registration
//overriden method for the abstract class of StudInfo
    @Override
    public void underGraduateRegisteration(int y) {
        //declared array for the purpose of storing student information.
        ArrayList<String> unStudInfo  = new ArrayList<String>();

            Scanner get = new Scanner(System.in);
            System.out.println(">>>>>>>>>>>>>>>STUDENT REGISTERATION<<<<<<<<<<<<<<<<");
            System.out.println("Enter student first name :");
            String firstName = get.nextLine();
            System.out.println("Enter student sir name : ");
            String sirName = get.nextLine();
            System.out.println("Enter student last name : ");
            String lastName = get.nextLine();
            System.out.println("Enter Student Id number: ");
            String id = get.nextLine();
            System.out.println("Enter the Student department or major : ");
            String dept = get.nextLine();
           try {
               System.out.println("Enter the student's age : ");
               int age = get.nextInt();
           }
           catch (InputMismatchException e){
               System.out.println(e.getMessage());
           }
               System.out.println("--------registered student's-----------");
            System.out.println("Student's name : " + firstName + " " + sirName + " " + lastName);
            System.out.println("Student's Id : " + id);
            System.out.println("Student's age : " + age);
            System.out.println("Student's Department : " + dept);
            unStudInfo.add(firstName);
            unStudInfo.add(lastName);
            unStudInfo.add(sirName);
            unStudInfo.add(id);
            unStudInfo.add(dept);
            System.out.println(unStudInfo);
    }
    //Method for the display with the given parameters student information.
//overriden method for the abstract class of StudInfo.
    @Override
    void displayInfo(String firstName, String sirName, String lastName, String id, String dept,int age){
        System.out.println("Student's name : " + firstName + " " + sirName + " " + lastName);
        System.out.println("Student's Id : " + id);
        System.out.println("Student's age : " + age);
        System.out.println("Student's Department : " + dept);
    }
}
