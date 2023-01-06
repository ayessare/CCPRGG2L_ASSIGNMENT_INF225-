import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student EmaiL Adress: ");
        String studentemail = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentemail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student EmaiL Adress");
        } else {
            System.out.println("invalid student EmaiL Adress");
        }
          System.out.print("Enter student Cellphone Number: ");
        String studentNum = scan.nextLine();
// Long method
         pattern = Pattern.compile("09\\d{9}");
         matcher = pattern.matcher(studentNum);

         match = matcher.matches();

        if (match) {
            System.out.println("valid student Cellphone Number");
        } else {
            System.out.println("invalid student Cellphone Number");
        }
        
        }
    }
