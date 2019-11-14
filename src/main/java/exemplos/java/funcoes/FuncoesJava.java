package exemplos.java.funcoes;

import exemplos.kotlin.funcoes.JoinKt;
import java.util.ArrayList;
import java.util.Arrays;

public class FuncoesJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        String resultado = JoinKt.joinToString(list,",","[","]");
        System.out.println(resultado);
    }
}
