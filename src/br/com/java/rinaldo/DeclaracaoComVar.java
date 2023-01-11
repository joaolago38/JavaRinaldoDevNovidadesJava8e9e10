package br.com.java.rinaldo;

import java.util.List;

public class DeclaracaoComVar {

    public DeclaracaoComVar() {
    }

    public static void main(String[] args){
        pode();
    }
    private static void pode(){
        var i = 52;
        var apoie = "Seja membro do canal";
        var inscrever = getNome();
        System.out.println(" i " + i);

        System.out.println(" apoie : " + apoie);
        System.out.println(" inscrever : " + inscrever);

      var list =  List.of("um ", "dois" , "tres","quatro");
        for(var elemento : list){
            System.out.println( "Os elementos da Lista  são :" + elemento);
        }
    }
    private static void naoPode(){

    }

    private static String getNome(){
        return "Inscreva no Canal";
    }
}
