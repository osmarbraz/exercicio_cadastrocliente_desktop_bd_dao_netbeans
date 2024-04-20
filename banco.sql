#criar o database chamado exercicio
create database if not exists exercicio;

#entrar no database exercicio
use exercicio;

#remove a tabela para recriá-la
drop table if exists cliente;

#cria a tabela de cliente
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

#lista a tabela criada
show tables;
