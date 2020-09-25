<%-- 
    Document   : editar
    Created on : 15/09/2020, 09:01:35 PM
    Author     : Admin
--%>

<%@page import="model.Empleado"%>
<%@page import="modelDAO.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Pagina Editar</title>
    </head>
    <body>
        <div>
            <div>
                <%
                    EmpleadoDAO nuevoEmpleadoDao = new EmpleadoDAO();
                    int IdEmpleado = Integer.parseInt((String)request.getAttribute("IdEmp"));
                    Empleado nuevoEmpleado = (Empleado)nuevoEmpleadoDao.list(IdEmpleado);
                %>
                <h1>Modificar Empleado</h1>
                <form>
                    <strong>DPI:</strong>
                    <input class="form-control" type="text" name="txtDPI" value="<%= nuevoEmpleado.getDPI() %>"><br>
                    <strong>Nombres:</strong>
                    <input class="form-control" type="text" name="txtNombre" value="<%= nuevoEmpleado.getNombre() %>"><br>
                    <strong>Telefono:</strong>
                    <input class="form-control" type="text" name="txtTelefono" value="<%= nuevoEmpleado.getTelefono() %>"><br>
                    <strong>Estado:</strong>
                    <input class="form-control" type="text" name="txtEstado" value="<%= nuevoEmpleado.getEstado() %>"><br>
                    <strong>User:</strong>
                    <input class="form-control" type="text" name="txtUsers" value="<%= nuevoEmpleado.getUsers() %>"><br>
                    <input type="hidden" name="txtIdEmpleado" value="<%= nuevoEmpleado.getIdEmpleado() %>"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"><br>
                </form>
            </div>
        </div>
    </body>
</html>