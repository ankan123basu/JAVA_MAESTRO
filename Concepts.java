public class Concepts {
public static void main(String[] args) {
    int a = 0XA1;
    System.out.println(a); // prints 161

    // ***  int b = 018;  

    // 018 is not a valid octal number in Java, it will cause a compile-time error.
    // The valid octal digits are 0-7 only.
    // If you want to use an octal number, it should be in the range of 0 to 7.

    int b = 017; 
    System.out.println(b); // prints 15

    int c = 0B1010; // binary
    System.out.println(c); // prints 10

    int d = 0xA1; // hexadecimal
    System.out.println(d); // prints 161

    int e = 0b101010; // binary
    System.out.println(e); // prints 42

    int f = 0xA1; // hexadecimal
    System.out.println(f); // prints 161

    int g = 0b101010; // binary
    System.out.println(g); // prints 42

    // 0B prefix is used for binary literals in Java, introduced in Java 7.
    // 0X prefix is used for hexadecimal literals in Java.
    // 0 prefix is used for octal literals in Java, but only digits 0-7 are valid.

}
}