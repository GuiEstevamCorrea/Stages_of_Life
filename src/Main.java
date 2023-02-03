import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What age you want?\n [B]Baby / [R]Toddler / [P]Preschooler / [G]Gradescholer / [T]Teen / [Y]Young Adult / [A]Adult / [M]Middle Age Adult / [S]Senior Adult");
        String input = scanner.nextLine().toUpperCase();

        switch (input){
            case "B":
                System.out.println("It is a Baby and the age range is from 0 to 11 months");
                break;

            case "R":
                System.out.println("It is a Toddler and the age range is from 1 to 2 years");
                break;

            case "P":
                System.out.println("It is a Preschooler and the age range is from 3 to 4 years");
                break;

            case "G":
                System.out.println("It is a Gradescholer and the age range is from 5 to 11 years");
                break;

            case "T":
                System.out.println("It is a Teen and the age range is from 12 to 17 years");
                break;

            case "Y":
                System.out.println("It is a Young Adult and the age range is from 18 to 20 years");
                break;

            case "A":
                System.out.println("It is a Adult and the age range is from 21 to 39 years");
                break;

            case "M":
                System.out.println("It is a Middle Age Adult and the age range is from 40 to 59 years");
                break;

            case "S":
                System.out.println("It is a Senior Adult and the age range is from 60+ years");
                break;

            default:
                System.out.println("The " + input + " is not valid!");
                break;
        }



    }
}