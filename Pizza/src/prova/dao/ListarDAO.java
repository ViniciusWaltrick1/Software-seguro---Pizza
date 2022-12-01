package prova.dao;

import prova.model.Pizza;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ListarDAO {

    ResultSet rs;
    PreparedStatement ps;
    private Conexao con;

    public ListarDAO() {
        this.con = new Conexao();
    }

    public List<Pizza> listapizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        try {

            String query = "select * from pizzas";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Pizza pizza = new Pizza();
                pizza.setSabor(rs.getString(1));
                pizza.setTamanho(rs.getString(2));
                pizza.setPreco(rs.getInt(3));

                pizzas.add(pizza);
            }

            return pizzas;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pizzas;
    }
}
