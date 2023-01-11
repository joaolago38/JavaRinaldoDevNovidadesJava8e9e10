package br.com.java.rinaldo;

public class VarIntersectionType {

    public static void main(String[] args){
        var stringOuInteger = 1 == 1? "ABC" : 23;
        System.out.println(stringOuInteger.toString());
    }
}
