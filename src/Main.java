//{ Driver Code Starts

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = Integer.parseInt(scanner.nextLine());
//
//        Solution ob = new Solution();
//
//        while (t-- > 0) {
//            String line = scanner.nextLine();
//            Scanner lineScanner = new Scanner(line);
//            List<Integer> nums = new ArrayList<>();
//            while (lineScanner.hasNextInt()) {
//                nums.add(lineScanner.nextInt());
//            }
//            System.out.println(ob.maxTripletSum(nums));
//        }
//        scanner.close();
        Solution solution = new Solution();
        int[] nums = {5,2,3,4,1};
        System.out.println(solution.maxTripletSum(Arrays.stream(nums).boxed().toList()));
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the maximum triplet sum in the array.
    public int maxTripletSum(List<Integer> arr) {
        // Complete the function

        // GETTING POSSIBLE COMBINATIONS ON INDICES
        List<Integer[]> possible_indices = new ArrayList<>(List.of());
        for (Integer i : IntStream.range(0, arr.size()).toArray()){
            for (Integer j : IntStream.range(i+1, arr.size()).toArray()){
                for (Integer k : IntStream.range(j+1, arr.size()).toArray()){
                    Integer[] thisList = {i, j, k};
                    if(!possible_indices.contains(thisList)){
                        possible_indices.add(thisList);
                    }
                }
            }
        }

        List<Integer> sums = new ArrayList<>(List.of());

        for (Integer[] ind_set : possible_indices){
            int sum = Arrays.stream(ind_set).toList().stream().mapToInt(arr::get).sum();
            sums.add(sum);
        }

        if(!sums.isEmpty()){
            return Collections.max(sums);
        }

        return 0;
    }
}
