package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    //atributo

    private List<Item> ItemList;

    public CarrinhoCompras(){
        this.ItemList = new ArrayList<>();
    }

    public void adicionarItem(String Nome, double preco, int quantidade){
        boolean ItemExists = false;
        for (Item item : ItemList){
            if (item.getNome().equalsIgnoreCase(Nome)){
                item.setQuantidade(item.getQuantidade() + quantidade);
                ItemExists = true;
                break;
            }
        }
        if (!ItemExists){
            ItemList.add(new Item(Nome, preco, quantidade));
        }
    }
    public void  removerItem(String Nome){
        List<Item> itensParaRemover =  new ArrayList<>();
        for (Item i : ItemList){
            if (i.getNome().equalsIgnoreCase(Nome)){
                itensParaRemover.add(i);
            }
        }
        ItemList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        double total = 0.0;
        for (Item item : ItemList){
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(ItemList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("Camisa", 50, 2);
        carrinho.adicionarItem("Calça", 100, 1);
        carrinho.adicionarItem("Boné", 25, 3);

        // Exibindo itens
        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        // Calculando valor total
        System.out.println("Valor total do carrinho: R$" + carrinho.calcularValorTotal());

        // Removendo um item
        carrinho.removerItem("Calça");

        // Exibindo itens após a remoção
        System.out.println("Itens no carrinho após a remoção:");
        carrinho.exibirItens();

        // Calculando valor total após a remoção
        System.out.println("Valor total do carrinho após a remoção: R$" + carrinho.calcularValorTotal());
    }
}
