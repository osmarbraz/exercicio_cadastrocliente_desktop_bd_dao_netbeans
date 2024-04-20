# Exercício - Sistema de Cadastro de Clientes para Desktop em Banco MySQL utilizando DAO para a IDE NetBeans.

## Contextualização

 - O projeto foi desenvolvido no NetBeans deve ser chamado exercicio_cadastrocliente_desktop_bd_dao_netbeans.<br>
 - Programa desenvolvido no Java Development Kit 1.8.<br>
 - Utiliza o Apache Maven para a automatização da construção.<br>
 - Este programa possui diversas classes organizada nos pacotes: principal, visao, modelo e dao.<br>
 - Utiliza o Data Acess Object (DAO) para abstrair o bancos de dados MySQL.<br>
 - Toda iteração com banco de dados é tratada diretamente pelo DAO.<br>
 - Os dados de configuração(Servidor, Database, Usuario, Senha) da integração do java com o banco de dados estão no arquivo src/dao/DadosBanco.java.<br>
 - Dependência do Driver JDBC foi especificada no arquivo pom.xml.<br>
 - O Driver de conexão com o MySQL e espeficado na classe src/dao/Conexao.java.<br>
 - Crie o banco de dados antes de executar o programa, as especificações da tabela estão no arquivo banco.sql.<br>
 - A pasta src contêm os fontes do projeto.<br>
 - A interface gráfica foi construída **com** o auxílio da IDE NetBeans.<br>

## Arquivos

- banco.sql - Script do banco de dados.
- pom.xml - Arquivo de configuração da ferramenta de automação Maven.

## Enunciado do problema

### Questão 1

Uma empresa necessita de um sistema para desktop em Java para cadastrar os seus clientes em um banco de dados. As informações que cada cliente deve preencher são as seguintes: Nome, Endereço, Cidade, Estado, CEP e Escolaridade.  A tabela e o banco de dados têm o nome “cliente”. A tabela tem a seguinte estrutura:

```
CREATE TABLE Cliente (
	clienteID    INTEGER NOT NULL AUTO_INCREMENT,    	 
	nome         VARCHAR(50) NOT NULL,     
	endereco     VARCHAR(100),	
	cidade       VARCHAR(25),
	estado       VARCHAR(2),
	cep          VARCHAR(9),
	escolaridade VARCHAR(20),		
	PRIMARY KEY(clienteID)    
);
```

O layout da janela é apresentado abaixo:

![tela1](tela1.png)

Este interface gráfica, além dos campos, possui seis botões. O botão com o nome "Sair" fecha a janela e sai do sistema. O botão com o nome “Limpar” limpa as caixas de texto da janela. Quando for clicado, o botão “Salvar” enviará as informações ao banco de dados. A caixa de texto para o nome do cliente deve ter o seu preenchimento obrigatório, faça a validação. As funcionalidades dos outros botões serão implementadas posteriormente.

Desenvolva uma interface gráfica baseada em JFrame do pacote Swing para o cadastro de clientes, contendo as informações acima. Utilize o banco de dados de sua preferência. Ao final do processamento deve ser exibida uma mensagem informando se o usuário conseguiu ou não realizar a inclusão dos dados.

Você deve apresentar todo o código fonte utilizado para desenvolver a interface e a inclusão no banco de dados. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema se for necessário.

### Questão 2

Você já realizou a inclusão dos dados de clientes no banco de dados na questão 1. Agora, a mesma empresa necessita listar os dados de seus clientes que estão armazenados no banco de dados. A chamada desta funcionalidade será através do botão chamado “Listar” da questão anterior. As informações e o layout dos dados a serem exibidos são apresentados na figura abaixo:

![tela2](tela2.png) 

Desenvolva uma interface gráfica baseda em JFrame que contêm um componente JTable para exibir os dados de cliente armazenados.  Utilize o mesmo banco e tabela da questão 1. Ao se clicar no botão “Fechar” deve se retornar a janela anterior.

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema.

### Questão 3

Após realizar a listagem dos dados na questão 2, a empresa necessita disponibilizar uma interface gráfica para a alteração dos dados de seus clientes que estão armazenados no banco de dados. Para localizar o cliente cujos dados devem ser alterados é necessário ser informado um o id do cliente. A interface deve ter o seguinte formato:

![tela3](tela3.png) 

Esta interface gráfica deve ser chamada pelo botão “Alterar” da interface gráfica da questão 1.

Logo após a digitação do id os dados do cliente devem ser exibidos na interface gráfica desenvolvida na questão 1 para que sejam alterados. Se o id do cliente não existir, deve ser exibida uma mensagem ao usuário. O botão “Cadastrar” altera os dados do cliente. Utilize o mesmo banco e tabela da questão 1. 

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema.

### Questão 4

Com as funcionalidades de inclusão, listagem e alteração dos dados de clientes prontas, agora a empresa necessita disponibilizar a interface gráfica para a exclusão dos dados de clientes que estão armazenados no banco de dados. Para localizar o cliente a ser excluído do banco de dados é necessário ser informado um id de cliente. A interface gráfica deve ter o seguinte formato:

![tela4](tela4.png)  

Esta interface gráfica deve ser chamada pelo botão “Excluir” da interface gráfica da questão 1.

Logo após a digitação do id, todos os dados do cliente que foi localizado deve ser exibido na interface gráfica desenvolvida na questão 1 e logo após é exigido a confirmação da exclusão com a interface a seguir:

![tela5](tela5.png)  

Se o id do cliente não existir, deve ser exibida uma mensagem ao usuário. Utilize o mesmo banco e tabela da questão 1. 

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema. 
