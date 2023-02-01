package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {

            // printing i spaces at
            // the beginning of each row
            for (int k = 1; k < i; k++)
                System.out.print(" ");

            // printing i to rows value
            // at the end of each row
            for (int j = i; j <= height; j++)
                System.out.print(8 + " ");

            System.out.println();
        }

        // for loop for printing lower half
        for (int i = height - 1; i >= 1; i--)
        {
            // printing i spaces at the
            // beginning of each row
            for (int k = 1; k < i; k++)
                System.out.print(" ");

            // printing i to rows value
            // at the end of each row
            for (int j = i; j <= height; j++)
                System.out.print(8 + " ");

            System.out.println();
        }
    }
}
