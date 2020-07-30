
<h1 align = "center">
Teste Automatizado - Melhor Envio
</h1>

##  Sobre

Desenvolver um teste de interface automatizado para o cadastro no Melhor Envio,
utilizando o ambiente de sandbox da plataforma. O teste deverá contemplar ao menos um
cenário de sucesso, onde o cadastro é realizado com sucesso e um de erro, onde o cadastro
não é realizado por algum erro de validação.
---

## Tecnologias Utilizadas

O projeto foi realizado utilizando as seguintes tecnologias:

- Selenium WebDriver
- JUnit
- Hamcrest
- Exportação de arquivo para teste em massa no formato CSV

---
## Automação

- O automação usa como entrada os dados contido no arquivo csv.

- O teste realiza o cadastramento de novos usuários seguindo os passos dado no site.

- Caso queira usar o arquivo csv, lembre-se de inserir dados com entradas válidas seguindo a ordem: Nome, Sobrenome, Nome da Loja, Celular, Cpf, 
Data de Nascimento, Local de Venda, Quantidade de Vendas por Mês, Email, Confirmação do Email, Senha, Confirmação da 
Senha, Cep, Número da Casa, Resultado (o resultado é o que você espera do cadastro, ex: se você informou todos os dados 
válidos e nunca cadastrados no site você coloca como: **"positivo"**, caso contrário coloca como: **"negativo"**, 
colocando negativo significa dizer que você sabe que os dados estão incorretos ou já foram cadastrados e você que provar).

- Os dados contidos no arquivo csv podem ser testados 1 vez, ao rodar o arquivo lembre-se de alterar o resultado  que 
tem "positivo" para "negativo", pois uma vez cadastrados eles passam para base de dados.

## Evidências

- Através da pasta resources obtemos as screenshots como evidência para cadastro com sucesso e para cadastros que deram errado.
