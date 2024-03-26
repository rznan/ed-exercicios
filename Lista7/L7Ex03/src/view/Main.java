package view;

import controller.FatController;

public class Main {
    public static void main(String[] args) {
        FatController fatController = new FatController();
        System.out.println(fatController.fatorial(5));
    }
}
