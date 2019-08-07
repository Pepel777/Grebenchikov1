import java.util.Scanner;

public class Grebenchikov1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите пять целых чисел:");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0){
                System.out.println(arr[i]);
            }
        }
    }
}
