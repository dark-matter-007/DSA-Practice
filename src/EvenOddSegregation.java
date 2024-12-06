import java.util.Arrays;

public class EvenOddSegregation {

    public static void main(String[] argv) {
        int[] arr = {6,5,4,3,2,1};
        EvenOddSegregation evenOddSegregation = new EvenOddSegregation();
        evenOddSegregation.segregateEvenOdd(arr);
        evenOddSegregation.printArray(arr);
    }


    void printArray(int[] arr){
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }

    void sortArray(int[] arr) {
        boolean found = true;
        while (found) {
            boolean innerfound = false;
            for (int index = 1; index < arr.length; index++){
                if(arr[index]<arr[index-1]){
                    int temp = arr[index-1];
                    arr[index-1] = arr[index];
                    arr[index] = temp;
                    innerfound = true;
                }
            }
            found = innerfound;
        }
    }

    public void segregateEvenOdd(int[] arr){
        int[] evenNums = Arrays.stream(arr).filter(number -> number % 2 == 0).toArray();
        int[] oddNums = Arrays.stream(arr).filter(number -> number % 2 != 0).toArray();
        Arrays.sort(evenNums);
        Arrays.sort(oddNums);
        System.arraycopy(evenNums, 0, arr, 0, evenNums.length);
        System.arraycopy(oddNums, 0, arr, evenNums.length, oddNums.length);
    }
}

