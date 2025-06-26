public class operators1 {
    public static void main(String[] args) {
        int a1 = 5;   // 0101
          int b1 = 3;   // 0011
         int c = a1 & b1;  // 0001 = 1                 // Bitwise AND operator(works on integer types(int, long, byte, short)
         System.out.println(c);  // Output: 1




         int a = 3, b = 2;

        if (a-- < b && b++ > 2)          // Short-circuit AND operator      (only evaluates the second operand if the first is true)                                 // use 
            a--;                          // use for checking primary and secondary conditions
        System.out.println(a + " " + b);   //  works on boolean operands




          int x = 5, y = 10;
        if (x < 10 & ++y > 10) {    // Logical AND operator (evaluates both operands)   // works on boolean operands
            System.out.println("Logical AND: " + y);  // y becomes 11
        }



        // unary operators : ++, --, !, 



    }
}
