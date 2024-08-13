package src;

class Promocao {

  static void promo(double valor) {
    valor = 1.99;
  }

  static void promo(Boleto bol) {
    bol.valor = 1.99;
  }

}
