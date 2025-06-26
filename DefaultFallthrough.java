import java.util.*;
public class DefaultFallthrough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);
        
        switch(grade) {
            default:
                System.out.println("Invalid grade"); break;
            case 'F': 
                System.out.println("Attendance");
                // intentional fallthrough
            case 'G': 
                System.out.println("CA");
                // intentional fallthrough
            case 'E': 
                System.out.println("ETE");
                break;
        }
    }
}
