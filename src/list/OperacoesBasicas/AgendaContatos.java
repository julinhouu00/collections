package list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato (String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public  Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPOrNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPOrNome.add(c);
            }
        }
        return contatosPOrNome;
    }

    public Contato atualizarNUmeroContato(String nome, int numeronovo){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numeronovo);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
