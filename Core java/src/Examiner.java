import java.util.Scanner;

public class Examiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[number];
        String[] genders = new String[number];
        int[] myanmarMarks = new int[number];
        int[] mathMarks = new int[number];
        int[] englishMarks = new int[number];
        int[] totalMarks = new int[number];
        String[] results = new String[number];
        int passedcount = 0;
        int passed = 0;
        int allTotalMarks = 0;
        int allMyanmarTotal = 0;
        int allMathTotal = 0;
        int allEnglishTotal = 0;
        int highestMark = 0;
        String topStudent = "";

        for (int i = 0; i < number; i++) {
        	switch(i+1) {
        	case(1):System.out.println("Enter " + (i + 1) + "st Student Name: ");break;
        	case(2):System.out.println("Enter " + (i + 1) + "nd Student Name: ");break;
        	case(3):System.out.println("Enter " + (i + 1) + "rd Student Name: ");break;
        	default:System.out.println("Enter " + (i + 1) + "th Student Name: ");break;
        	}
            names[i] = scanner.next();

            System.out.println("Enter Gender (M/F): ");
            genders[i] = scanner.next();
            if (genders[i].equals("m")) {
                genders[i] = "Mg";
            } else if (genders[i].equals("f")) {
                genders[i] = "Ma";
            }
            System.out.println("Enter " + genders[i] + " " + names[i] + " Myanmar Mark: ");
            myanmarMarks[i] = scanner.nextInt();

            System.out.println("Enter " + genders[i] + " " + names[i] + " Math Mark: ");
            mathMarks[i] = scanner.nextInt();

            System.out.println("Enter " + genders[i] + " " + names[i] + " English Mark: ");
            englishMarks[i] = scanner.nextInt();
            totalMarks[i] = myanmarMarks[i] + mathMarks[i] + englishMarks[i];

            if (myanmarMarks[i] < 40 || mathMarks[i] < 40 || englishMarks[i] < 40) {
                results[i] = "Failed";
                System.out.println("Total Mark of " + genders[i] + " " + names[i] + " " + totalMarks[i] + " Failed");
            } else {
                results[i] = "Passed";
                passedcount++;
                passed++;
                System.out.println("Total Mark of " + genders[i] + " " + names[i] + " " + totalMarks[i] + " Passed");
            }
        }
        for (int i = 0; i < number; i++) {
            allTotalMarks += totalMarks[i];
            allMyanmarTotal += myanmarMarks[i];
            allMathTotal += mathMarks[i];
            allEnglishTotal += englishMarks[i];

            if (totalMarks[i] > highestMark) {
                highestMark = totalMarks[i];
                topStudent = names[i];
            }
        }
        if (passed == number) {
            System.out.println("Congratulations! All students have passed.");
        } else {
            System.out.println(passed + " out of " + number + " students passed the exam");
        }
        System.out.println("Passed Rate: " + (double) passedcount / number * 100 + "%");
        System.out.println("Top Student: " + topStudent + " with " + highestMark + " marks");
        System.out.println("Average Mark: " + allTotalMarks / (double) number);
        System.out.println("Average Myanmar Mark: " + allMyanmarTotal / (double) number);
        System.out.println("Average Math Mark: " + allMathTotal / (double) number);
        System.out.println("Average English Mark: " + allEnglishTotal / (double) number);
        System.out.println("Student Summar");
        System.out.println("Name	Gender	Myanmar	Math	English	Total 	Passed/Failed");
        for (int i = 0; i < number; i++) {
        	 String gender = genders[i].equals("Mg") ? "Male" : "Female";
        	System.out.println(names[i]+"	"+gender+"	"+myanmarMarks[i]+"	"+mathMarks[i]+"	"+englishMarks[i]+"	"+totalMarks[i]+" 	"+results[i]+"");
        }
    }
}

            
            
            
            
            
            
            
            
            
            
            
            
