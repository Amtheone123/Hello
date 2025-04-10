public class BuggyProgram {
    public static void main(String[] args) {
        int x = 5; // fixed: use an integer

        for (int i = 0; i < 10; i++) { // fixed: i++, removed semicolon
            System.out.println("Number is " + i); // fixed: added semicolon
        }

        if (x == 5) // fixed: == instead of =
            System.out.println("x is 5");
        else
            System.out.println("x not 5");

        int[] nums = new int[5];
        nums[4] = 100; // fixed: use a valid index

        String name = "Default"; // fixed: avoid null
        System.out.println(name.length()); // safe to call length()

        int z = divide(5, 1); // fixed: no division by zero
        System.out.println("Result is: " + z);
    }

    public static int divide(int a, int b) {
        return a / b; // fixed: added semicolon
    }
}
}}}}}
