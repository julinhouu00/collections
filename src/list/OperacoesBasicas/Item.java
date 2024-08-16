package list.OperacoesBasicas;

public class Item {
    private String Nome;
    private double preco;
    private int quantidade;

   public Item(String Nome, double preco, int quantidade){
       this.Nome = Nome;
       this.preco = preco;
       this.quantidade = quantidade;
   }

    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return Nome + preco +  quantidade ;
    }
}
