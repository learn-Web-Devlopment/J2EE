import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class user extends HttpServlet {

  public void service(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
        String user = req.getParameter("t1");

        PrintWriter out = res.getWriter();

        out.print("Welcome "+ user);
    }
}
