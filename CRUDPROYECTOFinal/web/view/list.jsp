<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Empleado"%>
<%@page import="modelDAO.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Registros</title>
    </head>
    <body>
        <div class="container">
            <h1> Datos en la entidad Empleado</h1>
            <a href="EmpleadoController?accion=add">Agregar Registro</a>
                <br><br>
            <table>
                <thead>  
                    <tr>
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
                        <td><%= emp.getIdEmpleado()%></td>
                        <td><%= emp.getDPI()%></td>
                        <td><%= emp.getNombre()%></td>
                        <td><%= emp.getTelefono()%></td>
                        <td><%= emp.getEstado()%></td>
                        <td><%= emp.getUsers()%></td>
                        <td>
                            <a href="EmpleadoController?accion=editar&IdEmpleado=<%=emp.getIdEmpleado()%>">Editar</a> 
                            <a href="EmpleadoController?accion=eliminar&IdEmpleado=<%=emp.getIdEmpleado()%>">Delete</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
