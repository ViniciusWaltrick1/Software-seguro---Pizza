package prova.controller;

import prova.dao.ListarDAO;
import prova.model.Pizza;
import prova.view.ListarView;

import java.util.List;

public class ListarController {

    public ListarController() {
        ListarDAO listarDAO = new ListarDAO();
        List<Pizza> pizzas = listarDAO.listapizzas();

        ListarView listarview = new ListarView();
        listarview.listarView(pizzas);
    }
}
