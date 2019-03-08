package lab2;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        System.out.println("Hello World!");
        new ArrayList();
        task10();
    }

    public static void task1(ArrayList<Integer> var0) {
        for(int var1 = 1; var1 <= 100; ++var1) {
            if (var1 % 13 == 0 || var1 % 17 == 0) {
                var0.add(var1);
            }
        }

        System.out.println(var0);
    }

    public static void task2(ArrayList<Integer> var0) {
        int var1 = 0;

        for(int var2 = 0; var2 < var0.size(); ++var2) {
            var1 += (Integer)var0.get(var2);
        }

        System.out.println(var1);
    }

    public static void task3() {
        Scanner var0 = new Scanner(System.in);
        boolean var2 = true;
        int var3 = var0.nextInt();

        for(int var4 = 2; var4 <= var3 / 2; ++var4) {
            int var1 = var3 % var4;
            if (var1 == 0) {
                var2 = false;
                break;
            }
        }

        if (var2) {
            System.out.println(var3 + " - РїСЂРѕСЃС‚РѕРµ С‡РёСЃР»Рѕ");
        } else {
            System.out.println(var3 + " - СЃРѕСЃС‚Р°РІРЅРѕРµ С‡РёСЃР»Рѕ");
        }

    }

    public static void task4() {
        int[][] var0 = new int[5][5];

        int var1;
        int var2;
        for(var1 = 0; var1 < var0.length; ++var1) {
            for(var2 = 0; var2 < var0[var1].length; ++var2) {
                var0[var1][var2] = (int)(Math.random() * 10.0D);
            }
        }

        for(var1 = 0; var1 < var0.length; ++var1) {
            System.out.println("");

            for(var2 = 0; var2 < var0[var1].length; ++var2) {
                System.out.print(var0[var1][var2] + " ");
            }
        }

        System.out.println();
        System.out.println("input x and delta");
        Scanner var6 = new Scanner(System.in);
        var2 = var6.nextInt();
        int var3 = var6.nextInt();

        for(int var4 = 0; var4 < var0.length; ++var4) {
            for(int var5 = 0; var5 < var0[var4].length; ++var5) {
                if (var0[var4][var5] == var2) {
                    System.out.println(var4 + " " + var5);
                    break;
                }
            }
        }

    }

    public static void task5() {
        int[] var0 = new int[4];
        byte var1 = 10;
        byte var2 = 99;

        int var3;
        for(var3 = 0; var3 < 4; ++var3) {
            var0[var3] = var1 + (int)(Math.random() * (double)var2);
        }

        for(var3 = 0; var3 < 4; ++var3) {
            System.out.print(" " + var0[var3] + " ");
        }

        Arrays.sort(var0);
        System.out.println(" ");
        System.out.println("sort");

        for(var3 = 0; var3 < 4; ++var3) {
            System.out.print(" " + var0[var3] + " ");
        }

    }

    public static void task6() {
        int[][] var0 = new int[5][5];

        int var1;
        int var2;
        for(var1 = 0; var1 < var0.length / 2 + 1; ++var1) {
            for(var2 = 0; var2 < var0[var1].length; ++var2) {
                if (var2 >= var1 && var2 < var0[var1].length - var1) {
                    var0[var1][var2] = 1;
                } else {
                    var0[var1][var2] = 0;
                }
            }
        }

        for(var1 = var0.length - 1; var1 >= var0.length / 2; --var1) {
            for(var2 = 0; var2 < var0[var1].length; ++var2) {
                if (var2 >= var0[var1].length - 1 - var1 && var2 <= var1) {
                    var0[var1][var2] = 1;
                } else {
                    var0[var1][var2] = 0;
                }
            }
        }

        for(var1 = 0; var1 < var0.length; ++var1) {
            for(var2 = 0; var2 < var0[var1].length; ++var2) {
                System.out.print(var0[var1][var2]);
            }

            System.out.println(" ");
        }

    }

    public static void task7() {
        int[] var0 = new int[4];
        byte var1 = 10;
        byte var2 = 99;

        int var3;
        for(var3 = 0; var3 < 4; ++var3) {
            var0[var3] = var1 + (int)(Math.random() * (double)var2);
        }

        for(var3 = 0; var3 < 4; ++var3) {
            System.out.print(" " + var0[var3] + " ");
        }

        var3 = 0;
        Arrays.sort(var0);
        System.out.println(" ");
        System.out.println("sort");

        while(var3 < 4) {
            System.out.print(" " + var0[var3] + " ");
            ++var3;
        }

    }

    public static void task8() {
        int[] var0 = new int[4];
        byte var1 = 10;
        byte var2 = 99;
        int var3 = 0;

        do {
            var0[var3] = var1 + (int)(Math.random() * (double)var2);
            ++var3;
        } while(var3 < 4);

        var3 = 0;

        do {
            System.out.print(" " + var0[var3] + " ");
            ++var3;
        } while(var3 < 4);

        var3 = 0;
        Arrays.sort(var0);
        System.out.println(" ");
        System.out.println("sort");

        do {
            System.out.print(" " + var0[var3] + " ");
            ++var3;
        } while(var3 < 4);

    }

    public static void task9() {
        String[] var0 = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] var1 = new String[]{"Spades", "Hearts", "Clubs", "Diamonds"};
        ArrayList var2 = new ArrayList();

        for(int var3 = 0; var3 < var1.length; ++var3) {
            for(int var4 = 0; var4 < var0.length; ++var4) {
                var2.add(var0[var4] + " of " + var1[var3]);
            }
        }

        System.out.println((String)var2.get((int)(Math.random() * 52.0D)));
    }

    public static void task10() {
        String[] var0 = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] var1 = new String[]{"Spades", "Hearts", "Clubs", "Diamonds"};
        ArrayList var2 = new ArrayList();

        for(int var3 = 0; var3 < var1.length; ++var3) {
            for(int var4 = 0; var4 < var0.length; ++var4) {
                var2.add(var0[var4] + " of " + var1[var3]);
            }
        }

        Collections.shuffle(var2);
        Iterator var5 = var2.iterator();

        while(var5.hasNext()) {
            String var6 = (String)var5.next();
            System.out.println(var6);
        }

    }
}

