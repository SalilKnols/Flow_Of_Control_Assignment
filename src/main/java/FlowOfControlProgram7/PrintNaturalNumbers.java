package Flow_of_Control_Assignment.task7;

import java.util.Scanner;

public class PrintNaturalNumbers {

    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the count of numbers");
        int numberCount = scannerObject.nextInt();
        int index = 1;
        while(index<=numberCount){
            System.out.print(index + " ");
            index += 1;
        }
    }
}
