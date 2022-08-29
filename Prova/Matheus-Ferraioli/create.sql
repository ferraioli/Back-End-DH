 DROP TABLE IF EXISTS filiais;
 create table if not exists filiais (id int auto_increment primary key, nomeFilial varchar(255), rua varchar(255),
 numero varchar(255), cidade varchar(255),estado varchar(255), e5Estrelas bit);