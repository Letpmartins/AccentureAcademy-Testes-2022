# encoding: utf-8
Feature: Fluxo de compra completo

	Background: abrir site
	  	Given: Usuário abrir site "http://automationpractice.com/index.php"

  @Login
  Scenario Outline: Realizacao de login
    Given Usuario abrir site "http://automationpractice.com/index.php"
    And clicar no link SignIn
    When o usuario preencher com "<email>" o campo email
    And preencher com "<senha>" o campo senha
    And clica no botao SignIn
    Then a aplicacao abre a area do usuario
    
    Examples:
    |email					  | senha	|
    |leticia@email.com| 12345	|

  @Compra
  Scenario Outline: Fazendo uma compra
    Given usuario esta logado na aplicacao
    And busca por um produto
    And adiciona o produto ao carrinho
    When o usuario clica no botao ProceedToCheckout
    And completa as verificacoes de compra
    Then aparece na tela um resumo da compra