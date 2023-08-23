import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class visitor extends HttpServlet {

  int i;

  public void init() {
    i = 0;
  }

  public void service(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
    PrintWriter out = res.getWriter();

    out.print("Visitor : " + i++);
  }
}
