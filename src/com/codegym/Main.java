package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	khai bao hai bien so nguyen a, b. nhap gia tri cho a, b tu ban phim.
        int a, b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
//        su dung ham abs() de tra ve gia tri tuyet doi cua a,b.
        a = Math.abs(a);
        b = Math.abs(b);
//        kiem tra a, b co bang 0 hay khong
        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc so chung lon nhat ");
        }
/*       tim uoc so chung lon nhat cua a, b.
su dung vong lap kiem tra trong khi a khac b thi
neu a < b: a = a-b
con lai b = b-a
 */
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Uoc so chung lon nhat: " + a);

    }
}
