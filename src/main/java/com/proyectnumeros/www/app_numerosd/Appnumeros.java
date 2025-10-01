package com.proyectnumeros.www.app_numerosd;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "appnumeros", value = "/App_numeros")
public class Appnumeros extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }

private void  doNum_Maximo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Configurar el tipo de contenido y codificación
    response.setCharacterEncoding("UTF-8");

    String numero1 = request.getParameter("n1");
    String numero2 = request.getParameter("n2");

    try{
        int resultado = Integer.parseInt(numero1) + Integer.parseInt(numero2);
        response.getWriter().println("El resultado es: " + resultado);
    }catch(Exception e){
        response.getWriter().println("Debes de ingresar dos numeros validos.");
        e.printStackTrace();
    }
}

}