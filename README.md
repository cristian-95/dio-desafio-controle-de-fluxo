# Controle de Fluxo - Desafio
---
Minha soluçao para o desafio do Bootcamp Santander 2023 da DIO é uma simples aplicação Java
que recebe dois parâmetros, armazena a diferença entre os parâmetros em uma variável, e realiza N iterações
com loop for,onde N é a diferença entre os dois parâmetros. Esta aplicação também demonstra o uso de exceções personalizadas.

## Como usar

1. Clone o repositório para o seu ambiente local:

   ```
   git clone https://github.com/cristian-95/dio-desafio-controle-de-fluxo.git
   ```

2. Utilize a IDE de sua preferência para compilar e executar. A aplicação foi implementada utilizando [Intellij IDEA Community Edition](https://www.jetbrains.com/pt-br/idea/download).


3. Exemplo de execução do programa:

```
Digite o primeiro parâmetro: 5
Digite o segundo parâmetro: 15

i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7
i = 8
i = 9
```
  
## Exceções

Se os parâmetros fornecidos forem inválidos (o segundo parâmetro for menor que o primeiro), o programa lançará uma exceção ParametrosInvalidosException e exibirá uma mensagem de erro:

```
Digite o primeiro parâmetro: 20
Digite o segundo parâmetro: 10
ERRO: O segundo parâmetro deve ser maior que o primeiro.
```