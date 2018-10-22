package com.company;

import java.util.ArrayList;

public class Validation {
    public static Boolean isProper(ArrayList arr){
        if((Math.sqrt(arr.size()) - Math.round(Math.sqrt(arr.size()))) > 0.0){
            System.out.println("This is not a square!");
            return false;
        }
        return true;
    }

    //checks the correctness of rows (sums of all rows should be the same)
    public static Boolean checkRows(ArrayList arr){
        ArrayList<Integer> list = arr;
        Integer sum = 0;

        if(!isProper(list)) return false;

        Integer size = (int)Math.sqrt(list.size());

        for(int i=0; i<size; i++)
            sum += list.get(i);

        Integer check = 0;
        for(int j=0; j<size; j++) {
            check = 0;
            for (int i = 0; i < size; i++) {
                check += list.get(i + (j * size));
            }
            if (!sum.equals(check)) {
                return false;
            }
        }
        return true;
    }
    //checks the correctness of columns (sums of all columns should be the same)
    public static Boolean checkColumns(ArrayList arr){
        ArrayList<Integer> list = arr;
        Integer sum = 0;

        if(!isProper(list)) return false;

        Integer size = (int)Math.sqrt(list.size());
        for(int i=0; i<size; i++)
            sum += list.get(i);

        Integer check = 0;
        for(int j=0; j<size; j++){
            check = 0;
            for(int i=0; i<size; i++){
                check += list.get(j + i*size);
            }
            if(!sum.equals(check))
                return false;
        }
        return true;
    }

    //checks the correctness of diagonals (sums of all diagonals should be the same)
    public static Boolean checkDiagonals(ArrayList arr) {
        ArrayList<Integer> list = arr;
        Integer sum = 0;

        if(!isProper(list)) return false;

        Integer size = (int) Math.sqrt(list.size());

        for (int i = 0; i < size; i++)
            sum += list.get(i);

        Integer check = 0;
        for (int i = 0; i < size; i++) {
            check += list.get(i + i*size);
        }
        if (!sum.equals(check))
            return false;

        check = 0;
        for (int i=0; i<size; i++){
            check += list.get(size-1-i);
        }
        if (!sum.equals(check))
            return false;

        return true;
    }
}
