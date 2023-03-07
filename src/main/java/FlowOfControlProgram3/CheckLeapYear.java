package Flow_of_Control_Assignment.task3;
import java.util.Scanner;

// functionality to check whether the given year is leap year or not
public class CheckLeapYear {
    
    static Boolean checkLeapYear(int year){
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    return true;
                }else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.println("Enter the year to be checked ");
        int year = scannerObject.nextInt();
        
        Boolean result = checkLeapYear(year);

        if(result){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println("The year: "+ year + " is not a leap year");
        }
        
    }
}
