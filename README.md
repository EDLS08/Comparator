# Java Comparator – Product Sorting

A Java study exercise focused on **sorting objects with the `Comparator` interface** and an `ArrayList`.

## Learning objectives

- Understand how `Comparator` defines a custom ordering for objects.
- Sort an `ArrayList` with `sort()`.
- Combine sorting criteria with `thenComparing()`.
- Reverse a criterion with `reversed()`.

## Sorting logic

The main comparator applies two criteria:

1. **Quantity — ascending:** products with smaller quantities appear first.
2. **Price — descending:** when two products have the same quantity, the more expensive product appears first.

The relevant code is:

```java
Comparator<Produto> comparador = Comparator
        .comparingInt((Produto p) -> p.getQuantidade())
        .thenComparing(
                Comparator.comparingDouble((Produto p) -> p.getPreco()).reversed()
        );

produtos.sort(comparador);
```

## Run the project

You need a JDK installed.

From the repository root, run:

```bash
javac -d out src/Main.java
java -cp out Main
```

## Project structure

```text
Comparator/
├── src/
│   └── Main.java
├── README.md
├── README-pt-br.md
└── .gitignore
```

## Language

[Read the documentation in Portuguese](README-pt-br.md).

---

**Main topic:** Java — `Comparator`, `ArrayList`, custom object sorting, and multiple sorting criteria.
