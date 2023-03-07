package Flow_of_Control_Assignment.task5;

import java.util.Scanner;

//functionality t decide the grade of student on the basis of marks
public class GradeCalculation {

    public static int gradeCalculation(int marks){
        if(marks>95){
            System.out.println("A Grade");
        } else if (marks > 90 && marks<95) {
            System.out.println("B Grade");
        } else if (marks > 80 && marks<90) {
            System.out.println("C Grade");
        } else if (marks > 70 && marks<80) {
            System.out.println("D Grade");
        } else if (marks > 50 && marks<70) {
            System.out.println("E Grade");
        } else{
            System.out.println("F Grade");
        }
        return marks;
    }
    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the marks");
        int marks = scannerObject.nextInt();
        gradeCalculation(marks);
    }
}
