// Lambda Expression represents the Object of a Functional Interface
// Its is the implementation of the only abstract method of Functional Interface
//A concise way to represent an anonymous function
/*
 ()-> {}

 */

 // 2. two types - Block Lambda and Expression Lambda
// Block Lambda - if the body of the lambda expression contains more than one statement
// Expression Lambda - if the body of the lambda expression contains only one statement


/*
1)) interface A {
        int compare(intx, inty); 
        }

   //Block lambda

   (int x, int y) -> {
       if(x>y) return 1;
       else if(x<y) return -1;
       else return 0;
   }
    
// Expression lambda

(intx, int y) -> x > y ? 1 : (x < y ? -1 : 0);

// 2 optimizations in right side of the arrow
// a. If the body of the lambda expression contains only one statement, we can remove the curly braces
// If we are removing the curly braces,and if return is present we need to remove the return type as well
// b. If the body of the lambda expression contains only one statement, we can remove the return keyword

    
 1 if the parameters of the lambda expression are of same type, we can remove the type declaration
(intx, int y) -> x > y ? 1 : (x < y ? -1 : 0); can be written as
// (x, y) -> x > y ? 1 : (x < y ? -1 : 0); if all parameters are of same type


2. If single parameter is present, we can remove the parentheses as well as declaration of type
// (int x) -> x > 0 ? "Positive" : "Negative"; can be written as
// x -> x > 0 ? "Positive" : "Negative"; 







2)) interface A {
boolean test(int a, double b);
   ****if b is 10% of a, return true

(int x, double p) -> {
   if(p == 0.1 * x) return true;
   else return false;

   or

 (int x, double p) -> p == 0.1 * x ? true : false;
 
   or

   (int x, double p) -> p == 0.1 * x;
}



3))interface ArraySum{
void sum(int arr[])
 ***print sum of all elements in the array
}


 (int arr[]) -> {
   int sum = 0;
   for(int a: arr) {
       sum += a;
   }
   System.out.println(sum);


   or
  
   import java.util.Arrays;
    (int arr[]) -> {    
        System.out.println(Arrays.stream(arr).sum());
    }


    interface A {
     double interrest(int amount, double r, int years);}

     (int amount, double r, int years) -> {
         double interest = (amount * r * years) / 100;
         return interest;
     }
                         or
     (int amount, double r, int years) -> (amount * r * years) / 100;
// 
 */








public class LamdaExpression {
    
}
