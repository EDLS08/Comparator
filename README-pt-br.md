# Java Comparator – Ordenação de Produtos

Este projeto é um exercício de estudo em Java com foco em **ordenação de objetos usando a interface `Comparator`** e uma coleção `ArrayList`.

## Objetivos de aprendizagem

- Entender como `Comparator` define uma ordem personalizada para objetos.
- Ordenar um `ArrayList` usando `sort()`.
- Combinar critérios de ordenação com `thenComparing()`.
- Inverter um critério com `reversed()`.

## Lógica da ordenação

O comparador principal utiliza dois critérios:

1. **Quantidade — ordem crescente:** produtos com menor quantidade aparecem primeiro.
2. **Preço — ordem decrescente:** quando dois produtos possuem a mesma quantidade, o produto mais caro aparece primeiro.

Trecho principal:

```java
Comparator<Produto> comparador = Comparator
        .comparingInt((Produto p) -> p.getQuantidade())
        .thenComparing(
                Comparator.comparingDouble((Produto p) -> p.getPreco()).reversed()
        );

produtos.sort(comparador);
```

## Como executar

É necessário ter o JDK instalado.

Na raiz do repositório, execute:

```bash
javac -d out src/Main.java
java -cp out Main
```

## Estrutura do projeto

```text
Comparator/
├── src/
│   └── Main.java
├── README.md
├── README-pt-br.md
└── .gitignore
```

## Conceitos praticados

| Recurso | Função |
|---|---|
| `Comparator` | Define uma regra personalizada de comparação. |
| `comparingInt()` | Compara valores inteiros. |
| `comparingDouble()` | Compara valores do tipo `double`. |
| `thenComparing()` | Adiciona um critério secundário. |
| `reversed()` | Inverte a ordem de comparação. |
| `ArrayList.sort()` | Ordena os elementos da lista. |

---

**Tema principal:** Java — `Comparator`, `ArrayList`, ordenação personalizada de objetos e múltiplos critérios.
