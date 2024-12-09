//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution2 {
    public boolean isIdentical(List<Integer> arr1, List<Integer> arr2) {
        for ( Integer elem : arr1 ){
            if ( !arr2.contains(elem) || Collections.frequency(arr1, elem) != Collections.frequency(arr2, elem) ) {
                return false;
            }
        }
        return true;
    }
}

//{ Driver Code Starts.
public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String line = sc.nextLine();
            List<Integer> arr1 = new ArrayList<>();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNextInt()) {
                arr1.add(lineScanner.nextInt());
            }
            line = sc.nextLine();
            List<Integer> arr2 = new ArrayList<>();
            lineScanner = new Scanner(line);
            while (lineScanner.hasNextInt()) {
                arr2.add(lineScanner.nextInt());
            }
            Solution2 ob = new Solution2();
            boolean ans = ob.isIdentical(arr1, arr2);
            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            lineScanner.close();

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends