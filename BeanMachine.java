import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class BeanMachine {
    public static final int NUMBER_OF_SLOTS = 8;

    public static void main(String[] args) {
        Random random = new Random();

        int[] slots = new int[NUMBER_OF_SLOTS];

        System.out.print("Enter the number of beans to drop: ");
        Scanner scanner = new Scanner(System.in);
        int num_beans = scanner.nextInt();

        // drop each bean.
        // TO DO: implement the simulation of a bean dropping into a slot.

        for (int bean = 0; bean < num_beans; bean++) {
            int slot = 0;

            for (int i = 0; i < NUMBER_OF_SLOTS - 1; i++) {
                int dir = random.nextInt(2);
                slot += dir;
            }
            slots[slot]++;
        }
        // print out results.
        System.out.println(Arrays.toString(slots));
        System.out.println();

        displayBeans(slots);
    }

    // generate ascii art version of bean box.
    // this doesn't work well for large number of beans.
    // if you use this method, limit number of beans to 20.
    public static void displayBeans(int[] a) {
        // how tall should the display be?
        int height = maxElement(a);

        // build graph
        for (int i = height - 1; i >= 0; i--) {
            System.out.print("|");
            for (int j = 0; j < NUMBER_OF_SLOTS; j++) {
                if (a[j] > i) {
                    System.out.print("*|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
        for (int j = 0; j < NUMBER_OF_SLOTS; j++) {
            System.out.print("__");
        }
        System.out.println("");
    }

    public static int maxElement(int[] a) {
        int height = a[0];
        for (int i = 1; i < a.length; i++) {
            height = Math.max(height, a[i]);
        }
        return height;
    }
}