import java.util.ArrayList;
import java.util.List;

class Solucao {
    private List<Integer> ordemDosVertices;

    public Solucao(Grafo grafo) {
        ordemDosVertices = new ArrayList<>(grafo.getNumVertices());
        for (int i = 0; i < grafo.getNumVertices(); i++) {
            ordemDosVertices.add(i);
        }
        // Embaralhe a ordem inicial para criar uma solução aleatória
        java.util.Collections.shuffle(ordemDosVertices);
    }

    public void mutar() {
        // Implemente a lógica de mutação, como trocar a posição de dois vértices
        // Pode ser usado, por exemplo, Collections.swap(ordemDosVertices, i, j);
    }

    public boolean ehCicloHamiltoniano(Grafo grafo) {
        // Verifica se a solução forma um ciclo hamiltoniano válido
        if (ordemDosVertices.size() != grafo.getNumVertices()) {
            return false; // Não é um ciclo se não visitar todos os vértices
        }

        for (int i = 0; i < ordemDosVertices.size() - 1; i++) {
            int verticeAtual = ordemDosVertices.get(i);
            int proximoVertice = ordemDosVertices.get(i + 1);
            if (!grafo.obterVizinhos(verticeAtual).contains(proximoVertice)) {
                return false; // Não é uma aresta válida no grafo
            }
        }

        // Verifica a última aresta para formar o ciclo
        int ultimoVertice = ordemDosVertices.get(ordemDosVertices.size() - 1);
        int primeiroVertice = ordemDosVertices.get(0);
        return grafo.obterVizinhos(ultimoVertice).contains(primeiroVertice);
    }

    @Override
    public String toString() {
        return "Solucao{" + "ordemDosVertices=" + ordemDosVertices + '}';
    }
}