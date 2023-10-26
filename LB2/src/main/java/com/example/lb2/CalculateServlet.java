package com.example.lb2;

import java.io.*;
import java.text.DecimalFormat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "calculateServlet", value = "/calculate")
public class CalculateServlet extends HttpServlet {
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            response.setContentType("text/html");
            double x = Double.parseDouble(request.getParameter("x"));
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            double c = Double.parseDouble(request.getParameter("c"));
            double start = Double.parseDouble(request.getParameter("start"));
            double end = Double.parseDouble(request.getParameter("end"));
            double step = Double.parseDouble(request.getParameter("step"));

           // DecimalFormat df = new DecimalFormat("#.###");
            Main main = new Main();
            double functionY = main.functionY(a,b,c,x);
            double count = main.count(start, end, step);
            double[] masX = main.createArrayX(start, end, step);
            double[] masY = main.createArrayY(a, b, c, masX);
            int imin = main.iminY(masY);
            double min = masY[imin];
            int imax = main.imaxY(masY);
            double max = masY[imax];
            double sum = main.sumY(masY);
            double average = main.averageY(masY);

            //functionY = Double.parseDouble(df.format(functionY));
            request.setAttribute("functionY", functionY);
            request.setAttribute("count", count);
            request.setAttribute("masX", masX);
            request.setAttribute("masX", masX);
            request.setAttribute("masY", masY);
            request.setAttribute("imin", imin);
           // min = Double.parseDouble(df.format(min));
            request.setAttribute("min", min);
           // max = Double.parseDouble(df.format(max));
            request.setAttribute("max", max);
            request.setAttribute("imax", imax);
           // sum = Double.parseDouble(df.format(sum));
            request.setAttribute("sum", sum);
           // average = Double.parseDouble(df.format(average));
            request.setAttribute("average", average);

            request.getRequestDispatcher("result.jsp").forward(request, response);

    }
}

