package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>();
        System.out.println("Введите ArrayList: ");
        while (scanner.hasNextInt()){
            int i = scanner.nextInt();
            intList.add(i);
        }
        System.out.println(intList);
        int max = 0;
        for (int x : intList){
            if (x >= max){
                max = x;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Индекс последнего максимального: " + intList.lastIndexOf(max));
        Collections.sort(intList);
        System.out.println("Sort: \n" + intList);


    }
}
