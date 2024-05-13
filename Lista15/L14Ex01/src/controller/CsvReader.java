package controller;

import datastrucures.genericList.List;

import java.io.*;

public abstract class CsvReader {
    public static List<Integer> readAllIntegers(String fileName, String dirPath) throws IOException {
        File f = new File(dirPath, fileName + ".csv");
        if(f.exists()) {
            if(f.isFile()) {
                List<Integer> list = new List<>();

                FileInputStream s = new FileInputStream(f);
                InputStreamReader r = new InputStreamReader(s);
                BufferedReader buffer = new BufferedReader(r);

                String line;
                int cont = 1;
                while((line = buffer.readLine()) != null) {
                    try {
                        int number = Integer.parseInt(line);
                        list.addLast(number);
                    } catch (NumberFormatException e) {
                        System.err.println("linha " + cont + " não é um número");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                buffer.close();
                return list;
            }
        }

        throw new IOException("Arquivo Inválido");
    }
}
