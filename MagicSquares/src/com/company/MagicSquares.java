package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquares {
    public static void main(String[] args) throws IOException{
        File luna = new File("Luna.txt");
        File mercury = new File("Mercury.txt");

        MagicSquares.printRows(Validation.checkRows(MagicSquares.scan(luna)));
        MagicSquares.printRows(Validation.checkRows(MagicSquares.scan(mercury)));
        MagicSquares.printColumns(Validation.checkColumns(MagicSquares.scan(luna)));
        MagicSquares.printColumns(Validation.checkColumns(MagicSquares.scan(mercury)));
        MagicSquares.printDiagonals(Validation.checkDiagonals(MagicSquares.scan(luna)));
        MagicSquares.printDiagonals(Validation.checkDiagonals(MagicSquares.scan(mercury)));
    }

    //prints answer
    public static void printRows(Boolean isOk){
        if(isOk)
            System.out.println("Rows are correct");
        else
            System.out.println("Rows are not correct");
    }
    //prints answer
    public static void printColumns(Boolean isOk){
        if(isOk)
            System.out.println("Columns are correct");
        else
            System.out.println("Columns are not correct");
    }
    //prints answer
    public static void printDiagonals(Boolean isOk){
        if(isOk)
            System.out.println("Diagonals are correct");
        else
            System.out.println("Diagonals are not correct");
    }
    //scans file (gets the square from file into ArrayList)
    public static ArrayList<Integer> scan(File f) throws IOException {

        ArrayList<Integer> list = new ArrayList<>();

        try {
            Scanner s = new Scanner(f);
            while (s.hasNext()) {
                list.add(Integer.parseInt(s.next()));
            }
            s.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return list;
    }


}
