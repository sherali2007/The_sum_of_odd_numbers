package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	// write your code here
        int a = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=a; i++){
            if( i % 2 == 1){
                sum = sum + i;
            }
        }

        System.out.println(sum);

    }
}
