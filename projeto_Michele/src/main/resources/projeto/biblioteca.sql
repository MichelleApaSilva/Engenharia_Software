CREATE DATABASE biblioteca;
USE biblioteca;

#Usuario(idUsuario, nome, email, cpf, endereco, telefone)
CREATE TABLE Usuario(
idUsuario INT PRIMARY KEY,
nome VARCHAR(30),
email VARCHAR(60),
cpf VARCHAR(11),
endereco VARCHAR(200),
telefone VARCHAR(11)
);

#Aluno(idUsuario, matricula, curso)
#idUsuario referencia Usuario
CREATE TABLE Aluno(
idUsuario INT PRIMARY KEY,
matricula INT,
curso VARCHAR(30),
FOREIGN KEY(idUsuario) REFERENCES Usuario(idUsuario)
);

#Bibliotecaria(idUsuario, turno)
#idUsuario referencia Usuario
CREATE TABLE Bibliotecaria(
idUsuario INT PRIMARY KEY,
turno VARCHAR(10),
FOREIGN KEY(idUsuario) REFERENCES Usuario(idUsuario)
);

#Professor(idUsuario, titulacao, especializacao)
#idUsuario referencia Usuario
CREATE TABLE Professor(
idUsuario INT PRIMARY KEY,
titulacao VARCHAR(60),
especializacao VARCHAR(30),
FOREIGN KEY(idUsuario) REFERENCES Usuario(idUsuario)
);

#Livro(cod_livro, nota_cont, quantidadeTotal, assunto, titulo, autor, editora, idioma, ISBN,publicacao)
CREATE TABLE Livro(
cod_livro INT PRIMARY KEY,
nota_cont VARCHAR(100),
quantidadeTotal INT,
assunto VARCHAR(30),
titulo VARCHAR(60),
autor VARCHAR(60),
editora VARCHAR(60),
idioma VARCHAR(10),
ISBN BIGINT,
publicacao DATE
);

#Emprestimo(idEmprestimo, dataEmprestimo, dataDevolucao, idAluno, idBibliotecaria, statusDevolucao)
#idAluno referencia Aluno
#idBibliotecaria referencia Bibliotecaria
CREATE TABLE Emprestimo(
idEmprestimo INT PRIMARY KEY,
dataEmprestimo DATE,
dataDevolucao DATE,
idAluno INT,
idBibliotecaria INT,
statusDevolucao BOOLEAN,
FOREIGN KEY(idAluno) REFERENCES Aluno(idUsuario), 
FOREIGN KEY(idBibliotecaria) REFERENCES Bibliotecaria(idUsuario) 
);

#Multa(idMulta, dataMulta, motivoMulta, valorMulta, idEmprestimo)
#idEmprestimo referencia Emprestimo
CREATE TABLE Multa(
idMulta INT PRIMARY KEY,
dataMulta DATE,
motivoMulta VARCHAR(20),
valorMulta FLOAT,
idEmprestimo INT,
FOREIGN KEY(idEmprestimo) REFERENCES Emprestimo(idEmprestimo)
);

#Requisicao(idRequisicao, dataAbertura, estadoRequisicao)
CREATE TABLE Requisicao(
idRequisicao INT PRIMARY KEY,
dataAbertura DATE,
estadoRequisicao VARCHAR(60)
);

#Solicitacao(idSolicitacao, idBibliotecaria, idProfessor, idRequisicao)
#idBibliotecaria referencia Bibliotecaria
#idProfessor referencia Professor
#idRequisicao referencia Requisicao
CREATE TABLE Solicitacao(
idSolicitacao INT PRIMARY KEY,
idBibliotecaria INT,
idProfessor INT,
idRequisicao INT,
FOREIGN KEY(idBibliotecaria) REFERENCES Bibliotecaria(idUsuario),
FOREIGN KEY(idProfessor) REFERENCES Professor(idUsuario),
FOREIGN KEY(idRequisicao) REFERENCES Requisicao(idRequisicao)
);

#ReqContemLivro(codContem, cod_livro, idRequisicao)
#cod_livro refencia Livro
#idRequisicao referencia Requisicao
CREATE TABLE ReqContemLivro(
codContem INT PRIMARY KEY,
cod_livro INT,
idRequisicao INT,
FOREIGN KEY(cod_livro) REFERENCES Livro(cod_livro),
FOREIGN KEY(idRequisicao) REFERENCES Requisicao(idRequisicao)
);

