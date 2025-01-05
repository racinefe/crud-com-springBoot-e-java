# crud-com-springBoot-e-java
 
## Menu

- [Tecnologias Usadas](#tecnologias-usadas)
- [Descrição do Projeto](#descrição-do-projeto)
- [Testar a criação de um registro POST](#POST)
- [Autor](#autor)

## Descrição do Projeto

Este projeto é uma aplicação de estudo para desenvolvimento em Back-end desenvolvida com Java e framework Spring Boot  que consiste em um CRUD para registro de Usuarios com dados como Nome, Idade e E-mail.

## Testando os Endpoints:

<img src="https://i.ibb.co/6y2qm0D/Captura-de-tela-2025-01-05-110121.png">



a) Testar a criação de um registro (POST)
Escolha o método POST.
 - No campo Body, selecione raw e escolha o formato JSON.
 - Digite o conteúdo do corpo da requisição, por exemplo:
   
`
 json
 {
     "nome": "João Silva",
     "idade": 23,
     "email": "joao@gmail.com"
 }
`
 - Clique em Send.
   
##

<img src
="https://i.ibb.co/mccWvdB/Captura-de-tela-2025-01-05-115045.png">
d) Testar a atualização de um registro (PUT)
Escolha o método PUT.

 - No campo de URL, adicione o ID do usuário que deseja atualizar: http://localhost:8080/usuarios/1.
 - No Body, insira o conteúdo atualizado em formato JSON:

 `
 json
 {
     "nome": "João Atualizado",
     "email": "joao.novo@gmail.com"
 }
 `
 - Clique em Send.

A resposta será o usuário atualizado.
<img src="https://i.ibb.co/hYtxf7c/Captura-de-tela-2025-01-05-110341.png">

##
<img src="https://i.ibb.co/Q6v9LP8/Captura-de-tela-2025-01-05-110508.png">
c) Testar a exclusão de um registro (DELETE).

 - Escolha o método DELETE.
 - No campo de URL, adicione o ID do usuário a ser excluído: http://localhost:8080/usuarios/1.
 - Clique em Send.
<img src="https://i.ibb.co/dGybH09/Captura-de-tela-2025-01-05-110528.png">





## Tecnologias Usadas

- Java
- SpringBoot


## Autor

[Racine Fellipe](https://curriculo-portfolio.netlify.app/)
