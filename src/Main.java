import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        for (int c = 0; c <= 30; c ++) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");
        for (int c = 30; c >= 0; c --) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");
        for (int c = 0; c <= 18; c += 3) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");
        for (int c = 10; c >= 0; c -= 2) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        for (int row = 1; row <= 1; row ++) {
            for (int col = 1; col <= 1; col ++) {
                System.out.printf ("*", row * col);
            }
            System.out.println();
            for (int row2 = 1; row2 <= 2; row2 ++) {
                for (int col2 = 1; col2 <= 1; col2 ++) {
                    System.out.printf ("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 3; row2 ++) {
                for (int col2 = 1; col2 <= 1; col2 ++) {
                    System.out.printf ("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 4; row2 ++) {
                for (int col2 = 1; col2 <= 1; col2 ++) {
                    System.out.printf ("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 5; row2 ++) {
                for (int col2 = 1; col2 <= 1; col2 ++) {
                    System.out.printf ("*", row2 * col2);
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 5; row <= 5; row ++) {
            for (int col = 1; col <= 5; col++) {
                System.out.printf("*", row * col);
            }
            System.out.println();
            for (int row2 = 1; row2 <= 4; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 3; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 2; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 1; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row <= 5; row ++) {
            for (int col = 1; col <= 5; col++) {
                System.out.printf("*", row * col);
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 4; row <= 4; row ++) {
            for (int col = 1; col <= 4; col++) {
                System.out.printf("*", row * col);
            }
            System.out.println();
            for (int row2 = 1; row2 <= 6; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 7; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 7; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 6; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 5; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 6; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 7; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 8; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
            for (int row2 = 1; row2 <= 9; row2++) {
                for (int col2 = 1; col2 <= 1; col2++) {
                    System.out.printf("*", row2 * col2);
                }
            }
            System.out.println();
        }
    }
}