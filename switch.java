// This program demonstrates the switch statement in Java.
class Switch {
    public static void main(String a[]) {
        int n = 6;  // Assigning value 6 to variable n
        
        // Switch statement to print the day of the week based on the value of n
        switch (n) {
            case 1:
                System.out.println("Monday");  // Print Monday if n is 1
                break;
            case 2:
                System.out.println("Tuesday");  // Print Tuesday if n is 2
                break;
            case 3:
                System.out.println("Wednesday");  // Print Wednesday if n is 3
                break;
            case 4:
                System.out.println("Thursday");  // Print Thursday if n is 4
                break;
            case 5:
                System.out.println("Friday");  // Print Friday if n is 5
                break;
            case 6:
                System.out.println("Saturday");  // Print Saturday if n is 6
                break;
            case 7:
                System.out.println("Sunday");  // Print Sunday if n is 7
                break;
            default:
                System.out.println("Type a valid number!");  // Print if n is not between 1 and 7
        }
    }
}
