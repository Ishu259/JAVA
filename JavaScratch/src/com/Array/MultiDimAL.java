package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();   //[null,null...]

        //initialization -> to replace the null with another arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
