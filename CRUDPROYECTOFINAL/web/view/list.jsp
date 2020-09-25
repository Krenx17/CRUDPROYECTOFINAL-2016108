<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Empleado"%>
<%@page import="modelDAO.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Listar Registros</title>
    </head>
    <body>
        <div class="container">
            <h1 class="btn btn-success"> Datos en la entidad Empleado</h1>
            <a class="btn btn-success" href="EmpleadoController?accion=add">Agregar Registro</a>
                <br><br>
            <table>
                <thead>  
                    <tr class="text-center text-primary">
                        <td> Codigo Empleado </td>
                        <td>  <strong>DPI</strong></td>
                        <td>  <strong>Nombres</strong></td>
                        <td>  <strong>Telefono</strong></td>
                        <td>  <strong>Estado</strong></td>
                        <td>  <strong>User</strong></td>
                        <td>  <strong>Acciones</strong></td>
                    </tr>
                </thead>
                <%
                            EmpleadoDAO dao = new EmpleadoDAO();
                            List<Empleado> listarEmpleado = dao.listar();
                            Iterator<Empleado> iterator= listarEmpleado.iterator();
                            Empleado emp = null;
                            while(iterator.hasNext()){
                                emp = iterator.next();
                            %>
                <tbody>
                    <tr>
                        <td class="text-center active"><%= emp.getIdEmpleado()%></td>
                        <td class="text-center"><%= emp.getDPI()%></td>
                        <td class="text-center active"><%= emp.getNombre()%></td>
                        <td class="text-center active"><%= emp.getTelefono()%></td>
                        <td class="text-center active"><%= emp.getEstado()%></td>
                        <td class="text-center active"><%= emp.getUsers()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="EmpleadoController?accion=editar&IdEmpleado=<%=emp.getIdEmpleado()%>">Editar</a> 
                            <a class="btn btn-danger" href="EmpleadoController?accion=eliminar&IdEmpleado=<%=emp.getIdEmpleado()%>">Delete</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
