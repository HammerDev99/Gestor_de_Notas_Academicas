Create DataBase DB_NotesMSA
use DB_NotesMSA

Create Table Cronograma
(
	Número_Actividad int not null,
	Actividad varchar(100) not null,
	Duración varchar(20) not null,
	Fecha_Inicio date not null,
	Fecha_Fin date not null,
	Primary key(Número_Actividad)
)


Create Table Persona
(
	Cédula varchar(20) not null,
	Nombres varchar(80) not null,
	Apellidos varchar(80) not null,
	Dirección varchar(80) not null,
	Teléfono int not null,
	Nombre_Usuario varchar(20) not null,
	Contraseña varchar(20) not null,
	Tipo_Usuario int not null,
	Primary key(Cédula)
)

Create Table Docentes
(
	Cédula_Docente varchar(20) not null,
	Cantidad_Materias int not null,
	Desempeño varchar(100) not null,
	Primary key(Cédula_Docente),
	Foreign key(Cédula_Docente) references Persona(Cédula)
)

Create Table Estudiantes
(
	Cédula_Estudiante varchar(20) not null,
	Número_Carnet int not null,
	Grado_Cursado int not null,
	Promedio_Final float not null,
	Primary key(Cédula_Estudiante),
	Foreign key(Cédula_Estudiante) references Persona(Cédula)
)

Create Table Coordinador
(
	Cédula_Coordinador varchar(20) not null,
	Número_Actividad int not null,
	Primary key(Cédula_Coordinador),
	Foreign key(Cédula_Coordinador) references Persona(Cédula),
	Foreign key(Número_Actividad) references Cronograma(Número_Actividad)
)

Create Table Secretarios
(
	Cédula_Secretario varchar(20) not null,
	Número_Actividad int not null,
	Primary key(Cédula_Secretario),
	Foreign key(Cédula_Secretario) references Persona(Cédula),
	Foreign key(Número_Actividad) references Cronograma(Número_Actividad)
)

Create Table Materias
(
	Código_Materia varchar(20) not null,
	Nombre_Materia varchar(50) not null,
	Grado_Curso int not null,
	Check(Grado_Curso >= 1 AND Grado_Curso <= 11),
	Número_Periodo int not null,
	Check(Número_Periodo >= 1 AND Número_Periodo <= 4),	
	Promedio_Periodo float not null,
	Check(Promedio_Periodo > 0.0 AND Promedio_Periodo <= 5.0),
	Cédula_Docente varchar(20) not null,
	Primary key(Código_Materia),
	Foreign key(Cédula_Docente) references Docentes(Cédula_Docente)
)

Create Table Notas
(
	Cédula_Estudiante varchar(20) not null,
	Código_Materia varchar(20) not null,
	Número_Periódo int not null,
	Actividad varchar(100) not null,
	Nota float not null,
	Check(Nota > 0.0 AND Nota <=5.0),
	Nivel varchar(10) not null,
	Porcentaje int not null,
	Primary key(Cédula_Estudiante, Código_Materia, Número_Periódo),
	Foreign key(Cédula_Estudiante) references Estudiantes(Cédula_Estudiante),
	Foreign key(Código_Materia) references Materias(Código_Materia)
)

Create Table Matrículas
(
	Cédula_Secretario varchar(20) not null,
	Código_Materia varchar(20) not null,
	Cédula_Docente varchar(20) not null,
	Cédula_Estudiante varchar(20) not null,	
	Año_Curso int not null,
	Primary key(Cédula_Secretario, Código_Materia, Cédula_Docente, Cédula_Estudiante),
	Foreign key(Cédula_Secretario) references Secretarios(Cédula_Secretario),
	Foreign key(Código_Materia) references Materias(Código_Materia),
	Foreign key(Cédula_Docente) references Docentes(Cédula_Docente),
	Foreign key(Cédula_Estudiante) references Estudiantes(Cédula_Estudiante)	
)

Insert into Persona values(96060517328,'Sebastián','Mejía Serna','Calle 11Bsur #11-27',3618386,'Smejias1','sebasmejia',0)
Insert into Persona values(95051723456,'Daniel','Arbeláez Álvarez','Calle 10 #10-34',2345678,'Danarbe','arbecuca',3)
Insert into Persona values(93022332324,'Camilo','Rivera Ladino','Calle 23 #23-45',3232434,'Camilolindo','cami',1)
Insert into Persona values(96020532343,'Johan Sebastian','Hernández Carvajal','Calle 02 #02-34',2315678,'Sebash','rice',2)

Insert into Cronograma values(1,'Redunan labores de Administrativos','11 Meses','2013-01-21','2013-11-18')
Insert into Cronograma values(2,'Planteamiento del Cronograma','1 Semana','2013-01-21','2013-01-25')
Insert into Cronograma values(3,'Incian las Clase','11 Meses','2013-01-28','2013-11-08')
Insert into Cronograma values(4,'Concertación de Evaluación','1 Semana','2013-01-28','2013-02-01')

