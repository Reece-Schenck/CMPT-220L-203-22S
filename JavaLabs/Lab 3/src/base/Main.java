package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        if(true){
            System.out.println("if statement");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        boolean variable1 = false;
        if(variable1){
            System.out.println("if statement");
        }else{
            System.out.println("else satement");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        boolean variable2 = false;
        if(variable2){
            System.out.println("if statement");
        }else if(variable2==false){
            System.out.println("else if statement");
        }else{
            System.out.println("else satement");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        int a = 1;
        int b = 2;
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        char first = 'f';
        char second = 's';
        if(first == 'f' && first != second){
            System.out.println("first");
        }else{
            System.out.println("second");
        }
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        double number = 0.5;
        if(number == 1 || number < 1){
            System.out.println("equal to or less than 1");
        }else{
            System.out.println("greater than 1");
        }
    }
}
