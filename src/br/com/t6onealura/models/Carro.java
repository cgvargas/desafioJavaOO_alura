package br.com.t6onealura.models;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Carro {
    protected String nome;
    protected List<Double> listaDePrecos;

    /**
     * Construtor da classe Carro.
     * @param nome O nome do carro.
     * @param listaDePrecos A lista de preços do carro.
     */
    public Carro(String nome, List<Double> listaDePrecos) {
        this.nome = nome;
        this.listaDePrecos = listaDePrecos;
    }

    /**
     * Método para calcular a média dos preços.
     * @return A média dos preços.
     */
    public double calcularMediaPreco() {
        double soma = 0;
        for (double preco : listaDePrecos) {
            soma += preco;
        }
        return soma / listaDePrecos.size();
    }

    /**
     * Método para obter o maior preço.
     * @return O maior preço.
     */
    public double obterMaiorPreco() {
        return Collections.max(listaDePrecos);
    }

    /**
     * Método para obter o menor preço.
     * @return O menor preço.
     */
    public double obterMenorPreco() {
        return Collections.min(listaDePrecos);
    }

    /**
     * Sobrescrita do método toString para exibir informações do carro.
     * @return Uma string com as informações do carro.
     */
    @Override
    public String toString() {
        return "\nDescrição do veículo:" +
                "\nModelo: " + nome +
                "\nPreço médio: R$ " + String.format("%.2f", calcularMediaPreco()) +
                "\nMaior preço: R$ " + String.format("%.2f", obterMaiorPreco()) +
                "\nMenor preço: R$ " + String.format("%.2f", obterMenorPreco());
    }
}
