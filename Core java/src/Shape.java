import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("To calculate area, input 1 for circle, 2 for triangle, or 3 for square:");
        int Op = s.nextInt();

        switch (Op) {
            case 1:
                System.out.println("Enter radius:");
                double r = s.nextDouble();
                double circleArea = CircleArea(r);
                System.out.println("Area of the circle: " + circleArea);
                break;
                
            case 2:
                System.out.println("Enter base and height:");
                double b = s.nextDouble();
                double h = s.nextDouble();
                double triangleArea = TriangleArea(b, h);
                System.out.println("Area of the triangle: " + triangleArea);
                break;
                
            case 3:
                System.out.println("Enter side:");
                double si = s.nextDouble();
                double squareArea = SquareArea(si);
                System.out.println("Area of the square: " + squareArea);
                break;
                
            default:
                System.out.println("Invalid input.");
                break;
        }
    }

    public static double CircleArea(double r) {
        return 3.14 * r * r;
    }
    
    public static double TriangleArea(double b, double h) {
        return 0.5 * b * h;
    }

    public static double SquareArea(double si) {
        return si * si;
    }
}
