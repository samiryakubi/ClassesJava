package com.class08;

public class TaskFor {

	public static void main(String[] args) {
	     
		for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
        for (int z = 1; z <= 20; z += 2) {
            System.out.println(z);
        }

        for (int k = 20; k >= 1; k--) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
        for (int m = 20; m >= 1; m -= 2) {
            System.out.println(m);
        }
        for (int f = 1; f <= 20; f += 3) {

            System.out.println(f);

        }
        for (int r = 20; r <= 50; r++) {
            if (r % 2 == 0) {
                System.out.println(r);
            }
        }
        for (int e = 20; e <= 50; e += 2) {
            System.out.println(e);
        }
        for (int w = 20; w <= 50; w++) {
            if (w % 2 != 0) {
                System.out.println(w);
            }
        }
        for (int p = 20; p <= 50; p += 2) {
            System.out.println(p);
        }

    }

}