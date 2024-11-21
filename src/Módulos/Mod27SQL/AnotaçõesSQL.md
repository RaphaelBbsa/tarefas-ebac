# Alguns comandos básicos 

CREATE TABLE nome_tabela (-> comnado para criar tabela, note que dps do nome, coloco os campos
        id bigint
        nome varchar(50)
        endereco text
        telefone int
);

create database exemplo_1 -> cria a database

drop database exemplo_1 -> apaga a database

alter table exemplo_1 
add column sexo boolean; -> to alterando minha tabela e criando uma coluna sexo 

alter table exemplo_1 
alter column ex_coluna type character -> Aqui eu altero o tipo da minha tabela, supondo que ela fosse do tipo
varchar(50) por exemplo. 

Comando DEFAULT:

ALTER TABLE exemplo_1 
ALTER COLUMN ex_coluna 
SET DEFAULT 'NULO' -> Isso faz com que aonde não esteja preenchido minha tabela, esteja escrito NULO por exemplo
DROP DEFAULT -> Tira esse comando default 



ALTER TABLE exemplo_1 
ALTER COLUMN ex_coluna
SET NOT NULL; -> Aqui eu não deixo minha coluna ser nula, ou seja, ela tem q ter algum valor
DROP NOT NULL -> Tira a obrigatoriedade do not null

ALTER TABLE exemplo_1
RENAME TO exemplo; -> aqui eu altero o nome da tabela

truncate table exemplo_1; -> limpa as informações da tabela


selec from * exemplo_1; -> seleciona a tabela e mostra as informações e colunas

insert into exemplo_1 (id, nome, idade) values (1, 'Raphael', '15');
ou posso fazer
insert into exemplo_1 (1, 'Raphael', '15');

update exemplo_1 set nome = 'Raphinha' where id = 1; -> Aqui eu to dizendo pra alterar o nome onde o id é 1

delete from exemplo_1 where id = 1; -> vai deletar minha linha do id 1;

ALTER TABLE exemplo_1
ADD CONSTRAIT check_idade
CHECK (
        idade > 0 and idade < 100
); -> Aqui eu valido se a idade é menor que 100 ou maior que 0, caso não atenda minhas condições, não irá validar


Esse comando CONSTRAIT, posso fazer dessa forma abaixo também:

create table exemplo_2 (
id bigint not null, idade integer constrait check_idade (CHECK idade >0 and idade < 200), SEXO varchar(1) not null)

)


Comandos select: 

select * from exemplo_1 where nome like ('Rodrigo'); -> Aqui eu seleciono os que tem exatamente nome Rodrigo
selec .... where nome like ('%R'); -> seleciona os que começam com R
where nome like ('s%'); -> seleciona os que terminam com s
where nome like ('%dro%'); -> seleciona os que possuem dro na variável
where nome not like ('%R'); -> seleciona os que não tem R
select upper(nome) from exemplo_1 ... Aqui ele põe a letra maiuscula 


select * from exemplo_1 order by nome; -> poe em ordem asc pelos nomes
select * from exemplo_1 order by nome asc; -> poe em ordem asc pelos nomes
select * from exemplo_1 order by nome desc; -> poe em ordem desc pelos nomes
select * from exemplo_1 order by idade; -> poe em ordem asc pela idade

select distinct (nome) from exemplo_1; -> não traz ngm repetido na tabela

select * from exemplo_1  where nome in ('Rapha', 'Luan'); ->chama somente aqueles raphas e luans

select * from exemplo_1 where idade between 10 and 30;

CREATE INDEX id_cpf_pessoa ON tb_pessoa(cpf); -> Aqui eu crio um indíce baseado no cpf. teoricamente isso faz minha pesquisa ser mais rápida.
é mais efetiva em tabelas muito grandes. 


PRIMARY KEY: Uma chave única que não se repete e já é indexada. Exemplo:

Create table tb_pessoa (
id bigint not null,
nome varchar (50) not null,
idade integer constraint check_idade CHECK (idade > 0 and idade < 120),
SEXO varchar(1) not null,
constraint pk_id_pessoa primary key (id)
); -> Aqui eu defino que meu id é uma primary key e não pode ser repetida

Posso adicionar a primary key dessa forma aqui também: 
alter table tb_pessoa
add constraint pk_id_pessoa primary key (id);

FOREIGN KEY: Uma chave que conecta uma tabela a outra. Exemplo:


Create table tb_pessoa (
id bigint not null,
id_estado,
nome varchar (50) not null,
idade integer constraint check_idade CHECK (idade > 0 and idade < 120),
SEXO varchar(1) not null,
constraint pk_id_pessoa primary key (id)
constraint fk_id_estado foreign key (id_estado) references tb_estado (id)
);

ou


->Aqui na tabela estado, crio meu id e meio que importo ele para a minha tabela de pessoa, fazendo uma ligação entre esses dados.


Create tb_estado (
id bigint not null,
nome varchar(40) not null,
sigla varchar (2) not null
); 


UNIQUE - Impõe à coluna que não podem ter valores repetidos nela

SEQUENCE: Cria sequências automáticas para mim, por exemplo o id, abaixo:

CREATE SEQUENCE sq_pessoa
START 1
INCREMENT 1 -> Aqui eu digo para ele incrimentar de 1 em 1 
SELECT nextval ('sq_pessoa');

SELECT currval ('sq_pessoa');

insert into tb_pessoa (id, nome, idade, sexo, cpf) values (nextval('sq_pessoa'), 'Rodrigo', 36, 'M', 102030);

look, i place the id like nextval('sq_pessoa'), leting for progam make the sequence for me.


Join is a form of consult, joining the information of 2 or more tables in a only result.

INNER JOIN: Combines (Makes a combination of) the values of table 1 and tables 2, comparing the columns and verify if 
the values are equals. Being equals, it'll putt togheter the information and values that aren't
equals, are ignored e don't return in consult.


For use, type like this:

select * 
from tb_pessoa p, tb_estado e,
where p.id_estado = e.id 

or 

select* 
from tb_pessoa p 
inner join tb_estado e on e.id = p.id_estado;

Note that i refer tb_pessoa as p and tb_estado as e. when i run the command and check for equality, I use e and p.


LEFT JOIN: It also merges the information, but it returns null values when there's nothing to merge. It's looks like an INNER join, but unlike it, a LEFT JOIN return null values.

select*
from tb_pessoa p
left join tb_estado e on e.id = p.id_estado;


RIGHT JOIN: It also merges the information, but also returns null and the null values, which appear on the left side.

select* 
from tb pessoa p, tb_estado e,
right join tb_estado as e on p.id_estado = e.id;


FULL JOIN: Does the same thing, but merge everythig. It isn't (ideal) so good, because the information may become very confusing.

CROSS JOIN: is the most dangerous to use, because this merge all information, and repeat everything, mergind all.

FULL JOIN: It’s the most dangerous to use because it merges all the information and repeats everything, combining all data

