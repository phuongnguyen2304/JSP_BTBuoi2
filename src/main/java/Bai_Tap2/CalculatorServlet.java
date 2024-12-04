package Bai_Tap2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        double firstOperand = Double.parseDouble(request.getParameter("firstOperand"));
        double secondOperand = Double.parseDouble(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");

        Calculator calculator = new Calculator();
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h2>Calculation Result</h2>");

        try {
            double result = calculator.calculate(firstOperand, secondOperand, operator);
            writer.println("<p>Result: " + firstOperand + " "+ operator + " " + secondOperand + " = " + result + "</p>");
        }catch (ArithmeticException e){
            writer.println("<p style='color:red;'>Error: "+ e.getMessage() + "</p>");
        }catch (IllegalArgumentException e){
            writer.println("<p style='color:red;'>Error: "+e.getMessage() + "/p>");
        }
    }

}
