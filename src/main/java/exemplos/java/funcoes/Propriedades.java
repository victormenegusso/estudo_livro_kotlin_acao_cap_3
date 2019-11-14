package exemplos.java.funcoes;

import exemplos.kotlin.propriedades.OperacaoKt;

public class Propriedades {

    public static void main(String[] args) {

        // foi gerado o get/set para var opCount
        OperacaoKt.getOpCount();
        OperacaoKt.setOpCount(1);

        // os métodos
        OperacaoKt.performOperation();
        OperacaoKt.reportOperationCount();

        // foi gerado o get apenas para o val
        System.out.println( OperacaoKt.OPERATION_SYSTEM_VERSION );
    }

}
