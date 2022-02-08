#Author: Davi Mares

@tag
Feature: login usuario 
  Como usuario quero realizar o login para realizar uma compra

Background: acessar o site para realiza os testes 
Given que acesse o site "https://www.advantageonlineshopping.com/#/"

  @tag5
  Scenario: Os Dados válidas
    And e seleciono o opção USER
    When preencho os dados obrigatorios corretamente
    And clico em sign in
    Then login realizado com sucesso
   
     @tag6
  Scenario: Os Dados inválidas
    And e seleciono o opção USER
    When preencho os dados obrigatorios incorretamente
    Then mensagem de erro
    
    @tag7
  Scenario: Os Dados e branco
     And e seleciono o opção USER
    When não preencho os dados obrigatorios
    Then mensagem de erro
    