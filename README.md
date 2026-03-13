# Projeto - Classe Projetor

## Descrição

Este projeto representa um **projetor multimídia** do mundo real utilizando Programação Orientada a Objetos em Java.

A classe `Projetor` possui atributos que representam suas características físicas e funcionamento.

## Atributos

- peso (int) → peso do projetor
- tamanho (double) → tamanho do projetor
- tipoFonte (String) → tipo de fonte de luz (LED ou Lâmpada)
- ligado (boolean) → indica se o projetor está ligado ou desligado

## Métodos

### ligar()
Liga o projetor.

Regra de negócio:
Se o projetor já estiver ligado, uma mensagem é exibida informando.

### desligar()
Desliga o projetor.

Regra de negócio:
Se o projetor já estiver desligado, uma mensagem é exibida.

### projetarImagem(String imagem)

Projeta uma imagem na tela.

Regra de negócio:
Só é possível projetar se o projetor estiver ligado.

## Exemplo de uso

```java
Projetor projetor = new Projetor(5, 60, "LED");

projetor.ligar();
projetor.projetarImagem("Slide da aula");
projetor.desligar();
