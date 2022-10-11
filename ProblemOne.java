/*Title: Interface 
Name: Purnimah S V
Created at: 9.10.2022 
Updated at: 10.10.2022 
Reviewed by: 
Reviewed Date:
 */ 
import java.util.Scanner;
import java.util.*;
// Display the details of 20 students
// 1.assign string value to null
// 2.convert integer to invalid string type
// 3.try fetching details of 21st student
class Student{
    String name;
    int studentId;
    int rank;
    char section;
    String mobile;
    //initialize the values of student details(name,studentId,rank,section,mobile)
    public Student(String name,int studentId,int rank,char section,String mobile)
    {
        this.name=name;
        this.studentId=studentId;
        this.rank=rank;
        this.section=section;
        this.mobile=mobile;
    }
//an empty constructor
    public Student() {
    }
//displaying the details of student
    public void display(){
        System.out.println("Student Id: "+this.studentId);
        System.out.println("Name: "+this.name);
        System.out.println("Rank: "+this.rank);
        System.out.println("Section: "+this.section);
        System.out.println("Mobile: "+this.mobile);  
    }
}

public class ProblemOne {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number student detail to added");
        int number=sc.nextInt();
        //now creatinng the student object
        List<Student> student =new ArrayList<Student>();
        try{
            if(number>20){
                throw new Exception("Number of student should be less than 20");
            }
            else{
                for(int i=0;i<number;i++){
                    System.out.println("Enter the student details");
                    System.out.println("Enter the student id");
                    int studentId=sc.nextInt();
                    System.out.println("Enter the student name");
                    String name=sc.next();
                    System.out.println("Enter the student rank");
                    int rank=sc.nextInt();
                    System.out.println("Enter the student section");
                    char section=sc.next().charAt(0);
                    System.out.println("Enter the student mobile");
                    String mobile=sc.next();
                    student.add(new Student(name,studentId,rank,section,mobile));
                }
            }
        //desplay all the student details for n number of students
        System.out.println("--------------Displaying the details of student------------------");
        for(int index=0;index<number;index++)
        {
            student.get(index).display();
        }
        System.out.println("------------------------------------------------------------------");
        }
        catch(Exception e){
            System.out.println("The number of values can be add upto 20 studnets");
        }
    }
}
