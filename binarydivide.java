import java.util.Scanner;

public class binarydivide {

    public int binaryre(int[] inputArr, int key, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                return binaryre(inputArr, key, start, mid - 1);
            } else {
                return binaryre(inputArr, key, mid + 1, end);
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        binarydivide bs = new binarydivide();
        int N = 1000;
        int[] arr1 = int[N];
        for(int i = 0; i<N ; i++){
        
            arr1[i] = i;
        }
        
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your element ");
        int x = scan.nextInt();
        System.out.println("Key position is  " + bs.binaryre(arr1, x, 0, N - 1));

    }
}
