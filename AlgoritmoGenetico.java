import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlgoritmoGenetico {

    private Grafo grafo;
    private int tamanhoPopulacao;
    private int numeroGeracoes;

    public AlgoritmoGenetico(Grafo grafo, int tamanhoPopulacao, int numeroGeracoes) {
        this.grafo = grafo;
        this.tamanhoPopulacao = tamanhoPopulacao;
        this.numeroGeracoes = numeroGeracoes;
    }

    public Solucao resolver() {
        List<Solucao> populacao = gerarPopulacaoInicial();

        for (int i = 0; i < numeroGeracoes; i++) {
            List<Solucao> populacaoSelecionada = selecionarPopulacao(populacao);
            populacao = aplicarMutacao(populacaoSelecionada);
        }

        return encontrarMelhorSolucao(populacao);
    }

    private List<Solucao> gerarPopulacaoInicial() {
        List<Solucao> populacao = new ArrayList<>();

        for (int i = 0; i < tamanhoPopulacao; i++) {
            Solucao solucao = new Solucao(grafo);
            populacao.add(solucao);
        }

        return populacao;
    }

    private List<Solucao> selecionarPopulacao(List<Solucao> populacao) {
        List<Solucao> populacaoSelecionada = new ArrayList<>();

        for (int i = 0; i < tamanhoPopulacao; i++) {
            Solucao pai = populacao.get(new Random().nextInt(populacao.size()));
            populacaoSelecionada.add(pai);
        }

        return populacaoSelecionada;
    }

    private List<Solucao> aplicarMutacao(List<Solucao> populacao) {
        List<Solucao> populacaoNova = new ArrayList<>();

        for (Solucao solucao : populacao) {
            solucao.mutar();
            populacaoNova.add(solucao);
        }

        return populacaoNova;
    }

    private Solucao encontrarMelhorSolucao(List<Solucao> populacao) {
        Solucao melhorSolucao = populacao.get(0);

        for (Solucao solucao : populacao) {
            if (solucao.ehCicloHamiltoniano(grafo)) {
                melhorSolucao = solucao;
                break;
            }
        }

        return melhorSolucao;
    }
}