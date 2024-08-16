package list.OperacoesBasicas;

public class tarefa {
    //atributo
    private String descricao;

    public tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao ;
    }
}
