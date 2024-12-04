package customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")

public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nguyên Phương", "2004-07-23","Hà Nội", "https://th.bing.com/th/id/OIP.Cwsq_lw0jjp-fDRl94HrbgHaEo?w=250&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        customers.add(new Customer("Linh", "2011-12-27", "Hà Nội","https://th.bing.com/th/id/OIP.Cwsq_lw0jjp-fDRl94HrbgHaEo?w=250&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        customers.add(new Customer("Bảo Thiên", "2012-12-12", "Hà Nội","https://th.bing.com/th/id/OIP.Cwsq_lw0jjp-fDRl94HrbgHaEo?w=250&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        customers.add(new Customer("Hà Quân","1997-09-06","Quốc Oai","https://th.bing.com/th/id/OIP.Cwsq_lw0jjp-fDRl94HrbgHaEo?w=250&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));

        request.setAttribute("customers",customers);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
