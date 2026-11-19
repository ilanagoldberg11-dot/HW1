import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] arr, int shift, char direction) {
        if (direction != 'L' && direction != 'R') {
        return arr;
    }
    
    int n = arr.length;
    if (n == 0) {
        return arr; 
    }
    
    if (shift < 0) {
        direction = (direction == 'L') ? 'R' : 'L';
    }
    shift = Math.abs(shift) % n;
    
    if (shift == 0) {
        return arr;
    }
    
    if (direction == 'R') {
        shift = n - shift;
    }
    
    int[] temp = new int[shift];
    for (int i = 0; i < shift; i++) {
        temp[i] = arr[i];
    }
    for (int i = 0; i < n - shift; i++) {
        arr[i] = arr[i + shift];
    }
    for (int i = 0; i < shift; i++) {
        arr[n - shift + i] = temp[i];
    }
    
    return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}