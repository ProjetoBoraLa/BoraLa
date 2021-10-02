create database BoraLa;
use BoraLa;

create table Estado(
	IdEstado int not null auto_increment,
    Nome varchar(20),
    Abreviacao varchar(5),
    primary key (IdEstado)
);

create table Cidade(
	IdCidade int not null auto_increment,
    Nome varchar(30),
    Abreviacao varchar(5),
    Estado_Id int,
    primary key (IdCidade),
    foreign key (Estado_Id) references Estado (IdEstado)
);

create table Local(
	IdLocal bigint not null auto_increment,
    Nome varchar(40),
    Endereco varchar(60),
    Avaliacao int,
    Descricao varchar(200),
    HoraFunc time,
    Tipo varchar(15),
    Telefone varchar(11),
    Comentarios varchar(100),
    NumVisitas bigint,
    Cidade int,
    primary key	(IdLocal),
    foreign key (Cidade) references Cidade (IdCidade)
);

create table RotaLocal(
	IdRotaLocal bigint not null,
    IdLocal bigint,
    OrdemVisita int,
    IdRoteiro bigint,
    primary key (IdRotaLocal),
    foreign key (IdLocal) references Local (IdLocal)
);

create table Roteiro(
	IdRoteiro bigint not null,
    IdUsuario bigint,
    NomeRota varchar(20),
    primary key (IdRoteiro)
);

alter table RotaLocal add foreign key (IdRoteiro) references Roteiro (IdRoteiro);

create table Usuario(
	IdUsuario bigint not null auto_increment,
    Nome varchar(30) not null,
    CPF varchar(11),
    CNPJ varchar(14),
    DataNasc date not null,
    Sexo char not null,
    Email varchar(25) not null,
    Endereco varchar(40),
    Senha varchar(25),
    Telefone varchar(11),
    IdRoteiro bigint,
    primary key (IdUsuario),
    foreign key (IdRoteiro) references Roteiro (IdRoteiro)    
);

alter table Roteiro add foreign key (IdUsuario) references Usuario (IdUsuario);
