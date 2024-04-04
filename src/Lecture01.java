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
        // Hello from lecture 01

        // Where in the textbook are the main topics for this question covered?

        // Put your answer for #2 here:
        // Where in the textbook are the main topics for this question covered?
        // In Section 2.3
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        // Put your answer for #3 here:
        // Where in the textbook are the main topics for this question covered?
        // In section 2.3
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Put your answer for #4 here:
        // Where in the textbook are the main topics for this question covered?
        // In section 2.3
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
        // In section 7.1
        Scanner scan = new Scanner(System.in);
        // Prompt user input
        System.out.println("How many grades would you like to store?");
        int numberOfGrades = scan.nextInt();
        scan.nextLine();
        double[] grades = new double[numberOfGrades];
        double sum = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Next grade?");
            while (!scan.hasNextDouble()) { // Loop indefinitely until a valid double is entered
                System.out.println("Wrong type. Try again.");
                scan.next();
                scan.nextLine();
                System.out.println("Next grade?");
            }
            double grade = scan.nextDouble();
            scan.nextLine();
            System.out.println("Added"); // Confirm grade addition
            grades[i] = grade;
            sum += grade;
        }
        scan.close();
        double average = sum / grades.length;
        System.out.println("The average of your grades is: " + average);
        // Put your answer for #6 here:
        // Where in the textbook are the main topics for this question covered?
        // In section 8.1
        // NOTE: The definition of the Food class should go OUTSIDE the Lecture01
        // class. A good place to put this is at the end of the file.
        // NOTE 2: Make sure that you create a couple of Food objects here in main()
        Food apple = new Food("apple", 25, 5.1);
        apple.print();
    }
}

// Placing the Food class below this line is a good place for it
class Food {
    private String name;
    private int calories;
    private double rating;

    public Food(String name, int calories, double rating) {
        this.name = name;
        this.calories = calories;
        if (rating >= 0 && rating <= 5) {
                this.rating = rating;
        } else {
            System.out.println("Rating not valid");
            this.rating = 0;
        }
    }

    // Returns the name of the food
    public String getName() {
        return this.name;
    }

    // Returns the amount of calories in the food
    public int getCalories() {
        return this.calories;
    }

    // Returns the rating of the food
    public double getRating() {
        return this.rating;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void print() {
        System.out.println("Name: " + this.name + ", " + "Calories: " + this.calories + ", " + "Rating: " + this.rating);
    }
}