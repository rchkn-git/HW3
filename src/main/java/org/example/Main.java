package org.example;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i<10; i++){
            integers.add(new Random().nextInt(50));
        }
        System.out.println("Список чисел: " + integers);
        int min = 51;
        int max = 0;
        int srarifm = 0;
        int count = 0;

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < min) {
                min = integers.get(i);
            }
            if (integers.get(i) > max) {
                max = integers.get(i);
            }
            srarifm += integers.get(i);
            count++;
        }
        srarifm = srarifm/count;

        for (int i = 0; i < integers.size(); i++){
            if (integers.get(i) % 2 == 0){
                integers.remove(i);
//                i =- 1;
            }

        }
        System.out.println("Список после удаления чисел, кратных двум: " + integers);
        System.out.println("Минимальное значение (до удаления четных) = " + min);
        System.out.println("Максимальное значение (до удаления четных) = " + max);
        System.out.println("Среднее (до удаления четных) = " + srarifm);
    }
}