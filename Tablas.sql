 #----cracion de la base de datos---
 
 create database DBTonysKinal2020;
 use DBTonysKinal2020;
 
 #----creacion de la tabla empleado----
 create table empleado(IdEmpleado int(10) not null primary key auto_increment, 
						DPI varchar(8) not null,
                        Nombre varchar(255),
                        Telefono varchar(9),
                        Estado varchar(1),
                        Users varchar(8));

#----cracion de la tabla clientes---
create table cliente(IdCliente int(11) not null primary key auto_increment not null,
					DPI varchar(8),
                    Nombres varchar(244),
                    Direccion varchar(244),
                    Estado varchar(1));

#----creacion de la tabla producto---
create table producto(IdProducto int(11) primary key auto_increment not null,
						Nombre varchar(244),
                        precio double,
                        Stock int(11),
                        Estado varchar(1));
                        
#-------creacion de la tabla ventas---
create table ventas(IdVentas int(11) primary key auto_increment not null, 
					IdCliente int(11) not null,
                    IdEmpleado int(11) not null,
                    NumeroSerie varchar(244),
                    FechaVentas Date,
                    Monto double,
                    Estado varchar(1),
                   foreign key (IdCliente) references cliente(IdCliente),
                   foreign key (IdEmpleado) references empleado(IdEmpleado));
                    
#------creacion de la tabla detalles_ventas---
create table detalles_ventas(idDatalleVentas int(11) primary key auto_increment not null,
							IdVentas int(11),
                            IdProducto int(11),
                            cantidad int(11),
                            PrecioVenta double,
                            foreign key (IdVentas) references ventas(IdVentas),
                            foreign key (IdProducto) references producto(IdProducto));
                        