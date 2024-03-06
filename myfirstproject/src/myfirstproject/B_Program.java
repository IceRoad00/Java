package myfirstproject;

import java.util.Scanner;

public class B_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += start + before;
            month++;
        }
        while (money < 100) {
        	if(month>2);
            month++;
        }}}