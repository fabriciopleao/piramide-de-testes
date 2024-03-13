# Framework para automatizar testes de UI, API e Testes Unit�rios

Este projeto executa testes unit�rios em um m�todo de login de usu�rio com JUNIT
Este projeto executa testes de API nos endpoint do reqres.in com Restassured
Este projeto executa testes de UI no site saucedemo.com com Selenium

## Tecnologias utilizadas
- Java
- Selenium
- JUnit
- Cucumber

## Configura��o do ambiente
Para executar esse projeto � necess�rio as configura��es das vari�veis de ambiente 
JDK e Maven

## Como executar
1. Clone este reposit�rio em sua m�quina local.
2. Abra o projeto em uma IDE ou no Terminal
3. Execute os comandos abaixo

Executar os testes API e Unit�rio

mvn test


Executar os testes de UI
```bash
mvn test -Dtest=Executa