import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
// first parameter > second parameter return 1 means ASCENDING order
        TreeSet<Integer> ts = new TreeSet<>((x,y)-> x>y ? -1 : x==y ? 0 : 1);
        ts.add(2);
        ts.add(3);
        ts.add(2); // Duplicate will not be added
        ts.add(1); 
        ts.add(5);
        ts.add(3);
        for(int a:ts) {
            System.out.println(a);
        }
    }
}
