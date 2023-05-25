/*

    Write an algorithm to remove all the even numbers from the given ArrayList

 */

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int size = scanner.nextInt();

        for(int i = 0; i < size; i++){
            int el = scanner.nextInt();
            list.add(i, el);
        }

        scanner.close();

        removeEven(list);

        System.out.println(list);

    }

    public static void removeEven(ArrayList<Integer> list){

        for(int i = list.size() - 1; i >= 0; i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
    }
}
