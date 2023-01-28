import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        cook("Taking Driving Test");
        scan.close();
    }

    static void cook(String food) {

        System.out.println(" Driving... ");
        taste(food);

        String feedback = getFeedBack(food);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixRecipe(food);

            // Recursive call
            cook(food);
        } else if (feedback.equals("yes")) {
            serve(food);
        }
    }

    static void taste(String food) {
        System.out.println("Getting Results...");
    }

    static String getFeedBack(String food) {
        System.out.println("Did you pass the " + food + " (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String food) {
        System.out.println("Taking the test again");
        
    }

    static void serve(String food) {
        System.out.println("Congratulations! You passed the Driving Test, you may now receive your license. " );
    }

}
