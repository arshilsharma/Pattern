package com.arshilsharma;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Please Enter The Value Of n (no of rows) : ");
        n = scanner.nextInt();
        System.out.println("No. Of rows : " + n + "\n");

        int i,j;
        int num =1;

        int k = (n * ( n + 1)) - (n);


        for (i = n; i > 0; i--) {

            for (j=1; j <= n-i ; j++ ){
                System.out.print("--");
            }

            for(j=1; j<=i; j++){
                System.out.print(num + "*");
                num ++;
            }

            for (j=1; j<=i;j++ ){
                k++;
                System.out.print( k + "*");

            }
            k = k - ((2*i)-1)  ;
            System.out.println();

        }

    }
}
