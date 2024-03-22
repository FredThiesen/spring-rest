# Aplicação usando arquitetura baseada em camadas

## Atividade da disciplina de Padrões arquiteturais - 2024/1

### Requisitos para execução:

-   Java 21
-   Maven 3.9.6
-   Variáveis de ambiente JAVA_HOME e M2_HOME setadas
-   Docker

1. mvn clean install
2. mvn clean package
3. docker compose build
4. (recomendação - rodar o banco de dados primeiro) docker compose up -d database
5. docker compose up -d

### Verificar funcionamento

-   Acessar o endereço http://localhost:9091/livro (ou requisição via curl ou postman, etc)
-   Verificar log de acesso em /nginx/logs/access.log

```
________________________________________
|                                      |
|                                      |
|   +--------------------------+       |
|   |         Nginx            |       |
|   +--------------------------+       |
|                |                     |
|                |                     |
|                v                     |
|       Balanceamento de carga         |
|______________________________________|
                 |
                 |
                 |
                 v
 _______________________________________
|                                      |
|                                      |
|   +--------------------------+       |
|   |        REST1             |       |
|   +--------------------------+       |
|   +--------------------------+       |
|   |        REST2             |       |
|   +--------------------------+       |
|   +--------------------------+       |
|   |        REST3             |       |
|   +--------------------------+       |
|______________________________________|
                 |
                 |
                 |
                 v
 _______________________________________
|                                      |
|                                      |
|   +-------------------------------+  |
|   |           Database               |
|   +-------------------------------+  |
|______________________________________|

```
