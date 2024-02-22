<h1>request-credit-system</h1>
<p align="center">API Rest para um Sistema de Analise de Solicitação de Crédito</p>
<p align="center">
     <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v17-blue.svg" />
    </a>
    <a alt="Kotlin">
        <img src="https://img.shields.io/badge/Kotlin-purple.svg" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring%20Boot-brightgreen.svg" />
    </a>
    <a alt="Gradle">
        <img src="https://img.shields.io/badge/Gradle-lightgreen.svg" />
    </a>
    <a alt="H2 ">
        <img src="https://img.shields.io/badge/H2-darkblue.svg" />
    </a>
    <a alt="Flyway">
        <img src="https://img.shields.io/badge/Flyway-red.svg">
    </a>
</p>

<h3>Descrição do Projeto</h3>
<p>Este é um projeto simples desenvolvido durante o Bootcamp da Digital Innovation One (DIO). O projeto consiste em um backend para um sistema de aplicação de crédito, permitindo o cadastro de usuários, atualização de informações pessoais, exclusão de conta, pesquisa de seus próprios créditos e concessão de crédito por administradores.</p>
<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="350" width="450" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
</p>
</figure>

<h3>Instrução de Uso</h3>
<p>No Terminal/Console:</p>
<ol>
	<li>Faça um clone do projeto na sua máquina: <code>git clone git@github.com/jeffersonmatias/request-credit-system.git</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd </code></li> 
	<li>Execute o comando: <code>./gradlew bootrun</code></li>
</ol>
<h6>** Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e executar o projeto através da IDE **</h6>
<h3>Tecnologias Utilizadas</h3>
<ul>
<li>Kotlin</li>
<li>Spring Boot</li>
<li>Swagger</li>
<li>Banco de dados H2 (em memória)</li>
</ul>
<h3>Funcionalidades</h3>
<ul>
<li>Cadastro de Usuário: Permite aos usuários se cadastrarem no sistema.</li>
<li>Atualização de Informações Pessoais: Usuários podem atualizar suas informações pessoais, como nome, renda, etc.</li>
<li>Exclusão de Conta: Usuários podem excluir suas contas do sistema.</li>
<li>Pesquisa de Créditos: Usuários podem verificar suas próprias informações de crédito.</li>
<li>Concessão de Crédito: Funcionalidade exclusiva para administradores, que podem conceder crédito aos usuários.</li>
</ul>
<h3>Documentação da API</h3>
<p>Para detalhes sobre os endpoints disponíveis e como usá-los, consulte a documentação da API, que estará disponível em http://localhost:8080/swagger-ui/html após iniciar o servidor.</p>
