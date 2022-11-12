
create table persona_alejandro(
	id int IDENTITY(1,1) primary key not null,
    primer_nombre varchar(50) not null,
    segundo_nombre varchar(50) not null,
    primer_apellido varchar(50) not null,
    segundo_apellido varchar(50) not null

)

insert into persona_alejandro (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido)
values ('Alejandro', 'Antonio', 'Ruiz', 'Munguia')
insert into persona_alejandro (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido)
values ('Sara', 'Maria', 'Jarquin', 'Ruiz')
insert into persona_alejandro (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido)
values ('Juan', 'Gabriel', 'Munguia', 'Lopez')

SELECT * FROM persona_alejandro