package tms.lesson19.calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("a"));
        int num2 = Integer.parseInt(req.getParameter("b"));
        String operator = req.getParameter("operator");

        Calculator calculator = new Calculator(num1, num2, operator);

        resp.getWriter().println("Result: " + calculator.calculate());
    }
}
