package prova.view;

import java.util.Scanner;

public class MenuView {

    public int menu() {

        Scanner sc = new Scanner(System.in);

        int escolha;

        System.out.println("Opcoes:" + System.lineSeparator() +
                "1 cadastrar" + System.lineSeparator() +
                "2 listar" + System.lineSeparator() +
                "Digite sua opcao:");

        escolha = sc.nextInt();

        return escolha;

    }

}