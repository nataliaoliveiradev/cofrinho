package meucofrinho;

// Classe que representa a moeda Real, herda da classe abstrata Moeda
public class Real extends Moeda {

    // Construtor da classe Real, que recebe o valor da moeda como parâmetro
    public Real(double valor) {
        // Chama o construtor da classe mãe (Moeda), passando o valor e o nome da moeda ("Real")
        super(valor, "Real");
    }

    // Método sobrescrito para converter o valor de Reais para Reais
    @Override
    public double converterParaReal() {
        // O valor do Real já está em Reais, portanto apenas retorna o valor armazenado
        return getValor();
    }
}
