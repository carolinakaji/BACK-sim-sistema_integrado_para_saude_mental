CREATE TABLE paciente(
   id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
   email VARCHAR (100) UNIQUE NOT NULL,
   password VARCHAR (50) NOT NULL,
   nome VARCHAR (50) NOT NULL,
   sobrenome VARCHAR (150) NOT NULL,
   cpf VARCHAR (11) NOT NULL,
   endereco VARCHAR(150) NOT NULL,
   numero INT(11) NOT NULL,
   cidade VARCHAR(100) NOT NULL,
   uf VARCHAR(2) NOT NULL,
   celular VARCHAR(11),
   url VARCHAR(300),
   data_nascimento DATE NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET='UTF8';

INSERT into paciente ( url, email, password, nome, sobrenome, cpf, endereco, numero, cidade, uf, celular, data_nascimento) VALUES ('https://www.infoescola.com/wp-content/uploads/2009/02/unicornio-450x360.jpg','carol@gmail.com','123456','Carolina', 'Kaji', '321456987', 'Rua das Flores', 1555,  'Barueri', 'SP', '11999999999', '1985-10-17');
INSERT into paciente ( url, email, password, nome, sobrenome, cpf, endereco, numero, cidade, uf, celular, data_nascimento) VALUES ('https://statig2.akamaized.net/bancodeimagens/2s/4n/1w/2s4n1w35l9a4c4zo4dg9hr7kx.jpg', 'lucas@gmail.com','654321','Lucas', 'Silvestre', '412365878', 'Rua das Bandeiras', 547,   'São Roque', 'SP', '11985474563', '1991-12-09');
INSERT into paciente ( url, email, password, nome, sobrenome, cpf, endereco, numero, cidade, uf, celular, data_nascimento) VALUES ('https://img.r7.com/images/coelho-delineador-anao-hotot-internet-cultura-19112019175518888','joao@gmail.com','147852','Joao', 'Valentao', '321425785', 'Rua das Borboletas', 156,  'São Paulo', 'SP', '11968547856', '1980-08-15');