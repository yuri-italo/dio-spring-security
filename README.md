# Aplicação Exemplo com Spring Security

Este é um repositório de exemplo que demonstra o uso do Spring Security em uma aplicação Java. O Spring Security é um framework de segurança amplamente utilizado para proteger aplicações web e serviços REST.

## Configuração do Ambiente

Certifique-se de ter o seguinte software instalado em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) versão 8 ou superior
- Maven (opcional, se você estiver usando Maven para gerenciar as dependências)
- Um IDE de sua escolha (recomendado: IntelliJ IDEA, Eclipse)

## Configuração do Projeto

1. Clone este repositório para sua máquina local:

   ```bash
   git clone git clone git@github.com:yuri-italo/dio-spring-security.git
   ```

2. Abra o projeto em seu IDE.

3. Certifique-se de ter todas as dependências do projeto resolvidas. Isso pode ser feito executando o seguinte comando Maven:

   ```bash
   mvn clean install
   ```

## Executando a Aplicação

Após configurar o projeto, você pode executar a aplicação.

1. Execute o seguinte comando Maven para iniciar o servidor embutido do Spring:

   ```bash
   mvn spring-boot:run
   ```

2. A aplicação estará disponível em `http://localhost:8080`.

3. Experimente diferentes URLs protegidas para testar as regras de segurança configuradas.

## Contribuição

Se você encontrar algum problema ou tiver

sugestões de melhoria, sinta-se à vontade para abrir uma [issue](https://github.com/yuri-italo/dio-spring-security/issues) ou enviar um [pull request](https://github.com/yuri-italo/dio-spring-security/pulls).
