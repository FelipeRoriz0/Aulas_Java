CREATE DATABASE db_agenda;

USE db_agenda;

CREATE TABLE tb_usuarios(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(40) NOT NULL,
usuario VARCHAR(10) NOT NULL,
senha VARCHAR(20) NOT NULL
);

INSERT INTO tb_usuarios(nome, usuario, senha) VALUES('Administrador', 'admin', '12345');
INSERT INTO tb_usuarios(nome, usuario, senha) VALUES('Felipe' , 'Felipe002', '123'); 
INSERT INTO tb_usuarios(nome, usuario, senha) VALUES('Danilo' , 'Danilo002', '123');

ALTER TABLE tb_usuarios ADD COLUMN foto VARCHAR(100);

UPDATE tb_usuarios SET foto="imagens/user1.png" WHERE id=1;
UPDATE tb_usuarios SET foto="imagens/user2.png" WHERE id=2;
UPDATE tb_usuarios SET foto="imagens/user3.png" WHERE id=3;

SELECT * FROM tb_usuarios;
