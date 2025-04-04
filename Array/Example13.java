package Array;
public class Example13 {
    public static void createArray(int[] arr) {
        int size = arr.length; // Size of the input array
        
        for (int i = 0; i < size; i++) {
            int count = 0;
            
            // Count occurrences of arr[i] in the array
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
           
            if (count > size / 2) {
                System.out.println(arr[i] + " appears " + count + " times.");
                return;
            }
        }
        
        System.out.println("No element found with count greater than half the array size.");
    }

    public static void main(String[] args) {
        int[] arr = {10, 19, 15, 12, 11, 10};
        createArray(arr);
    }
}

