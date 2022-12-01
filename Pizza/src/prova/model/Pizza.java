package prova.model;

public class Pizza {
    private String sabor;
    private String tamanho;
    private int preco ;

    public Pizza(){ }

    public Pizza(String sabor, String tamanho, int preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getSabor(){return sabor;}

    public void setSabor(String sabor){this.sabor = sabor;}

    public String getTamanho(){return tamanho;}

    public void setTamanho(String tamanho){this.tamanho = tamanho;}

    public int getPreco(){return preco;}

    public void setPreco(int preco){this.preco = preco;}
}