#PossuiLivro(codPossuiLivro, idEmprestimo, cod_livro)
#idEmprestimo referencia Emprestimo
#cod_livro referencia Livro
CREATE TABLE PossuiLivro(
codPossuiLivro INT PRIMARY KEY,
idEmprestimo INT,
cod_livro INT,
FOREIGN KEY(idEmprestimo) REFERENCES Emprestimo(idEmprestimo),
FOREIGN KEY(cod_livro) REFERENCES Livro(cod_livro)
);

idUsuario int ,
cod_livro int,
dataReserva varchar(30),
dataExpiracao varchar(30),
FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario),
FOREIGN KEY (cod_livro) REFERENCES Livro(cod_livro)
);

INSERT INTO Usuario(idUsuario, nome, email, cpf, endereco, telefone)
VALUES (1,'Ana Maria Silva','anamariasilva@iftm.edu.br','94622834865','Rua das Flores, 40,Pampulha, Uberlândia, MG',34957239486),
(2,'Pedro Henrique Silva','pedrohenriquesilva@iftm.edu.br','20107020922','Rua 8, 1450,Centro, Uberlândia, MG',62963152879),
(3,'José Batista Ferreira','josébatistaferreira@iftm.edu.br','70519482180','Rua 50,5026, Lídice, Uberlândia, MG',32658412987),
(4,'Maria AparecidaPereira','mariaaparecidapereira@iftm.edu.br','31735755638','Rua Vitória, 1250, Jardim Holanda,Uberlândia, MG',34687123698),
(5,'Maia Angélica Soares','maiaangélicasoares@iftm.edu.br','41740882775','RuaHarpia, 70, Grand Ville, Uberlândia, MG',34689452684),
(6,'Leticia Pereira','leticiapereira@iftm.edu.br','15525191888','Av Central, 856,Umuarama, Uberlândia, MG',11684921489),
(7,'Rogério Lucas Santos','rogériolucassantos@iftm.edu.br','26809880728','AvGetúlio Vargas, 146, Martins, Uberlândia, MG',11357964528),
(8,'Roberto Amado Silva','robertoamadosilva@iftm.edu.br','60075419465','Rua daFlores, 60, Pampulha, Uberlândia, MG',34568941369),
(9,'Franciele OliveiraSouza','francieleoliveirasouza@iftm.edu.br','61985489728','Av 31, 1030, Planalto, Uberlândia,MG',32697259349),
(10,'Adriana Martins Alves','adrianamartinsalves@iftm.edu.br','95661644848','Av27, 7060, Centro, Uberlândia, MG',31654893169),
(11,'Sérgio Andrade Melo','sergioandrademelo@iftm.edu.br','10598536924','Av.Anselmo Alves dos Santos, 600, Santa Monica, Uberlândia, MG',34968051958),
(12,'Paulo Gomes Dias','paulogomesdias@iftm.edu.br','85941520369','Av.Olímpica, 100, Santa Rosa, Uberlândia, MG',34998547125),
(13,'Sandra Borges','sandraborges@iftm.edu.br','36847584150','R. Machado de Assis, 165, Lidice, Uberlândia, MG',37985812506),
(14,'Bruna Barros Santos','brunabarrossanros@iftm.edu.br','15874529604','R. dos Canarinhos, 627, Cidade Jardim, Uberlândia, MG',34996845184),
(15,'Amanda Freita Duraes','amandafreitasduraes@iftm.edu.br','12598745605','R.Rio Uruguai, 106, Mansour, Uberlândia, MG',34925874156);

INSERT INTO Aluno(idUsuario, matricula, curso)
VALUES(1,112233,'Ciência da Computação'),
(2,223344,'Ciência da Computação'),
(3,334455,'Ciência da Computação'),
(4,445566,'Ciência da Computação'),
(5,556677,'Sistemas para Internet');

INSERT INTO Professor(idUsuario, titulacao, especializacao)
VALUES (9,'Bacharel em Ciência da Computação','Doutorado'),
(10,'Tecnólogo em Sistemas para Internet','Mestrado'),
(11,'Licenciado em Computação','Doutorado'),
(12,'Tecnólogo em Logística','Doutorado'),
(13,'Tecnólogo em Marketing','Mestrado');

INSERT INTO Bibliotecaria(idUsuario, turno)
VALUES (6,'Manhã'),
(7,'Tarde'),
(8,'Noite'),
(14,'Manhã'),
(15,'Tarde');

