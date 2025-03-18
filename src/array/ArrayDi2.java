package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int cloumn = 0; cloumn < arr[row].length; cloumn++) {
                System.out.print(arr[row][cloumn] + " ");

            }


            System.out.println();
        }
    }
}
