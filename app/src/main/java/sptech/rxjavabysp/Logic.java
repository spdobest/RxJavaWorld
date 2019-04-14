package sptech.rxjavabysp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Logic {


    public static void main(String... args) {


        Logic logic = new Logic();


        Integer[] array = {4, 3, 7, 9, 15};
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(array));

        Collections.sort(arr);

        for (int i = arr.size() - 1; i >= 0; i--) {

            if (logic.isFibanoci(arr.get(i))) {
                System.out.println("Fibonaci is " + arr.get(i));
                break;
            } else {

                if (i == 0) {
                    System.out.println("Fibonaci is not avilable ");
                }
            }
        }
    }

    public boolean isFibanoci(int num) {

        boolean isFIb = false;

        int a = 0, b = 1;

        int c = a + b;

        while (c <= num) {
            if (c == num) {
                isFIb = true;
                break;
            } else {
                a = b;
                b = c;
                c = a + b;
            }
        }
        return isFIb;
    }

}
