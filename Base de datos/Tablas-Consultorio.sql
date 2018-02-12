create table Pacientes(
Id_pacientes numeric(38) not null,
Nombre varchar2(20),
Apellido varchar2(20),
Edad varchar2(20),
Sexo varchar2(1),
Cedula varchar2(15),
Telefono varchar2(12),
Fecha_nacimiento date,
Seguro varchar2(15),
Fecha_registro date,
constraint pk_pacientes primary key (Id_pacientes));

create table Medicos(
Id_medico numeric(10),
Nombre varchar2(20),
Apellido varchar2(20),
Fecha_registro date,
Telefono varchar2(12),
Contrasena varchar2(20),
Categoria varchar2(3),
constraint pk_Medicos primary key (Id_medico));

create table Consultas(
Id_Consulta numeric(38) not null,
Id_pacientes numeric(38),
Id_medico numeric(10),
Sintomas1 varchar2(1000),
Sintomas2 varchar2(1000),
Sintomas3 varchar2(1000),
Sintomas4 varchar2(1000),
Sintomas5 varchar2(1000),
Libras varchar2(100),
Respiracion varchar2(100),
Observacion varchar2(500),
Fecha_registro date,
constraint pk_consulta primary key (Id_Consulta),
constraint fk_Pacientes2 foreign key(Id_pacientes) references Pacientes(Id_pacientes),
constraint fk_Medicos2 foreign key(Id_medico) references Medicos(Id_medico));

create table Citas(
Id_citas numeric(38) not null,
Id_pacientes numeric(38),
Id_medico numeric(10),
Fecha date,
constraint pk_Citas primary key (Id_citas),
constraint fk_Pacientes4 foreign key(Id_pacientes) references Pacientes(Id_pacientes),
constraint fk_Medicos4 foreign key(Id_medico) references Medicos(Id_medico));

create table Recetas(
Id_receta numeric(38) not null,
Id_pacientes numeric(38),
Id_medico numeric(10),
Nombre_Medicamento varchar2(100),
Docis varchar2(50),
Cantidad varchar2(50),
Fecha_registro date,
constraint pk_receta primary key (Id_receta),
constraint fk_Pacientes3 foreign key(Id_pacientes) references Pacientes(Id_pacientes),
constraint fk_Medicos3 foreign key(Id_medico) references Medicos(Id_medico));

create table Tratamiento(
Id_tratamiento numeric(38) not null,
Nombre varchar2(100),
Medicamento varchar2(500),
Ciclo varchar2(500),
Dosis varchar2(50),
constraint pk_Tratamiento primary key (Id_tratamiento));

create table Pacientes_ingresados(
Id_paciingre numeric(38) not null,
Id_pacientes numeric(38),
Id_tratamiento numeric(38),
Id_medico numeric(10),
Causa varchar2(500),
Estado varchar2(100),
Institucion varchar2(100),
constraint pk_pacientesingresados primary key (Id_paciingre),
constraint fk_Pacientes1 foreign key(Id_pacientes) references Pacientes(Id_pacientes),
constraint fk_Tratamiento1 foreign key(Id_tratamiento) references Tratamiento(Id_tratamiento),
constraint fk_Medicos1 foreign key(Id_medico) references Medicos(Id_medico));

drop table citas;
drop table consultas;
drop table recetas;
drop table pacientes_ingresados;
drop table tratamiento;
drop table medicos;
drop table pacientes;
