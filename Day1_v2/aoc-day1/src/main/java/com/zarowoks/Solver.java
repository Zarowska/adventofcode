package com.zarowoks;

import java.util.List;

public class Solver {

    
    private static Input input;

    Solver(Input argInput) {
        this.input= argInput;

    }

    int getResult() {
        int result = 0;

    List<String> passwords = input.readFile("C:\\Users\\oksana.zarowska\\Desktop\\JAVA\\adventofcode-main\\Day1_v2\\aoc-day1\\src\\main\\java\\com\\zarowoks\\file.txt"); 
       
       for (String elem : passwords) {
            String firstElem = elem;
            for(String elem2:passwords){
                if (Integer.parseInt(firstElem)+Integer.parseInt(elem2)==2020){
                    result = Integer.parseInt(firstElem)*Integer.parseInt(elem2);
         }
        }
      
        }

        return result;
    }

}