public class EvenOddSegregation {

    public static void main(String[] argv) {
        int[] arr = {6,5,4,3,2,1};
        EvenOddSegregation evenOddSegregation = new EvenOddSegregation();
        evenOddSegregation.segregateEvenOdd(arr);
        for (int element : arr){
            System.out.print(element + " ");
        }
    }

    boolean isEven(int num){
        return num % 2 == 0;
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
                    continue;
                }
            }
            found = innerfound;
        }
    }

    public void segregateEvenOdd(int[] arr){
        sortArray(arr);
        int leftPtr = 0, rightPtr = 0;
        while(leftPtr < arr.length && rightPtr < arr.length){
            if (isEven(arr[leftPtr])){
                if(leftPtr < arr.length - 1) leftPtr++;
                if (rightPtr < arr.length - 1) rightPtr++;
            } else {
                while(! isEven(arr[rightPtr])){
                    if (rightPtr < arr.length-1) {
                        rightPtr++;
                    }
                    else break;
                }
                int temp = arr[leftPtr];
                arr[leftPtr] = arr[rightPtr];
                arr[rightPtr] = temp;
                leftPtr++;
                rightPtr++;
            }
        }
    }
}

