package demo.bt1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/display_discount")
public class HelloServlet extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Hello World!";
//    }
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String product_Description = (req.getParameter("Product_Description"));
        float list_Price = Float.parseFloat(req.getParameter("list_Price"));
        float discount_Percent = Float.parseFloat(req.getParameter("discount_Percent"));
        float discount_Amount = (float) (list_Price * discount_Percent * 0.01);
        float discount_Price = list_Price - discount_Amount;
        PrintWriter writer = resp.getWriter();

//        writer.println("<html>");
        writer.println("<h1> Product Description:" + product_Description + "</h1>");
        writer.println("<h1> List Price:" + list_Price + "</h1>");
        writer.println("<h1> Discount Percent:" + discount_Percent + "</h1>");
        writer.println("<h1> Discount Amount:" + discount_Amount + "</h1>");
        writer.println("<h1> Discount Price:" + discount_Price + "</h1>");
//        writer.println("</html>");
    }

    public void destroy() {
    }
}