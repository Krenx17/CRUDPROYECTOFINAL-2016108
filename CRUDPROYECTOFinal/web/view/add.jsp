<%-- 
    Document   : add
    Created on : 15/09/2020, 09:01:04 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Agregar</title>
    </head>
    <body>
        <div>
            <div>
                <h1>Agregar Registro</h1>
                <form>
                    DPI:<br>
                    <input class="form-control" type="text" name="txtDPI"><br>
                    Nombres: <br>
                    <input class="form-control" type="text" name="txtNombre"><br><br>
                    Telefono:<br>
                    <input class="form-control" type="text" name="txtTelefono"><br>
                    Estado:<br>
                    <input class="form-control" type="text" name="txtEstado"><br>
                    User:<br>
                    <input class="form-control" type="text" name="txtUsers"><br> 
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br>
                </form>
            </div>
        </div>
    </body>
</html>