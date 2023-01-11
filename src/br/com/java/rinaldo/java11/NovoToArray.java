package br.com.java.rinaldo.java11;

import java.util.List;

public class NovoToArray {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6);
        Integer[] array = lista.toArray(Integer[]::new);
        System.out.print(array.toString());
    }
}
