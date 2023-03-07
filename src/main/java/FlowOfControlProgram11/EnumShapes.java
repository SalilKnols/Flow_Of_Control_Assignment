package FlowOfControlProgram11;
import java.awt.*;
public class EnumShapes {

    enum GeometricShapes{
        Rectangle,
        Square,
        Circle;
        static void area(int a, int b){
            System.out.println("Area of rectangle is: " + a*b);
        }
        static void area(int a){
            System.out.println("Area of square is: " + a*a);
        }
    }
        public static void main(String[] args) {
            GeometricShapes.area(4);
            GeometricShapes.area(4,5);
        }
    }

