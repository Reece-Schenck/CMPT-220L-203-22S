package base;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        String answer = "c";

        switch(answer){
            case "a":
                System.out.println("The answer was a");
                break;
            case "b":
                System.out.println("The answer was b");
                break;
            case "c":
                System.out.println("The answer was c");
                break;
            default:
                System.out.println("The answer was d");
        }
        // Give me an example of you using a for loop
        for (int x = 0; x < 10; x++) {
            System.out.println("Current number: " + x);
        }

        // Give me an example of you using a while loop
        int position = 0;
        int location = 10;
        while (position != location) {
            System.out.println("Are we there yet?");
            position++;
        }
        System.out.println("Yes");

        // For the following todos you'll probably want to define them below and then call them from the main function above.
        double power_test = power(2, 3);
        System.out.println(power_test);

        int[] test_array = {2,3,5,2,3,6,7,8,2};
        int number = 2;
        int count_list_test = count_list(test_array, number);
        System.out.println(count_list_test);

        int[] test_array2 = {2,3,5,9,1,6,7,8,4};
        int summation_test = summation(test_array2);
        System.out.println(summation_test);

        double pythagorean_theorem_test = pythagorean_theorem(2, 3);
        System.out.println(pythagorean_theorem_test);

    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    static double power(int value, int exponent){
        double answer = Math.pow(value, exponent);
        return answer;
    }

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    static int count_list(int[] array, int target){
        int count = 0;
        for(int number:array){
            if(number == target){
                count++;
            }
        }
        return count;
    }

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */
    static int summation(int[] array){
        int sum = 0;
        for(int number:array){
            sum = sum + number;
        }
        return sum;
    }

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */
    static double pythagorean_theorem(int a, int b){
        a = (int) power(a, 2);
        b = (int) power(b, 2);
        double sum = addition(a, b);
        double c =Math.sqrt(sum);
        return c;
    }

    static int addition(int a, int b) {
        int answer = a + b;
        return answer;
    }

    static int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}
