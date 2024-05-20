package view;

import controller.ResidentHashTable;
import model.Resident;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ResidentHashTable DICT = new ResidentHashTable();

    public static void main(String[] args) {
        while(true) {
            showMenu();
            int opc = getInput();
            switch (opc) {
                case 1: registerResident();
                break;
                case 2: searchResident();
                break;
                case 3: deleteResident();
                break;
                case 4: listFloorResidents();
                break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println();
        }
    }

    private static void listFloorResidents() {
        System.out.print("NÚMERO DO ANDAR: ");
        int input = getIntInput();

        try {
            DICT.listFloorResidents(input);
        } catch (Exception e) {
            System.out.println("Número de apartamento inválido");
        }
    }

    private static void deleteResident() {
        System.out.print("Número do Apartamento: ");
        int input = getIntInput();

        try {
            DICT.delete(input);
        } catch (Exception e) {
            System.out.println("\nNúmero de apartamento Inválido");
        }
    }

    private static void searchResident() {
        System.out.print("Número do Apartamento: ");
        int input = getIntInput();

        System.out.println();

        try {
            Resident alvo = DICT.get(input);
            if(alvo == null) {
                System.out.println("Não existe um morador nesse apartamento");
            } else {
                System.out.println(alvo);
            }
        } catch (Exception e) {
            System.out.println("Número de apartamento Inválido");
        }
    }

    private static void registerResident() {
        int apartmentNumber;
        while(true) {
            System.out.print("Número do Apartamento: ");
            apartmentNumber = getIntInput();
            if(!(apartmentNumber > 1099 || apartmentNumber < 101)) {
                break;
            }
            System.out.println("Número Inválido");
        }
        System.out.print("Nome do Morador: ");
        String nome = sc.nextLine();

        System.out.print("Modelo do Carro: ");
        String modelo = sc.nextLine();

        System.out.print("Cor do Carro: ");
        String cor = sc.nextLine();

        System.out.print("Placa do Carro: ");
        String placa = sc.nextLine();

        Resident resident = new Resident();
        resident.setApartmentNumber(apartmentNumber);
        resident.residentName = nome;
        resident.carModel = modelo;
        resident.carColor = cor;
        resident.carPlate = placa;

        try {
            DICT.put(resident);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static int getInput() {
        int input;
        while(true) {
            input = getIntInput();

            if((input > 0 && input <= 4) || input == 9) {
                break;
            } else {
                System.out.println("Entrada Inválida");
                System.out.print("Escolha: ");
            }

        }
        return input;
    }

    private static int getIntInput() {
        int input;

        try {
            input = sc.nextInt();
            sc.nextLine();
            return input;
        } catch (InputMismatchException e) {
            System.out.println("Entrada Inválida");
            System.out.print("Escolha: ");
        }
        sc.nextLine();

        return getIntInput();
    }


    private static void showMenu() {
        System.out.print(
                """
                        SISTEMA DE CONTROLE CONDOMÍNIO
                        ------------------------------
                        1 | Cadastrar Residente
                        2 | Consultar Residente
                        3 | Deletar Residente
                        4 | Listar Residentes Andar
                        9 | Sair
                        ------------------------------
                        ESCOLHA:\s""");
    }
}