INSERT INTO Livro(cod_livro, nota_cont, quantidadeTotal, assunto, titulo, autor, editora,
idioma, ISBN, publicacao)
VALUES (1,6,9,'SQL','SQL Seus metódos','Ana Maria Silva','SQL Editor Independente','Português',34957239486,"2008-04-16"),
(2,5,7,'Romance','Romance Seus metódos','Pedro Henrique Silva','RomanceEditor Independente','Português',62963152879,"2006-11-05"),
(3,10,10,'Auto-Ajuda','Auto-Ajuda Seus metódos','José BatistaFerreira','Auto-Ajuda Editor Independente','Português',32658412987,"2002-07-30"),
(4,8,10,'Ficção Ciêntifica','Ficção Ciêntifica Seus metódos','Maria AparecidaPereira','Ficção Ciêntifica Editor Independente','Português',34687123698,"2006-09-16"),
(5,6,9,'Filosofia','Filosofia Seus metódos','Maia Angélica Soares','Filosofia EditorIndependente','Português',34689452684,"2004-07-09"),
(6,4,4,'Logística','Logística Seus metódos','Leticia Pereira','Logística EditorIndependente','Português',11684921489,"2007-04-28"),
(7,7,5,'Computação','Computação Seus metódos','Rogério LucasSantos','Computação Editor Independente','Português',11357964528,"1999-10-10"),
(8,10,4,'Português','Português Seus metódos','Roberto Amado Silva','PortuguêsEditor Independente','Português',34568941369,"1997-05-20"),
(9,9,8,'Matemática','Matemática Seus metódos','Franciele OliveiraSouza','Matemática Editor Independente','Português',34568941369,"2005-05-30"),
(10,6,5,'Inglês','Inglês Seus metódos','Adriana Martins Alves','Inglês EditorIndependente','Português',34568941369,"2000-08-29");

INSERT INTO Emprestimo(idEmprestimo, dataEmprestimo, dataDevolucao, idAluno,
idBibliotecaria, statusDevolucao)
VALUES (1,"2022-09-01","2022-09-08",1,6,1),
(2,"2022-11-21","2022-11-28",2,7,1),
(3,"2022-09-22","2022-09-29",3,8,1),
(4,"2022-03-15","2022-03-22",4,14,1),
(5,"2022-11-04","2022-11-11",5,15,1),
(6,"2022-04-07","2022-04-14",1,6,1),
(7,"2022-04-04","2022-04-11",2,7,1),
(8,"2022-05-07","2022-05-14",3,8,1),
(9,"2022-05-09","2022-05-16",4,14,1),
(10,"2022-07-09","2022-07-16",5,15,1);

INSERT INTO Multa(idMulta, dataMulta, motivoMulta, valorMulta, idEmprestimo)
VALUES (1,"2022-09-10",'Atraso na devolucao',0.5,1),
(2,"2022-11-30",'Atraso na devolucao',0.5,2),
(3,"2022-10-01",'Atraso na devolucao',0.5,3),
(4,"2022-03-24",'Atraso na devolucao',0.5,4),
(5,"2022-11-13",'Atraso na devolucao',0.5,5);

INSERT INTO Requisicao(idRequisicao, dataAbertura, estadoRequisicao)
VALUES (1,"2022-07-12",'Aguardando Aprovacao'),
(2,"2022-10-01",'Aguardando Compra'),
(3,"2022-08-02",'Aguardando Aprovacao'),
(4,"2022-01-23",'Aguardando Compra'),
(5,"2022-09-14",'Indeferido');

INSERT INTO Solicitacao(idSolicitacao, idBibliotecaria, idProfessor, idRequisicao)
VALUES (18,6,9,1),
(15,7,10,2),
(11,8,11,3),
(10,14,12,4),
(19,15,13,5);

INSERT INTO ReqContemLivro(codContem, cod_livro, idRequisicao)
VALUE (56,3,1),
(57,4,2),
(59,5,3),
(60,6,4),
(61,7,5);

INSERT INTO PossuiLivro(codPossuiLivro, idEmprestimo, cod_livro)
VALUES (1,1,10),
(2,2,6),
(3,3,7),
(4,4,9),
(5,5,2);

INSERT INTO Reserva(idUsuario, cod_livro,dataReserva, dataExpiracao)
VALUES (2, 5,"2022-01-01", "2022-05-01"),
(5, 4,"2022-02-15", "2022-02-20");