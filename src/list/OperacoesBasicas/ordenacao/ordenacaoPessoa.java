package list.OperacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoPessoa {
//atributo
   private List<Pessoa> pessoaList;

    public ordenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String Nome, int idade, double altura){
pessoaList.add(new Pessoa(Nome, idade, altura));
    }

public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
}

public List<Pessoa>ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
}

    public static void main(String[] args) {
        ordenacaoPessoa ordenacaoPessoa = new ordenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("nome 1", 20,1.65);
        ordenacaoPessoa.adicionarPessoa("nome 2", 30,1.80);
        ordenacaoPessoa.adicionarPessoa("nome 3", 25,1.70);
        ordenacaoPessoa.adicionarPessoa("nome 4", 17,1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
