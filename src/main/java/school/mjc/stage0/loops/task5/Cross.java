package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            int j = sideLength - 1 - i;
            for (int k = 0; k < sideLength; k++) {
                if (k == i || k == j)
                    System.out.print(8);
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
