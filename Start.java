import java.util.List;

public class Start {
    public static void main(String[] args) {
        // Problema do Ciclo Hamiltoniano
        Grafo grafoCiclo = new Grafo(3);
        grafoCiclo.adicionarAresta(0, 1);
        grafoCiclo.adicionarAresta(0, 2);
        grafoCiclo.adicionarAresta(1, 2);

        AlgoritmoGenetico algoritmoCiclo = new AlgoritmoGenetico(grafoCiclo, 3, 6);
        Solucao solucaoCiclo = algoritmoCiclo.resolver();

        if (solucaoCiclo != null) {
            System.out.println("A solução para o Ciclo Hamiltoniano é: " + solucaoCiclo);
        } else {
            System.out.println("Nenhuma solução encontrada para o Ciclo Hamiltoniano.");
        }

        // Problema de Satisfatibilidade Booleana
        AlgoritmoGeneticoSAT algoritmoSAT = new AlgoritmoGeneticoSAT(3, 6);
        List<Boolean> solucaoSAT = algoritmoSAT.resolver();

        System.out.println("A melhor solução para a Satisfatibilidade Booleana é: " + solucaoSAT);
    }
}
