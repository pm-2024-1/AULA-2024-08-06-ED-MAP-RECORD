package src;

import java.util.HashSet;

// Memória: plataforma Java
// int x = 3;
// Integer y = 5 (wrapper)
// c = 1234
// d = 1234
// e = 9888
// f = 2323
// Stack (pilha)
//   x = 3
//   y = 123123
//   s1 = 982389
//   s2 = 982389
// Heap (monte)
//    123123 = 5
//     1234 = 5
//     9888 = 256
//     2323 = 256
//     982389 = "abc"
public class App {
  public static void main(String[] args) {
    // tipos primitivos (valor: int, double, boolean..)
    // tipos complexos (referência: objetos)
    int x = 2;
    Integer y = x; // autoboxing
    int z = y; // unboxing
    
    int a = 5;
    int b = 5;
    System.out.println(a == b); // true
    Integer c = 127;
    Integer d = 127;
    System.out.println(c == d); // true

    Integer e = 256;
    Integer f = 256;
                    // cast/coerção/conversão/unwrap
    System.out.println((int) e == (int) f); // false

    int g = 23232323; // 32bit
    long h = g;       // 64bit type promotion

    long j = 888888888;
    int k = (int) j; // downcasting

    String s1 = new String("abc");
    String s2 = new String("abc");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    Boleto b1 = new Boleto(); // class, objeto 1
    b1.valor = 99.99;
    Boleto b2 = new Boleto(); // class, objeto 2
    b2.valor = 99.99;
    System.out.println(b1 == b2);
    System.out.println(b1.equals(b2));

    double preco = 8.50;
    Promocao.promo(preco);
    System.out.println(preco);

    Promocao.promo(b1);
    System.out.println(b1.valor);

    System.out.println(b1.equals(b2)); // false
    // Conjunto
    HashSet<Integer> valores = new HashSet<>();
    valores.add(1);
    valores.add(2);
    valores.add(3);
    valores.add(1);
    System.out.println(valores.size()); // 3
    System.out.println(valores);

    Boleto b3 = new Boleto();
    b3.valor = 77;
    
    Boleto b4 = new Boleto();
    b4.valor = 88;
    
    Boleto b5 = new Boleto();
    b5.valor = 77;
    System.out.println(b3.equals(b5));

    HashSet<Boleto> conjuntoBoletos = new HashSet<>();
    conjuntoBoletos.add(b3);
    conjuntoBoletos.add(b4);
    conjuntoBoletos.add(b5);
    System.out.println(conjuntoBoletos.size()); // 3
    System.out.println(conjuntoBoletos);

    // C#, C, C++: structs (estrutura)
    // Pascal, Java: record (registro)

    // record: também é referenciado
    // mas o valor é comparável
    // record: gera objeto, objeto é imutável e é comparável
    Conta c1 = new Conta(5.50, Conta.Tipo.PAGAR);
    System.out.println(c1.valor());
    Conta c2 = new Conta(5.50, Conta.Tipo.RECEBER);
    Conta c3 = c2;
    Conta c4 = new Conta(6.90, Conta.Tipo.PAGAR);
    System.out.println(c1 == c2);
    System.out.println(c1.equals(c2)); // true
    // o record recebe um equals que compara o valor
    // e não a referência (como no caso das classes)

    HashSet<Conta> minhasContas = new HashSet<>();
    minhasContas.add(c1);
    minhasContas.add(c2);
    System.out.println(minhasContas.size());
    System.out.println(minhasContas);
    // 2 10
    double p = 0.10;
    System.out.println(p + p + p);
    System.out.println((p + p + p) == 0.3);
  }
  
}

// Banco
// Atomicity: atômico
// Consistency: consistente
// Isolation: isolado
// Durability: durável