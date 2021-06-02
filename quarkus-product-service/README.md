# quarkus-product-service project

Este é um projeto Quickstart que utiliza o Framework Quarkus, arquitura Microservices, RestFull, Programação Reativa e Rest Client. 

Os principais Frameworks utilizados nesse projeto estão listados abaixo na sessão `Frameworks`. 

Para saber mais sobre o Quarkus, visitar o website: https://quarkus.io/ .

## Rodando a aplicação em mode dev (dev moded)
Para executar a aplicação no mode desenvolvedor com hotdeploy (live coding), basta usar o comando:
```shell script
./mvnw compile quarkus:dev
```
> **_NOTE:_** O Quarkus disponibiliza uma página com UI, disponível apenas no modo Dev em http://localhost:8080/q/dev/.

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
resteasy-reactive (jax-rs), arc (CDI), resteasy-reactive-jsonb (Parser POJO x JSON), rest-client, rest-client-jsonb

## Autenticação
## Padrão de Código (Clean Code)
## Testes
## Sonar
## Resilience
## Cache DB
## Persistencia DB