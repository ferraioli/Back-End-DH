drop table if exists PACIENTES;
drop table if exists ENDERECO;

create table if not exists ENDERECOS(ID int auto_increment primary key, RUA varchar(100), NUMERO VARCHAR(100), CIDADE varchar(50), BAIRRO varchar(100));
create table if not exists PACIENTES(ID int auto_increment primary key,NOME varchar(100),SOBRENOME varchar(100),RG int, DATACADASTRO varchar(100), ID_ENDERECO INT, foreign key (ID_ENDERECO) references ENDERECOS(ID));