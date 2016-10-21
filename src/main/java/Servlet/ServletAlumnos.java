/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Entidades.AlumnoBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
@WebServlet(name = "ServletAlumnos", urlPatterns = {"/ServletAlumnos"})
public class ServletAlumnos extends HttpServlet {

    private List<AlumnoBean> lista = new ArrayList<>();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        AlumnoBean alumno1 = new AlumnoBean();
        alumno1.setDNI("1234A");
        alumno1.setNombre("Nombre1");
        alumno1.setPrimerapellido("Papellido1");
        alumno1.setSegundoapellido("Sapellido1");
        AlumnoBean alumno2 = new AlumnoBean();
        alumno2.setDNI("4321A");
        alumno2.setNombre("Nombre2");
        alumno2.setPrimerapellido("Papellido2");
        alumno2.setSegundoapellido("Sapellido2");
        AlumnoBean alumno3 = new AlumnoBean();
        alumno3.setDNI("1111A");
        alumno3.setNombre("Nombre3");
        alumno3.setPrimerapellido("Papellido3");
        alumno3.setSegundoapellido("Sapellido3");
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        AlumnoBean alumno = new AlumnoBean();
        alumno.setDNI("El DNI introducido no corresponde con ninguno almacenado.");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDNI().equalsIgnoreCase(request.getParameter("dni"))) {
                alumno.setDNI(lista.get(i).getDNI());
                alumno.setNombre(lista.get(i).getNombre());
                alumno.setPrimerapellido(lista.get(i).getPrimerapellido());
                alumno.setSegundoapellido(lista.get(i).getSegundoapellido());
            }
        }
        request.setAttribute("alumno", alumno);
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/MuestraDatosAlumno.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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
