package br.com.java.rinaldo.java11;

import java.util.List;

public class VarLambada {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list.forEach(
                (var e) -> System.out.println(e)
        );
    }
}
