import java.util.*;
class Lecture01 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 01");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        //
        // Copy and paste the output from when you first cloned (downloaded) and ran
        // this program
        // (in other words, when you run this program, what does it print?
        // Copy that output into this file, right here, in a comment

        // Where in the textbook are the main topics for this question covered?

        // Put your answer for #2 here:
        // Where in the textbook are the main topics for this question covered?
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        // Put your answer for #3 here:
        // Where in the textbook are the main topics for this question covered?
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Put your answer for #4 here:
        // Where in the textbook are the main topics for this question covered?
        Scanner input = new Scanner(System.in);
        System.out.println("How many rows would you like to print?");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Put your answer for #5 here:
        // Where in the textbook are the main topics for this question covered?
        Scanner scan = new Scanner(System.in);
        System.out.println("How many grades would you like to store?");
        int answer = scan.nextInt();
        double[] grades = new double[answer];
        double sum = 0;

        for (int i = 0; i < answer; i++) {
            System.out.println("Next Grade?");
            double grade = scan.nextDouble();
            grades[i] = grade;
            sum += grade;
        }
        double average = sum / grades.length;
        System.out.print("The average of your grades is: " + average);
        // Put your answer for #6 here:
        // Where in the textbook are the main topics for this question covered?
        // NOTE: The definition of the Food class should go OUTSIDE the Lecture01
        // class. A good place to put this is at the end of the file.
        // NOTE 2: Make sure that you create a couple of Food objects here in main()

    }
}

// Placing the Food class below this line is a good place for it