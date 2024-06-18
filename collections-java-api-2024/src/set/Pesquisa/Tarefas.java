package set.Pesquisa;

public class Tarefas {
    private String descricao;
    private boolean concluida;

    public Tarefas(String descricao) {
        this.concluida = false;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + " | Concluída: " + (concluida ? "Sim" : "Não");
    }
}
