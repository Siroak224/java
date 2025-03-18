import java.util.Scanner;

public class EnumExample3 {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        System.out.println("Enter day:");
        Scanner s = new Scanner(System.in);
        String input = s.next().toUpperCase();
        try {
        Day day = Day.valueOf(input);
        switch (day) {
            case SUNDAY:
            case SATURDAY:
                System.out.println(day + " is the best!");
                break;
            case MONDAY:
                System.out.println(day + " is bad!");
                break;
            default: System.out.println(day + " is not bad.");
                break;
        }
        }catch (Exception e) {
        	System.out.println("Please enter a valid day of the week ");
        }
        }
        
    }

