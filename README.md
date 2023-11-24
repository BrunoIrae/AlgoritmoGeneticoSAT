# Algoritmos Genéticos para Ciclo Hamiltoniano e Satisfatibilidade Booleana

## Visão Geral

Este projeto implementa algoritmos genéticos para resolver dois problemas distintos: Ciclo Hamiltoniano em grafos e Satisfatibilidade Booleana (SAT). Os algoritmos genéticos são técnicas de otimização baseadas em processos biológicos de seleção natural, recombinação genética e mutação.

## Problema do Ciclo Hamiltoniano

### Definição
O problema do Ciclo Hamiltoniano consiste em encontrar um ciclo que visite cada vértice de um grafo exatamente uma vez.

### Funcionamento do Algoritmo Genético

1. **Representação:** Cada solução é representada por uma ordem de visitação dos vértices.

2. **Fitness:** A qualidade de uma solução é medida pela sua capacidade de formar um ciclo hamiltoniano válido.

3. **Operadores Genéticos:** Utiliza operadores genéticos como mutação para explorar diferentes soluções.

4. **Algoritmo:** A população é evoluída ao longo de várias gerações, favorecendo soluções com maior aptidão.

## Problema da Satisfatibilidade Booleana (SAT)

### Definição
O problema da Satisfatibilidade Booleana envolve a busca por uma atribuição de valores lógicos (verdadeiro ou falso) para variáveis em uma fórmula booleana que a torne verdadeira.

### Funcionamento do Algoritmo Genético

1. **Representação:** Cada solução é representada por uma atribuição de valores lógicos às variáveis.

2. **Fitness:** A qualidade de uma solução é medida pela satisfação da fórmula booleana.

3. **Operadores Genéticos:** Utiliza operadores genéticos específicos para o problema SAT, como mutação de variáveis.

4. **Algoritmo:** A população é evoluída em direção a soluções que satisfaçam a fórmula booleana.

## Como Utilizar

1. **Requisitos:** Certifique-se de ter o ambiente de desenvolvimento Java instalado.

2. **Compilação:** Compile os arquivos Java: `javac *.java`

3. **Execução:** Execute o programa principal: `java Main`

## Parâmetros do Algoritmo Genético

- Tamanho da População: Número de soluções candidatas em cada geração.
- Número de Gerações: Quantidade de iterações completas do algoritmo.

Ajuste esses parâmetros conforme necessário para o seu problema específico.

## Contribuição

Sinta-se à vontade para contribuir, abrir problemas ou propor melhorias. Este projeto está aberto a colaborações e feedback.

