package dsa;

import java.util.LinkedList;
import java.util.Iterator;

public class AddTwoNumbers {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(9);
        l1.add(8);
        l1.add(1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(9);
        l2.add(8);
        l2.add(1);

         addTwoNumbers(l1, l2);

    }

    public static void addTwoNumbers(
            LinkedList<Integer> l1,
            LinkedList<Integer> l2) {

        int l1Size = l1.size()-1;
        int l2Size = l2.size()-1;
        int carry = 0;
        //989
        //989
        //  2098
        LinkedList<Integer> result = new LinkedList<>();
        int i = l1.size() - 1;
        int j = l2.size() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {

            int val1 = (i >= 0) ? l1.get(i--) : 0;
            int val2 = (j >= 0) ? l2.get(j--) : 0;

            int sum = val1 + val2 + carry;

            result.addFirst(sum % 10);
            carry = sum / 10;
        }

        System.out.println(result);
       //merge two sorted array
    }
}
