package list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void acicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
     Convidado convidadoParaRemover = null;
     for (Convidado c : convidadoSet){
         if (c.getCodigoConvite() == codigoConvite){
             convidadoParaRemover = c;
             break;
         }
     }
     convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }
    public  void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.acicionarConvidado("Convidado1",1234);
        conjuntoConvidados.acicionarConvidado("Convidado2",1234);
        conjuntoConvidados.acicionarConvidado("Convidado3",9101112);
        conjuntoConvidados.acicionarConvidado("Convidado4",13141516);
        conjuntoConvidados.acicionarConvidado("Convidado5",17181920);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }


}
