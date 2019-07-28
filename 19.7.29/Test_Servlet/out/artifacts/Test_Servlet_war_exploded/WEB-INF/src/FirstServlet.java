

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

public class FirstServlet extends HttpServlet {
    public void Service(HttpServletRequest request,
                        HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("GBK");
        response.setContentType("text/html,charset=GBK");

        String name = request.getParameter("name");

        PrintStream out = new PrintStream(response.getOutputStream());

        out.append("<html>");
        out.append("<head>");
        out.append("<title>Servlet Test</title>");
        out.append("body");
        out.append("your name is" + name);
        out.append("/body");
        out.append("</head>");
        out.append("</html>");

    }
}
