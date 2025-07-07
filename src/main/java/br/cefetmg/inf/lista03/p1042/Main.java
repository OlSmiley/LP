package br.cefetmg.inf.lista03.p1042;

import java.util.Arrays;
import java.util.Scanner;

class NumberSet {
    private final int[] originalNumbers;
    private final int[] sortedNumbers;

    public NumberSet(int[] numbers) {
        this.originalNumbers = Arrays.copyOf(numbers, numbers.length);
        this.sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(this.sortedNumbers);
    }

    public void printSorted() {
        for (int num : sortedNumbers) {
            System.out.println(num);
        }
    }

    public void printOriginal() {
        System.out.println();
        for (int num : originalNumbers) {
            System.out.println(num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }

        NumberSet numberSet = new NumberSet(numbers);
        numberSet.printSorted();
        numberSet.printOriginal();
    }
}
