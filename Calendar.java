import java.util.Scanner;

class Day {
    String name;
    int date;
    String description;

    Day(String name, int date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }
}

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Day[] week = new Day[7];

        for (int i = 0; i < 7; i++) {
            System.out.printf("Enter day name, date, and activity for day %d:\n", i + 1);
            String name = scanner.next();
            int date = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String description = scanner.nextLine();
            week[i] = new Day(name, date, description);
        }

        System.out.println("\n--- Weekly Calendar ---");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Day %d: %s, Date: %d, Activity: %s\n", i + 1, week[i].name, week[i].date, week[i].description);
        }
    }
}