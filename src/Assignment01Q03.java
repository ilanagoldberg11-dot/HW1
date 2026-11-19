public class Assignment01Q03 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int num1 = 1;
        int num2 = 1;
        int numOdd = 0;

        for (int i = 1; i <= x; i++) {
            if (i < x) {
                System.out.print(num1 + " ");
            } 
            else {
                System.out.print(num1);
            }
            
            if (num1 % 2 != 0) {
                numOdd++;
            }
            
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        System.out.println();       
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
