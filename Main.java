public class BuggyProgram {
public static void main(String args) {
    int x = "hello"; // wrong type

    for (int i = 0; i < 10; i--); { // infinite loop + misplaced semicolon
        System.out.println("Number is " + i) // missing semicolon
    }

    if (x = 5) // = instead of ==
        System.out.println("x is 5");
    else
        System.out.println("x not 5");

    int[] nums = new int[5];
    nums[10] = 100; // out of bounds

    String name = null;
    System.out.println(name.length()); // null pointer

    int z = divide(5, 0); // division by zero
    System.out.println("Result is: " + z);
}

public static int divide(int a, int b) {
    return a / b
}
d
