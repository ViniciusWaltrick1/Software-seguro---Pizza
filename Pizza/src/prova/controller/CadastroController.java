package prova.controller;

import prova.dao.CadastroDAO;
import prova.model.Pizza;
import prova.view.CadastroView;


public class CadastroController {
    private final CadastroView aview;
    private final Pizza pizza;
    private final CadastroDAO adao;

    public CadastroController() {

        aview = new CadastroView();
        pizza = aview.cadastro(new Pizza());

        adao = new CadastroDAO();

        if (Boolean.TRUE.equals(adao.cadastrarpizza(pizza))) {
            aview.pizzaCadastrada();
        } else {
            aview.pizzaNaoCadastrada();
        }
    }
}
