package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
        System.out.println("Choose number of columns");
        int column = input.nextInt();
        System.out.println("Choose number of rows");
        int row = input.nextInt();
        column = column - 1;
        row = row - 1;
        int k = 0;
        for (int i = 0; i <column +1; i++){
            System.out.println();
            for (int j = 0; j < row; j++){
                System.out.print(k);
                System.out.println(" [" +k+"]");
                k= k + 1;
            }
        }
    }
}
