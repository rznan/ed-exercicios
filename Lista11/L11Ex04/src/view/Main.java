package view;

import controller.ImpressoraController;
import datastructures.genericQueue.Queue;

import javax.swing.*;

public class Main {
    public static int id = 0;
    public static Queue<String> fila = new Queue<>();
    public static void main(String[] args) {
        final ImpressoraController impressoraController = new ImpressoraController(fila);
        while(true) {
            if (getInputFromOptionDialog() == 0) {
                getNewFile(impressoraController);
                continue;
            }
            break;
        }
    }

    private static void getNewFile(ImpressoraController impressoraController) {
        JFileChooser fileChooser = new JFileChooser();
        int response = fileChooser.showOpenDialog(null);
        if(response == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsoluteFile().getName();
            System.out.println(filePath);
            impressoraController.insereDocumento(fila, id + ";" + filePath);
        }
    }

    private static int getInputFromOptionDialog() {
        String[] options = {"novo arquivo", "sair"};
        return JOptionPane.showOptionDialog(
                null,
                "SISTEMA DE IMPRESSÃO",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );
    }
}

