import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
// first you need pakage for print date
import java.util.*;

public class date extends HttpServlet{
    public void service(HttpServletRequest req,HttpServletResponse res)
    throws IOException, ServletException{
        PrintWriter out = res.getWriter();
        out.print(new Date());
    }
}