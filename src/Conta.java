package src;

/* class */
record Conta (double valor, Tipo tipoConta) {

    enum Tipo {
        PAGAR,
        RECEBER;
    }
}
