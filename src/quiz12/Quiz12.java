/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author setia
 */
public class Quiz12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Tabel Array
        System.out.println("Contoh 1: Tabel Array");
        System.out.println("Index\tNilai");
        int nilai[] = {32, 12, 18, 54, 2};
        for (int counter = 0; counter < nilai.length; counter++) {
            System.out.println(counter + "\t" + nilai[counter]);
        }

        // 2. Penjumlahan Isi Array (for biasa)
        System.out.println("\nContoh 2: Penjumlahan Isi Array (for biasa)");
        int sum = 0;
        for (int counter = 0; counter < nilai.length; counter++) {
            sum += nilai[counter];
        }
        System.out.println("Jumlah dari nilai Array adalah " + sum);

        // 3. Penjumlahan Isi Array (for-each)
        System.out.println("\nContoh 3: Penjumlahan Isi Array (for-each)");
        int total = 0;
        for (int x : nilai) {
            total += x;
        }
        System.out.println("Jumlah dari nilai Array adalah " + total);

        // 4. Multidimensi Array Tabel
        System.out.println("\nContoh 4: Multidimensi Array Tabel");
        int arraypertama[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
        int arraykedua[][] = {{20, 21, 22, 23}, {33}, {1, 2, 3}};
        System.out.println("Ini adalah Array Pertama:");
        display(arraypertama);
        System.out.println("Ini adalah Array Kedua:");
        display(arraykedua);

        // 5. Isi Jumlah Nama Teman
        System.out.println("\nContoh 5: Isi Jumlah Nama Teman");
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa banyak nama teman yang kamu akan isi? ");
        int length = input.nextInt();
        String[] names = new String[length];
        for (int counter = 0; counter < length; counter++) {
            System.out.print("Isi Nama Teman " + (counter + 1) + ": ");
            names[counter] = input.next();
        }
        System.out.println("Teman-Teman Anda: ");
        for (int counter = 0; counter < length; counter++) {
            System.out.println((counter + 1) + ". " + names[counter]);
        }

        // 6. Parsing String Array
        System.out.println("\nContoh 6: Parsing String Array");
        String[] verbs = {"Ayo", "Semangat", "Belajar", "Java"};
        printArray(verbs);

        // 7. Pengurutan Nilai Array
        System.out.println("\n\nContoh 7: Pengurutan Nilai Array");
        double dArr[] = {3.2, 1.2, 9.7, 6.2, 4.5};
        System.out.println("Sebelum diurutkan:");
        for (double number : dArr) {
            System.out.println("Nilai = " + number);
        }

        Arrays.sort(dArr); // sorting array
        System.out.println("Nilai setelah diurutkan:");
        for (double number : dArr) {
            System.out.println("Nilai = " + number);
        }

        input.close();
    }

    public static void display(int[][] x) {
        for (int baris = 0; baris < x.length; baris++) {
            for (int kolom = 0; kolom < x[baris].length; kolom++) {
                System.out.print(x[baris][kolom] + "\t");
            }
            System.out.println();
        }
    }

    private static void printArray(String[] words) {
        for (String w : words) {
            System.out.printf("%s ", w);
        }
        System.out.println();
    }
}
