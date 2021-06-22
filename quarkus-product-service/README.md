# quarkus-product-service project

Este é um projeto Quickstart que utiliza o Framework Quarkus, arquitura Microservices, RestFull, Programação Reativa e Rest Client. 

Os principais Frameworks utilizados nesse projeto estão listados abaixo na sessão `Frameworks`. 

Para saber mais sobre o Quarkus, visitar o website: https://quarkus.io/ .

## Rodando a aplicação em mode dev (dev moded)
Para executar a aplicação no mode desenvolvedor com hotdeploy (live coding), basta usar o comando:
```shell script
./mvnw compile quarkus:dev
```
> **_NOTA:_** O Quarkus disponibiliza uma página com UI, disponível apenas no modo Dev em http://localhost:8080/q/dev/.

## Gerando e executando o pacote da aplicação
O pacote da aplicação pode ser gerado usando o comando:
```shell script
./mvnw package
```
Será criado um arquivo `quarkus-run.jar` no diretório `target/quarkus-app`. 
Vale lembrar que este arquivo não é um uber-jar, pois existem dependencias no diretório `target/quarkus-app/lib/`. 

Para criar um pacote uber-jar, execute o seguinte comando: 
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

Para executar a aplicação com o pacote jar, execute o comando: `java -jar target/quarkus-app/quarkus-run.jar`.

## Criando um executário nativo (Native Executable)
Para criar um executário nativo utilize o comando: 
```shell script
./mvnw package -Pnative
```
Se não tiver instalado o GraalVM na máquina, é possível criar um container com o executável nativo, usando o comando:
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

Para executar a aplicação nativa use o comando: `./target/sample-quarkus-1.0.0-SNAPSHOT-runner`

## Frameworks

### Dependencias utilizados do Quarkus 
resteasy-reactive (jax-rs), arc (CDI), resteasy-reactive-jsonb (Parser POJO x JSON), rest-client, rest-client-jsonb, quarkus-smallrye-openapi (swagger), 
quarkus-elytron-security-oauth2 (Oauth2 / J)

## Autenticação
Autenticação/autorização para acessar o Endpoint utiliza o protocolo Oauth2, através do Elytron Security Oauth2 que implementa parte da JSR 250. 
> **_NOTA_** Ver: Classe ProductSesource.java, método getAllSecured e referência: https://quarkus.io/guides/security 

## Padrão de Código (Clean Code)
## Testes

Para os testes da aplicação é utilizada a ferramenta `Rest-Assured`, que é voltada para a criação de testes automatizados de APIs Rest. Ela oferece suporte para validar protocolo HTTP, JSON, Status Code, Heders, Body e etc. 
Tambem utilizamos `QuarkusTest` (CDI) e `Junit`.

## Sonar
## Resilience - Fault Tolerance 

Padrão de Projeto para arquitetura de microserviços, onde as chamadas são feitas através de trafego de rede, diferente de aplicações monolíticas onde as comunicações entre camadas são feitas em memória (servidor). 
Fault Tolerance é um tipo de Resilience Pattern para o tratamento de falhas. 
> **_NOTA_** Ver classe: UserClientService

### Resilience - Timeout

Timeout é um padrão onde é definido um tempo de espera para o serviço consumidor (client) aguardar o retorno.
Na na classe UserClientService foi definido um timeout de 2 segundos. 

### Resilience - Retry

Técnica que consiste em tentar executar o método novamente em caso de erro. Extratamente eficaz em casos de erros esporádicos, como inconsistência de rede. 
Na aplicação, definimos que serão feitas 2 tentativas e cada uma tem 500 milisegundos de delay (espera). 

### Resilience - Circuit Breaker

Basicamente, consiste em evitar chamadas repetidas de uma lógica que está com falha, como outra serviço que esteja fora ou um cache db que ficou indisponível. Casos em que não é preciso parar todas as funcionalidades da aplicação devido a uma falha específica. 
Na aplicação, caso ocorra erro em 50% (valor padrão) das requisições, o circuito será ligado por 1 segundo e depois ficará meio aberto (half-open) até ocorrer 20 chamadas consecutivas com sucesso. Quando o circuito é aberto, é lançada uma exceção CircuitBreakerOpenException.

### Resilience - Fall Back

Ajuda a recuperar uma requisição em caso de exceção (erro). No exemplo da aplicação, caso ocorra erro ao obter um Usuário, é retornado um objeto do tipo "User" sem dados relevantes a fim de manter a aplicação funcionando. 

## Cache DB
## Persistencia DB (DB2 / SP)
## CICSWS
## Swagger UI

Utilizando a lib OpenApi, o arquivo (yaml) Swagger da aplicação é gerado na chamada do endpoint http://localhost:8080/q/openapi, considerando como padrão a aplicação rodando em localhost. 
O Swagger UI está disponível na url http://localhost:8081/q/swagger-ui/. 
Foi mantido a url padrão, mas é possível alterar. Também é possível personalizar a documentação através de anotação ou arquivo de configuração. 
> **_NOTA:_** Por padrão, o swagger-ui fica disponível apenas a aplicação é executada em modo DEV ou Test.  Para tornar disponível em produção e outros, basta utilizar a propriedade `quarkus.swagger-ui.always-include=true`

## Log/Monitoramento/Auditoria
