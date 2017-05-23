/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author crist
 */
public class BoletaPizzaServlet extends HttpServlet {

    @EJB
    private VentaPizzasBeanLocal VentaPizzasBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            
            /*String masaMediana = VentaPizzasBean.obtenerDatosProducto(0, 1);
            String masaFamiliar = VentaPizzasBean.obtenerDatosProducto(1, 1);
            String masaXL = VentaPizzasBean.obtenerDatosProducto(2, 1);
            String salsaTomate = VentaPizzasBean.obtenerDatosProducto(3, 1);
            String crema = VentaPizzasBean.obtenerDatosProducto(4, 1);
            String barbacoa = VentaPizzasBean.obtenerDatosProducto(5, 1);
            String ingPepperoni = VentaPizzasBean.obtenerDatosProducto(6, 1);
            String ingJamon = VentaPizzasBean.obtenerDatosProducto(7, 1);
            String ingCarne = VentaPizzasBean.obtenerDatosProducto(8, 1);
            String ingTomate = VentaPizzasBean.obtenerDatosProducto(9, 1);
            String ingChampignon = VentaPizzasBean.obtenerDatosProducto(10, 1);
            String ingAceitunas = VentaPizzasBean.obtenerDatosProducto(11, 1);*/
            
            int precioMasaMediana = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(0, 2));
            int precioMasaFamiliar = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(1, 2));
            int precioMasaXL = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(2, 2));
            int precioSalsaTomate = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(3, 2));
            int precioCrema = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(4, 2));
            int precioBarbacoa = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(5, 2));
            int precioPepperoni = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(6, 2));
            int precioJamon = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(7, 2));
            int precioCarne = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(8, 2));
            int precioTomate = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(9, 2));
            int precioChampignon = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(10, 2));
            int precioAceitunas = Integer.parseInt(VentaPizzasBean.obtenerDatosProducto(11, 2));

            String masa = request.getParameter("masa");
            String tamano_masa = request.getParameter("tamano_masa");
            String salsa = request.getParameter("salsa");
            String queso = request.getParameter("queso");
            String pepperoni = request.getParameter("pepperoni");
            String jamon = request.getParameter("jamon");
            String carne = request.getParameter("carne");
            String tomate = request.getParameter("tomate");
            String champignon = request.getParameter("champignon");
            String aceitunas = request.getParameter("aceitunas");

            //masas
            if (request.getParameter("masa").equals("mediana")) {
                precioMasaFamiliar = 0;
                precioMasaXL = 0;
            }

            if (request.getParameter("masa").equals("familiar")) {
                precioMasaMediana = 0;
                precioMasaXL = 0;
            }

            if (request.getParameter("masa").equals("XL")) {
                precioMasaFamiliar = 0;
                precioMasaMediana = 0;
            }

            //salsas
            if (request.getParameter("salsa").equals("salsa de tomates")) {
                precioBarbacoa = 0;
                precioCrema = 0;
            }

            if (request.getParameter("salsa").equals("crema")) {
                precioBarbacoa = 0;
                precioSalsaTomate = 0;
            }

            if (request.getParameter("salsa").equals("barbacoa")) {
                precioCrema = 0;
                precioSalsaTomate = 0;
            }

            //ingredientes
            if (request.getParameter("pepperoni") == null) {
                pepperoni = "";
                precioPepperoni = 0;
            }

            if (request.getParameter("carne") == null) {
                carne = "";
                precioCarne = 0;
            }

            if (request.getParameter("jamon") == null) {
                jamon = "";
                precioJamon = 0;
            }

            if (request.getParameter("tomate") == null) {
                tomate = "";
                precioTomate = 0;
            }

            if (request.getParameter("champignon") == null) {
                champignon = "";
                precioChampignon = 0;
            }

            if (request.getParameter("aceitunas") == null) {
                aceitunas = "";
                precioAceitunas = 0;
            }

            int precioTotalPizza = (precioMasaMediana + precioMasaFamiliar + precioMasaXL + precioSalsaTomate + precioCrema
                    + precioBarbacoa + precioPepperoni + precioCarne + precioJamon + precioTomate + precioChampignon + precioAceitunas);

            double calcularIVA = (precioTotalPizza * (0.19));

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BoletaPizzaServlet</title>");
            out.println("<script src=\"js/funciones.js\" type=\"text/javascript\"> </script>");
            out.print("<link href=\"css/newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 id=\"encabezado\">Boleta Pizza </h1><br>");
            out.println("<div id=\"formula\">");
            out.println("<center><p>El pedido hecho por usted es:</p><br></center>");
            out.println("<div id=\"cuadro\"></div>");
            out.println("Pizza " + masa + " con masa " + tamano_masa + ", " + salsa + " y " + queso + ", de ingredientes:<br><br>");

            out.println("<ul><li>" + pepperoni + " </li><li>" + carne + " </li><li>" + jamon
                    + " </li><li>" + tomate + " </li><li>" + champignon + " </li><li>" + aceitunas + " </li></ul><br><br>");

            out.print("Subtotal: $" + precioTotalPizza + "<br><br>");
            out.print("IVA: $" + calcularIVA + "<br><br>");
            out.println("<p>el total de su pedido es: $" + (precioTotalPizza + calcularIVA) + " pesos</p>");
            out.println("</div>");
            out.println("<footer id=\"pie\">Delivery pizza Fono: 452348470 Celular: +56 958863373<footer>");
            out.println("</body>");
            out.println("</html>");

        }
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
