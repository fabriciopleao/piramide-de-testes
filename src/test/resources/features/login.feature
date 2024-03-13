
@regressivos @login
Feature: Login
  Como usuario
  Quero realizar login com a minha conta
  Para utilizar os servicos do site

	Background:
		Given acessar aba login

  Scenario: Login com sucesso
    When enviar dados validos de login
    Then login efetuado com sucesso
 
