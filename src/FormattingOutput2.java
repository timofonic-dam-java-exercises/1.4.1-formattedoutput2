/* 1.4 - Formatted Output
* * It formats the output showed at the screen.
* @author Timofonic
*/

public class FormattingOutput2 {
    public static void main (String[] args) {
        System.out.println(" Article      Price/box       N. boxes");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s   %8.2f    %6d\n",     "Apples", 4.5, 10);
        System.out.printf("%-10s   %8.2f    %6d\n",     "Pears", 2.75, 120);
        System.out.printf("%-10s   %8.2f    %6d\n",     "Avocados", 10.0, 6);
    }
}
