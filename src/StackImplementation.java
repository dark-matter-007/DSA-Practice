import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cases to test: ");
        int T = scanner.nextInt();
        scanner.nextLine(); // Flush the newline character left by nextInt

        while (T-- > 0) {
            MyStack sq = new MyStack();
            System.out.print("Enter input for case %d : ".formatted(T+1));
            String line = scanner.nextLine();
            Scanner ss = new Scanner(line);
            List<Integer> nums = new ArrayList<>();
            while (ss.hasNextInt()) {
                int num = ss.nextInt();
                nums.add(num);
            }
            int n = nums.size();
            int i = 0;
            while (i < n) {
                int QueryType = nums.get(i++);
                if (QueryType == 1) {
                    int a = nums.get(i++);
                    sq.push(a);
                } else if (QueryType == 2) {
                    System.out.print(sq.pop() + " ");
                }
            }
            System.out.println();

            System.out.println("~");
        }
        scanner.close();
    }
}


class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1){
            return -1;
        } else {
            return arr[top--];
        }
    }
}