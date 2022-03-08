Create DataBase DB_NotesMSA
use DB_NotesMSA

Create Table Cronograma
(
	N�mero_Actividad int not null,
	Actividad varchar(100) not null,
	Duraci�n varchar(20) not null,
	Fecha_Inicio date not null,
	Fecha_Fin date not null,
	Primary key(N�mero_Actividad)
)


Create Table Persona
(
	C�dula varchar(20) not null,
	Nombres varchar(80) not null,
	Apellidos varchar(80) not null,
	Direcci�n varchar(80) not null,
	Tel�fono int not null,
	Nombre_Usuario varchar(20) not null,
	Contrase�a varchar(20) not null,
	Tipo_Usuario int not null,
	Primary key(C�dula)
)

Create Table Docentes
(
	C�dula_Docente varchar(20) not null,
	Cantidad_Materias int not null,
	Desempe�o varchar(100) not null,
	Primary key(C�dula_Docente),
	Foreign key(C�dula_Docente) references Persona(C�dula)
)

Create Table Estudiantes
(
	C�dula_Estudiante varchar(20) not null,
	N�mero_Carnet int not null,
	Grado_Cursado int not null,
	Promedio_Final float not null,
	Primary key(C�dula_Estudiante),
	Foreign key(C�dula_Estudiante) references Persona(C�dula)
)

Create Table Coordinador
(
	C�dula_Coordinador varchar(20) not null,
	N�mero_Actividad int not null,
	Primary key(C�dula_Coordinador),
	Foreign key(C�dula_Coordinador) references Persona(C�dula),
	Foreign key(N�mero_Actividad) references Cronograma(N�mero_Actividad)
)

Create Table Secretarios
(
	C�dula_Secretario varchar(20) not null,
	N�mero_Actividad int not null,
	Primary key(C�dula_Secretario),
	Foreign key(C�dula_Secretario) references Persona(C�dula),
	Foreign key(N�mero_Actividad) references Cronograma(N�mero_Actividad)
)

Create Table Materias
(
	C�digo_Materia varchar(20) not null,
	Nombre_Materia varchar(50) not null,
	Grado_Curso int not null,
	Check(Grado_Curso >= 1 AND Grado_Curso <= 11),
	N�mero_Periodo int not null,
	Check(N�mero_Periodo >= 1 AND N�mero_Periodo <= 4),	
	Promedio_Periodo float not null,
	Check(Promedio_Periodo > 0.0 AND Promedio_Periodo <= 5.0),
	C�dula_Docente varchar(20) not null,
	Primary key(C�digo_Materia),
	Foreign key(C�dula_Docente) references Docentes(C�dula_Docente)
)

Create Table Notas
(
	C�dula_Estudiante varchar(20) not null,
	C�digo_Materia varchar(20) not null,
	N�mero_Peri�do int not null,
	Actividad varchar(100) not null,
	Nota float not null,
	Check(Nota > 0.0 AND Nota <=5.0),
	Nivel varchar(10) not null,
	Porcentaje int not null,
	Primary key(C�dula_Estudiante, C�digo_Materia, N�mero_Peri�do),
	Foreign key(C�dula_Estudiante) references Estudiantes(C�dula_Estudiante),
	Foreign key(C�digo_Materia) references Materias(C�digo_Materia)
)

Create Table Matr�culas
(
	C�dula_Secretario varchar(20) not null,
	C�digo_Materia varchar(20) not null,
	C�dula_Docente varchar(20) not null,
	C�dula_Estudiante varchar(20) not null,	
	A�o_Curso int not null,
	Primary key(C�dula_Secretario, C�digo_Materia, C�dula_Docente, C�dula_Estudiante),
	Foreign key(C�dula_Secretario) references Secretarios(C�dula_Secretario),
	Foreign key(C�digo_Materia) references Materias(C�digo_Materia),
	Foreign key(C�dula_Docente) references Docentes(C�dula_Docente),
	Foreign key(C�dula_Estudiante) references Estudiantes(C�dula_Estudiante)	
)

Insert into Persona values(96060517328,'Sebasti�n','Mej�a Serna','Calle 11Bsur #11-27',3618386,'Smejias1','sebasmejia',0)
Insert into Persona values(95051723456,'Daniel','Arbel�ez �lvarez','Calle 10 #10-34',2345678,'Danarbe','arbecuca',3)
Insert into Persona values(93022332324,'Camilo','Rivera Ladino','Calle 23 #23-45',3232434,'Camilolindo','cami',1)
Insert into Persona values(96020532343,'Johan Sebastian','Hern�ndez Carvajal','Calle 02 #02-34',2315678,'Sebash','rice',2)

Insert into Cronograma values(1,'Redunan labores de Administrativos','11 Meses','2013-01-21','2013-11-18')
Insert into Cronograma values(2,'Planteamiento del Cronograma','1 Semana','2013-01-21','2013-01-25')
Insert into Cronograma values(3,'Incian las Clase','11 Meses','2013-01-28','2013-11-08')
Insert into Cronograma values(4,'Concertaci�n de Evaluaci�n','1 Semana','2013-01-28','2013-02-01')

