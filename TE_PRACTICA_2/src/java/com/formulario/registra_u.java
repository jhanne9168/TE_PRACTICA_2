
package com.formulario;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "registra_u", urlPatterns = {"/registra_u"})
public class registra_u extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre= request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String correoelectronico=request.getParameter("correoelectronico");
        Datos obj=new Datos();
        obj.setNombre(nombre);
        obj.setCorreoelectronico(correoelectronico);
        obj.setApellido(apellido);
        request.setAttribute("miEncu", obj);
        request.getRequestDispatcher("salida_r.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
