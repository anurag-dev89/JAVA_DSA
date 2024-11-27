import java.util.Scanner;
import java.util.Stack;

public class Suffix {

    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  // Convert char to int
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                    case '%': stack.push(a % b); break;
                    case '^': stack.push((int) Math.pow(a, b)); break; // Cast to int
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter postfix expression (e.g., 23 4 / 5 6 ^ *): ");
        String expr = scanner.nextLine().replaceAll("\\s+", ""); // Remove spaces for easier processing
        int result = evaluatePostfix(expr);
        System.out.println("Result: " + result);
        scanner.close();
    }
}