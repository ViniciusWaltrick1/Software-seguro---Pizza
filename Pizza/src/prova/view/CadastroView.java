package prova.view;

import prova.model.Pizza;

import java.util.Scanner;

public class CadastroView {
    Scanner sc;
    public CadastroView(){
        this.sc = new Scanner(System.in);
    }
    public Pizza cadastro(Pizza pizza){
        System.out.print("Sabor: ");
        pizza.setSabor(sc.nextLine());

        System.out.print("Tamanho: ");
        pizza.setTamanho(sc.nextLine());

        System.out.print("Preco: ");
        pizza.setPreco((sc.nextInt()));

        return pizza;
    }

    public void pizzaCadastrada(){
        System.out.println("Pizza cadastrada");
    }

    public void pizzaNaoCadastrada(){
        System.out.println("Pizza Não Cadastrada");
    }
}
