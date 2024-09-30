package Sept.Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        double side1 = sc.nextDouble();
        System.out.println("Enter the 2nd number");
        double side2 = sc.nextDouble();
        System.out.println("Enter the 3rd number");
        double side3 = sc.nextDouble();
        if(side1 >= 1  && side2 >= 1 && side3 >= 1)
        {
            if(side1 == side2 || side2 == side3 || side1 == side3)
                System.out.println("Isosceles");
            else if(side1 == side2 && side2 == side3 && side1 == side3 )
                System.out.println("equ");
            else {
                System.out.println("scalene");
            }
        }
    }
}
