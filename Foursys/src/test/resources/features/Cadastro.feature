#Author: Davi Mares

@tag
Feature: Cadastrar novo usuario 
  Como usuario quero realizar o cadastro para realizar uma compra

Background: acessar o site para realiza os testes 
Given que acesse o site "https://www.advantageonlineshopping.com/#/"

  @tag1
  Scenario: Dados validos 
    And e seleciono o opção USER
    And e clico em CREATE NEWACCOUNT
    When preencho os dados obrigatorios
    And clico em I AGREE 
    And clico em REGISTER
    Then cadastro realizado com sucesso
   
     @tag2
  Scenario: Dados inválidas
    And e seleciono o opção USER
    And e clico em CREATE NEWACCOUNT
    When preencho os dados obrigatorios com infromações invalidas 
    And clico em I AGREE 
    Then não será possivel prosseguir em REGISTER
    
    @tag3
  Scenario: Dados e branco
    And e seleciono o opção USER
    And e clico em CREATE NEWACCOUNT
    When não preencho os dados obrigatorios 
    And clico em I AGREE 
    Then não será possivel prosseguir em REGISTER
    
   @tag4
  Scenario: I AGREE
    And e seleciono o opção USER
    And e clico em CREATE NEWACCOUNT
    When preencho os dados obrigatorios 
    And não clico em I AGREE 
    Then não será possivel prosseguir em REGISTER





 
