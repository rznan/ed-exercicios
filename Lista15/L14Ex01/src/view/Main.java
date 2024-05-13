package view;

import controller.CsvReader;
import controller.CsvWriter;
import controller.Dicionario;
import datastrucures.genericList.List;

import java.io.IOException;

public class Main {
    private static final String INPUT_FILE_NAME = "ListaNumAleatorios";
    private static final String DIR_PATH = ".\\Lista14\\L14Ex01";

    public static void main(String[] args) {
        Dicionario dict = new Dicionario();
        String[] response = new String[dict.SIZE];

        try {
            List<Integer> numbers = CsvReader.readAllIntegers(INPUT_FILE_NAME, DIR_PATH);

            putAllNumbers(numbers, dict);

            createCsvResponse(dict, response);

            CsvWriter.addLines(response, "resposta", DIR_PATH);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void createCsvResponse(Dicionario dict, String[] response) {
        for(int i = 0; i< dict.SIZE; i++) {
            try {
                response[i] = dict.bucketToCsv(i);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static void putAllNumbers(List<Integer> numbers, Dicionario dict) {
        int numbersSize = numbers.size();
        for(int i=0; i<numbersSize; i++) {
            try {
                dict.put(numbers.get(i));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
