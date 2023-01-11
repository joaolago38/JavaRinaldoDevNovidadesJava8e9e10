package br.com.java.rinaldo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsoVar {
    public static void main(String[] args)
    {
        var apoie = "Seja membro";
        var nomes = List.of("Curta","0","Video");
        var lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        System.out.println( " ================");
        for(var i = 0 ; i < nomes.size(); i ++){
            System.out.println( " nomes ===================== " + nomes );
            System.out.println( " o tamanho de nomes eh " + nomes.size());
        }
        System.out.println( " =========================================");
        for(var i = 0 ; i < lista.size(); i ++){
            System.out.println( " lista " + lista );
            System.out.println( " o tamanho de lista eh " + lista.size());
        }
        System.out.println( " ========================");
         try(var r1 = new Scanner("Inscreva-se")){
            System.out.println( " apoie " + apoie );
        }catch (Exception e) {

        }
    }
}
