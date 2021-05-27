package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MainDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Double> doubleLinkedList = new LinkedList<Double>();
        int count = 0;
        System.out.println("Введите ArrayList: ");
        while (scanner.hasNextDouble()) {
            double i = scanner.nextDouble();
            doubleLinkedList.add(i);
        }
        System.out.println(doubleLinkedList);

        System.out.println("В середине списка среднее арифметическое первого и последнего элемента: ");
        double average = (doubleLinkedList.getFirst() + doubleLinkedList.getLast())/2;
        doubleLinkedList.add(doubleLinkedList.size()/2, average);
        System.out.println(doubleLinkedList);

        Collections.sort(doubleLinkedList, Collections.reverseOrder());
        System.out.println(doubleLinkedList);
        for (double x : doubleLinkedList) {
            if (x == 0.0) {
                count++;
            }
        }
        if (count == 0.0) {
            System.out.println("В списке нет нулевых элементов");
        } else {
            System.out.println("В списке есть нулевые элементы");
        }

    }
}
