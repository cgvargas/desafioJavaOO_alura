Você está correto, a licença pode ser opcional. Vou remover a seção de licença do README.md. Aqui está o README.md atualizado:

---

# Desafio de Estudos: Programação Orientada a Objetos em Java

Este programa em Java foi desenvolvido por Claudio G. Vargas como parte de um desafio de estudos de Programação Orientada a Objetos, apresentado pela plataforma Alura. Ele demonstra os conceitos de herança, sobrescrita de métodos e polimorfismo.

## Funcionalidades

- **Classe Carro:** Representa um modelo genérico de carro ao longo de três anos. Implementa métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.

- **Subclasse ModeloCarro:** Utiliza a classe Carro para representar modelos específicos de carro. Permite criar instâncias específicas, definir preços e mostrar informações.

## Como usar

1. **Compilação:** Compile todos os arquivos Java.

   ```bash
   javac *.java
   ```

2. **Execução:** Execute o programa.

   ```bash
   java Programa
   ```

3. **Siga as instruções:** O programa solicitará que você forneça o nome do modelo de carro, o tipo de combustível, a cor, a marca e os preços para cada ano. Em seguida, ele calculará e exibirá informações sobre o modelo de carro fornecido.

## Exemplo de Uso

```java
// Criar uma instância de ModeloCarro
ModeloCarro meuCarro = ModeloCarro.criarModeloCarro(sc);

// Exibir informações sobre o modelo de carro
System.out.println(meuCarro);
```

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções de bugs ou novas funcionalidades. Basta abrir uma issue ou enviar um pull request.

## Nota

Este programa é apenas para fins acadêmicos e foi desenvolvido por Claudio G. Vargas utilizando o IA ChatGPT 3.5 como uma ferramenta de apoio para melhorias no aspecto de desempenho.

---

Este README fornece uma visão geral do programa, suas funcionalidades, instruções de uso e como contribuir.
