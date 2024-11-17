import java.util.Scanner;

public class Hanoi {
    public static void hanoi(int n, char from, char to, char aux) {
        int totalMoves = (1 << n) - 1; // Total moves = 2^n - 1

        for (int i = 1; i <= totalMoves; i++) {
            char moveFrom, moveTo;
            // Determine the source and destination pegs for the current move
            if (i % 3 == 1) {
                moveFrom = from;
                moveTo = to;
            } else if (i % 3 == 2) {
                moveFrom = from;
                moveTo = aux;
            } else {
                moveFrom = aux;
                moveTo = to;
            }

            // If n is even, swap the destination pegs for the first two moves
            if (n % 2 == 0) {
                char temp = moveTo;
                moveTo = moveFrom;
                moveFrom = temp;
            }

            System.out.printf("Move %d: Move Disk from %c to %c%n", i, moveFrom, moveTo);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();

        hanoi(n, 'A', 'C', 'B'); // A = source, C = destination, B = auxiliary

        scanner.close();
    }
}
