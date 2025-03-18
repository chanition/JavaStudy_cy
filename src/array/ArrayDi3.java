package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];



        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int cloumn = 0; cloumn < arr[row].length; cloumn++) {
                arr[row][cloumn] = i++;
            }

        }
        for (int row = 0; row < arr.length; row++) {
            for (int cloumn = 0; cloumn < arr[row].length; cloumn++) {
                System.out.print(arr[row][cloumn] + " ");

            }


            System.out.println();
        }
    }
}
