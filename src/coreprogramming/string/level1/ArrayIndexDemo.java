package coreprogramming.string.level1;

import java.util.Scanner;

class ArrayIndexDemo {

    static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception generated");
        }

        handleException(names);
    }
}
