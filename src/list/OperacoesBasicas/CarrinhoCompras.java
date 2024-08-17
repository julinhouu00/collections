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
}


