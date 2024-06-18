package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefas> listaTarefasSet;

    public ListaTarefas() {
        this.listaTarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefasSet.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefas tarefaParaRemover = null;
        if (!listaTarefasSet.isEmpty()) {
            for (Tarefas t : listaTarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
        } else {
            System.out.println("A lista está vazia");
        }
        listaTarefasSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        if (!listaTarefasSet.isEmpty()) {
            System.out.println("Lista de Tarefas:");
            for (Tarefas tarefa : listaTarefasSet) {
                System.out.println(tarefa);
            }
        } else {
            System.out.println("Lista de tarefas vazia");
        }
    }

    public void contarTarefas() {
        if (!listaTarefasSet.isEmpty()) {
            System.out.println("A quantidade de tarefas é " + listaTarefasSet.size());
        } else {
            System.out.println("Você não tem tarefas");
        }
    }

    public void exibirTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = obterTarefasConcluidas();
        if (!tarefasConcluidas.isEmpty()) {
            System.out.println("Tarefas Concluídas:");
            for (Tarefas tarefa : tarefasConcluidas) {
                System.out.println(tarefa);
            }
        } else {
            System.out.println("Nenhuma tarefa concluída");
        }
    }

    public void exibirTarefasPendentes() {
        Set<Tarefas> tarefasPendentes = obterTarefasPendentes();
        if (!tarefasPendentes.isEmpty()) {
            System.out.println("Tarefas Pendentes:");
            for (Tarefas tarefa : tarefasPendentes) {
                System.out.println(tarefa);
            }
        } else {
            System.out.println("Nenhuma tarefa pendente");
        }
    }

    private Set<Tarefas> obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas t : listaTarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    private Set<Tarefas> obterTarefasPendentes() {
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for (Tarefas t : listaTarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefas t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefas t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        if (listaTarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia");
        } else {
            listaTarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.exibirTarefasPendentes();
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        listaTarefas.exibirTarefasConcluidas();
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
