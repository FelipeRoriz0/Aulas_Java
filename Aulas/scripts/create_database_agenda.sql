CREATE DATABASE db_agenda;

USE db_agenda;

CREATE TABLE tb_usuarios(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(40) NOT NULL,
usuario VARCHAR(10) NOT NULL,
senha VARCHAR(20) NOT NULL
);

INSERT INTO tb_usuarios(nome, usuario, senha) VALUES('Administrador', 'admin', '12345');

SELECT * FROM tb_usuarios;