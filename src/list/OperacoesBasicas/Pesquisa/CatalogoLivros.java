package list.OperacoesBasicas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro ( String titulo, String autor, int anoPublicado){
        livroList.add(new Livro(titulo,autor, anoPublicado));
    }
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
for (Livro l : livroList){
    if (l.getAutor().equalsIgnoreCase(autor)){
        livrosAutor.add(l);
    }
}
        }
        return livrosAutor;
    }

    public List<Livro> pesquisarIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosINtervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <+ anoFinal){
                    livrosINtervaloAno.add(l);
                }
            }
        }
        return livrosINtervaloAno;
    }

    public Livro pesquisarTitulo(String titulo){
        Livro livroTitulo =  null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = l;
                    break;
                }
            }
        }
        return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("livro 4", "Autor 4", 2024);

        System.out.println(catalogoLivros.pesquisarAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarIntervaloAno(2020,2022));
        System.out.println(catalogoLivros.pesquisarTitulo("Livro 1"));
    }
}
