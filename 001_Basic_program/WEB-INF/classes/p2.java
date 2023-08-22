import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class p2 extends HttpServlet {

  public void service(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {

        PrintWriter out = res.getWriter();

        out.print("Basic Program 2");
    }
}
