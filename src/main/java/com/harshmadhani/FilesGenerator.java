package com.harshmadhani;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilesGenerator {

    public static void main(String[] args) {
        int startPoint = Integer.parseInt(args[0]);
        int endPoint = Integer.parseInt(args[1]);
        generateNumbers(startPoint, endPoint);
    }

    private static void generateNumbers(int startPoint, int endPoint) {
        List<Integer> numbers = (List)IntStream.range(startPoint, endPoint).boxed().collect(Collectors.toList());
        Collections.shuffle(numbers);

        try {
            FileWriter fileWriter = new FileWriter("inputfile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, 32678);
            ListIterator listIterator = numbers.listIterator();

            while(listIterator.hasNext()) {
                bufferedWriter.write(listIterator.next() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}