import java.util.ArrayList;
import java.util.List;

class Grafo {
    private int numVertices;
    private List<List<Integer>> adjacencias;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencias = new ArrayList<>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            adjacencias.add(new ArrayList<>());
        }
    }

    public void adicionarAresta(int origem, int destino) {
        adjacencias.get(origem).add(destino);
        adjacencias.get(destino).add(origem);
    }

    public List<Integer> obterVizinhos(int vertice) {
        return adjacencias.get(vertice);
    }

    public int getNumVertices() {
        return numVertices;
    }
}