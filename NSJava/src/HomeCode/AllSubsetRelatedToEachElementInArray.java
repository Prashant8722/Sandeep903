package HomeCode;

public class AllSubsetRelatedToEachElementInArray {
    private static void allElementInArray(int[] arr,int start, int end){
        if(start == arr.length)
            return;
        for(int i =start;i<=end;i++) {
            for (int j = start; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        start++;
        end = start;
        allElementInArray(arr, start ,arr.length-1);

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        allElementInArray(arr, 0 ,arr.length-1);
    }
}
