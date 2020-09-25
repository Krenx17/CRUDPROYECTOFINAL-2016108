package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empleado;
import modelDAO.EmpleadoDAO;

public class EmpleadoController extends HttpServlet {
    
    String listar = "view/list.jsp";
    String add = "view/add.jsp";
    String edit= "view/edit.jsp";
    Empleado nuevoEmpleado = new Empleado();
    EmpleadoDAO nuevoEmpleadoDAO = new EmpleadoDAO();
    int IdEmpleado;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmpleadoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmpleadoController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * * Handles the HTTP <code>POST</code> method.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acceso = "";
        String action = request.getParameter ("accion");
        if (action.equalsIgnoreCase("listar")){
            acceso = listar;
        }else if(action.equalsIgnoreCase("add")){
            acceso = add;
        }else if(action.equalsIgnoreCase("Agregar")){
            String DPI = request.getParameter("txtDPI");
            String nombre = request.getParameter("txtNombre");
            String Telefono = request.getParameter("txtTelefono");
            String Estado = request.getParameter("txtEstado");
            String Users = request.getParameter("txtUsers");
            nuevoEmpleado.setDPI(DPI);
            nuevoEmpleado.setNombre(nombre);
            nuevoEmpleado.setNombre(Telefono);
            nuevoEmpleado.setEstado(Estado);
            nuevoEmpleado.setUsers(Users);

            nuevoEmpleadoDAO.add(nuevoEmpleado);
            acceso = listar;

        }else if (action.equalsIgnoreCase("editar")){
            request.setAttribute("IdEmp", request.getParameter("IdEmpleado"));
            acceso= edit;
        }else if (action.equalsIgnoreCase("Actualizar")){
            IdEmpleado = Integer.parseInt(request.getParameter("txtIdEmpleado"));
            String DPI = request.getParameter("txtDPI");
            String nombres = request.getParameter("txtNombre");
            String telefono = request.getParameter("txtTelefono");
            String estado = request.getParameter("txtEstado");
            String user = request.getParameter("txtUser");
            nuevoEmpleado.setIdEmpleado(IdEmpleado);
            nuevoEmpleado.setDPI(DPI);
            nuevoEmpleado.setNombre(nombres);
            nuevoEmpleado.setTelefono(telefono);
            nuevoEmpleado.setEstado(estado);
            nuevoEmpleado.setUsers(user);
            nuevoEmpleadoDAO.edit(nuevoEmpleado);
            acceso= listar;
        }else if (action.equalsIgnoreCase("eliminar")){
            IdEmpleado = Integer.parseInt(request.getParameter("IdEmpleado"));
            nuevoEmpleado.setIdEmpleado(IdEmpleado);
            nuevoEmpleadoDAO.eliminar(IdEmpleado);
            acceso= listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * * Handles the HTTP <code>POST</code> method.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
