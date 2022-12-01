package prova.view;

import prova.model.Pizza;

import java.util.List;

public class ListarView {
    public void listarView(List<Pizza> pizzas) {
        for (Pizza pizza : pizzas) {
            System.out.println("Pizza:" + System.lineSeparator() + "Sabor: " + pizza.getSabor() + System.lineSeparator() +
                    "Tamanho: " + pizza.getTamanho() + System.lineSeparator() + "Preco: " + pizza.getPreco() + System.lineSeparator());
        }
    }
}