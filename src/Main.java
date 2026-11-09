import java.util.ArrayList;
import java.util.Comparator;

class Produto {
    private final String nome;
    private final double preco;
    private final int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome
                + " | Preço: R$ " + String.format("%.2f", preco)
                + " | Quantidade: " + quantidade;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.40, 34);
        Produto p2 = new Produto("Kit 50 Folhas", 9.90, 25);
        Produto p3 = new Produto("Cola Bastão", 3.99, 14);
        Produto p4 = new Produto("Grampeador", 13.99, 32);
        Produto p5 = new Produto("Hot Wheels", 135.99, 32);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        // Primeiro critério: quantidade em ordem crescente.
        // Segundo critério: preço em ordem decrescente, em caso de empate.
        Comparator<Produto> comparador = Comparator
                .comparingInt((Produto p) -> p.getQuantidade())
                .thenComparing(
                        Comparator.comparingDouble((Produto p) -> p.getPreco()).reversed()
                );

        produtos.sort(comparador);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        /*
         * Exemplo alternativo:
         * preço em ordem decrescente e, em caso de empate,
         * nome em ordem alfabética crescente.
         *
         * Comparator<Produto> comparadorAlternativo = Comparator
         *         .comparingDouble((Produto p) -> p.getPreco())
         *         .reversed()
         *         .thenComparing(p -> p.getNome());
         *
         * produtos.sort(comparadorAlternativo);
         */
    }
}
