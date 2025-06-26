import java.util.*;
public class SwitchDemo {
    public static void main(String[] rk) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); 
    //    int a = 1; // it is not constant so it will result in compilation error if used in switch statement as case value

        final int a = 1;    // If final is not used, the value of 'a' can change and the switch statement will not work as expected.
       

        switch(input) {
            case a-1: System.out.println("A");
            default: System.out.println("B");
            case a+2: System.out.println("C"); break; // Break statement is optional, if not used, the control will fall through to the next case
            case 1: System.out.println("D");
            case a+1: System.out.println("E");
      //    case a++: System.out.println("F");  // This will not work as expected because 'a++' will modify the value
        }
    }
}




// CASE VALUES SHOULD BE CONSTANT  *****

// Default case is OPTIONAL   // Default case is executed if no other case matches

// Switch statement can be used with byte, short, int, char, String, and enum types ******


// Order of cases doesnot matter // Cases can be wriiten in any order

// Break statement is also OPTIONAL

// Duplicate cases are not allowed