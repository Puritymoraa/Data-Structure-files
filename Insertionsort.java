import java.util.Arrays; 
public class Insertionsort {
    public static void main(String[] args) {
    int[] numbers = {9, 5, 8, 3, 6}; // Our unsorted array
    for(int j= 1; j < numbers.length; j++){
        int key = numbers[j];
        int i = j-1;
        while(i>=0 && numbers[i] > key){
            numbers[i+1] = numbers[i];
            i = i-1;
        }
        numbers[i+1] = key;
    }
    System.out.println(Arrays.toString(numbers));
}
}
//Please note that key is our temporary variable
// as we change the values, we store an element in key so that we can change them as we continue sorting them.
