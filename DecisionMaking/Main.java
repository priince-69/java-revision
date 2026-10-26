 public class Main {
    public static void main(String[] args) {

        int age = 20;
        int marks = 85;
        int number = 2;

        // 1. if statement
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // 2. if-else statement
        if (marks >= 40) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }

        // 3. if-else-if statement
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // 4. Nested if statement
        if (age >= 18) {
            if (marks >= 80) {
                System.out.println("You are an adult with excellent marks.");
            }
        }

        // 5. switch statement
        switch (number) {
            case 1:
                System.out.println("Number is One.");
                break;

            case 2:
                System.out.println("Number is Two.");
                break;

            case 3:
                System.out.println("Number is Three.");
                break;

            default:
                System.out.println("Invalid number.");
        }

        // 6. Ternary operator
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Exam Result: " + result);
    }
}