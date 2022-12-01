package prova.dao;

import prova.model.Pizza;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDAO {
    private Conexao con;
    PreparedStatement ps; //nao esta como privado, pois o sonarlint, reclama d erro "Private fields only used as local variables in methods should become local variables"

    public CadastroDAO(){
        con = new Conexao();
    }

    public Boolean cadastrarpizza(Pizza u){

        try{
            String query = "insert into pizzas  values (?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);

            if (u.getSabor() == null || u.getTamanho() == null) {
                return false;
            }else if (u.getSabor().isEmpty() || u.getTamanho().isEmpty()){
                return false;
            }else{
                ps.setString(1, u.getSabor());
                ps.setString(2, u.getTamanho());
                ps.setInt(3, u.getPreco());

                ps.execute();

                return true;
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }

        return true;

    }
}
