# quarkus-user-service project

Este é um projeto Quickstart que utiliza o Framework Quarkus, arquitura Microservices, RestFull, Programação Reativa e Rest Client. 

Os principais Frameworks utilizados nesse projeto estão listados abaixo na sessão `Frameworks`. 

Para saber mais sobre o Quarkus, visitar o website: https://quarkus.io/ .


# Componentes do Projeto

-   [Backend Core](##Backend-Core)

-   [Executando/Compilando o Projeto](##Executando/Compilando-o-Projeto)

-   [Lista de Dependencias](##Lista-de-Dependencias)

-   [Login / Autenticação](##Login-/-Autenticação)

-   [Padrão de Código (Clean Code)](##Padrão-de-Código-(Clean-Code))

-   [Testes](##Testes)

-   [Sonar](##Sonar)

-   [Resilience: Fault Tolerance](##Resilience:-Fault-Tolerance)

-   [Cache DB](##Cache-DB)

-   [Persistencia DB (DB2 / SP)](##Persistencia-DB-(DB2-/-SP))

-   [CICSWS](##CICSWS)

-   [Swagger](##Swagger)

-   [Log/Monitoramento/Auditoria](##Log/Monitoramento/Auditoria)

## Executando/Compilando o Projeto

### Rodando a aplicação em mode dev (dev moded)
Para executar a aplicação no mode desenvolvedor com hotdeploy (live coding), basta usar o comando:
```shell script
./mvnw compile quarkus:dev
```
> **_NOTA:_** O Quarkus disponibiliza uma página com UI, disponível apenas no modo Dev em http://localhost:8080/q/dev/.

### Gerando e executando o pacote da aplicação
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

### Criando um executável nativo (Native Executable)
Para criar um executável nativo utilize o comando: 
```shell script
./mvnw package -Pnative
```
Se não tiver instalado o GraalVM na máquina, é possível criar um container com o executável nativo, usando o comando:
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

Para executar a aplicação nativa use o comando: `./target/sample-quarkus-1.0.0-SNAPSHOT-runner`

## Lista de Dependencias 
-   resteasy-reactive (jax-rs)
-   arc (CDI)
-   resteasy-reactive-jsonb (Parser POJO x JSON)
-   quarkus-smallrye-openapi (swagger)

## Login / Autenticação
## Padrão de Código (Clean Code)
## Testes
## Sonar
## Resilience: Fault Tolerance
## Cache DB
## Persistencia DB (DB2 / SP)
## CICSWS
## Swagger

Utilizando a lib OpenApi, o arquivo (yaml) Swagger da aplicação é gerado na chamada do endpoint http://localhost:8080/q/openapi, considerando como padrão a aplicação rodando em localhost. 
O Swagger UI está disponível na url http://localhost:8081/q/swagger-ui/. 
Foi mantido a url padrão, mas é possível alterar. Também é possível personalizar a documentação através de anotação ou arquivo de configuração. 
> **_NOTA:_** Por padrão, o swagger-ui fica disponível apenas a aplicação é executada em modo DEV ou Test.  Para tornar disponível em produção e outros, basta utilizar a propriedade `quarkus.swagger-ui.always-include=true`

## Log/Monitoramento/Auditoria
## Backend Core