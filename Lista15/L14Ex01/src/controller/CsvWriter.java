package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class CsvWriter {
    public static void addLines(String[] lines, String fileName, String dirPath) throws IOException {
        File dir = new File(dirPath);
        File f = new File(dirPath, fileName + ".csv");
        if(dir.exists()) {
            if(dir.isDirectory()) {
                if(!f.exists()) {
                    createFile(fileName, dirPath);
                }
                FileWriter fw = new FileWriter(f, true);
                PrintWriter pw = new PrintWriter(fw);
                for(String line : lines) {
                    pw.write("\n");
                    pw.write(line);
                    pw.flush();
                }
                pw.close();
                fw.close();
            }
        }
        throw new IOException("Diretório Inválido");
    }

    private static void createFile(String fileName, String dirPath) throws IOException{
        File dir = new File(dirPath);
        File arq = new File(dirPath, fileName + ".csv");
        if(dir.exists() && dir.isDirectory()) {
            if(!arq.exists()) {
                FileWriter fw = new FileWriter(arq);
                PrintWriter pw = new PrintWriter(fw);
                pw.flush();
                pw.close();
                fw.close();
            }
            else {
                throw new IOException("Arquivo já existe");
            }
        }
        else {
            throw new IOException("Diretório Inválido");
        }
    }
}
