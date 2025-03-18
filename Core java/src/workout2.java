import java.util.Scanner;

public class workout2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hardness value: ");
        double hardness = scanner.nextDouble();

        System.out.print("Enter the carbon content: ");
        double carbon = scanner.nextDouble();

        System.out.print("Enter the tensile strength: ");
        double tensile = scanner.nextDouble();

        int grade = gradeSteel(hardness, carbon, tensile);

        System.out.println("The grade for the steel product is: " + grade);
    }

    public static int gradeSteel(double hardness, double carbon, double tensile) {
        if (hardness > 50 && carbon < 0.7 && tensile > 5600) {
            return 10;
        } else if (hardness > 50 && carbon < 0.7) {
            return 9;
        } else if (carbon < 0.7 && tensile > 5600) {
            return 8;
        } else if (hardness > 50 && tensile > 5600) {
            return 7;
        } else if (hardness > 50 || carbon < 0.7 || tensile > 5600) {
            return 6;
        } else {
            return 5;
        }
    }
}
