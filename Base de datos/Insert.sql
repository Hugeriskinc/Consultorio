insert into medicos(id_medico, Nombre, Apellido, Fecha_registro, Telefono, Contraseña, Categoria)
values(1, 'Oscar', 'Ortiz', '21/01/1995', '829-351-0616', 'Oscar3031', 'ADM');

insert into medicos(id_medico, Nombre, Apellido, Fecha_registro, Telefono, Contrasena, Categoria)
values(2, 'Francis', 'Ortiz', '21/01/1995', '829-351-0616', 'Francis', 'USU');

insert into PACIENTES(ID_PACIENTES, NOMBRE, apellido, edad, sexo, cedula, telefono, fecha_nacimiento, seguro, fecha_registro)
values(1, 'Oscar', 'Ortiz', '22', 'm', '0293i', '809', '21/011995', 'io436', '20/012018');

insert into CITAS(ID_CITAS, ID_PACIENTES, id_medico, fecha)
values(1, 1, 1, '20/01/2018');