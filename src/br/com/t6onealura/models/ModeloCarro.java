package br.com.t6onealura.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
  Classe que representa um modelo específico de carro.
 */
import java.util.Scanner;

public class ModeloCarro extends Carro {
    private String tipoDeCombustivel;
    private String cor;
    private String marca;

    /**
     * Construtor da classe ModeloCarro.
     * @param nome O nome do modelo de carro.
     * @param tipoDeCombustivel O tipo de combustível do modelo de carro.
     * @param cor A cor do modelo de carro.
     * @param marca A marca do modelo de carro.
     * @param listaDePrecos A lista de preços do modelo de carro.
     */
    public ModeloCarro(String nome, String tipoDeCombustivel, String cor, String marca, List<Double> listaDePrecos) {
        super(nome, listaDePrecos);
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.cor = cor;
        this.marca = marca;
    }

    /**
     * Sobrescrita do método toString para exibir informações do modelo de carro.
     * @return Uma string com as informações do modelo de carro.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nCombustível: " + tipoDeCombustivel +
                "\nCor: " + cor +
                "\nMarca: " + marca;
    }

    /**
     * Método estático para criar um novo modelo de carro com entrada de dados do usuário.
     * @param sc O scanner para entrada de dados do usuário.
     * @return Um novo modelo de carro criado com base nos dados inseridos pelo usuário.
     */
    public static ModeloCarro criarModeloCarro(Scanner sc) {
        System.out.print("Informe o modelo do carro: ");
        String nome = sc.nextLine();
        System.out.print("Informe o combustível: ");
        String tipoDeCombustivel = sc.nextLine();
        System.out.print("Informe a cor do carro: ");
        String cor = sc.nextLine();
        System.out.print("Informe a marca do carro: ");
        String marca = sc.nextLine();

        List<Double> listaDePrecos = new ArrayList<>();
        for(int i = 1; i <= 3; i++) {
            System.out.println("Informe o preço do modelo: ");
            listaDePrecos.add(sc.nextDouble());
        }

        return new ModeloCarro(nome, tipoDeCombustivel, cor, marca, listaDePrecos);
    }
}