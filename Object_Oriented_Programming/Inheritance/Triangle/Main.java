import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        
        in.nextLine();
        
        String color = in.nextLine();
        String filledInput = in.nextLine();
        
        boolean filled = filledInput.equalsIgnoreCase("a") ;
        
        Triangle triangle = new Triangle (side1, side2, side3, color, filled);
        
        System.out.println("area: " + triangle.getArea());
        System.out.println("perimeter: " + triangle.getPerimeter());
        
        System.out.println("color: " + triangle.getColor());
        System.out.println("filled: " + triangle.isFilled());
        
        in.close();
    }
}
