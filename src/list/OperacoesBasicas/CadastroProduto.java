package list.OperacoesBasicas;

import com.sun.source.tree.UsesTree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributo

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod,preco,quantidade));
    }

public Set<Produto> exibirProdutosNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return  produtosPorPreco;
    }
}
