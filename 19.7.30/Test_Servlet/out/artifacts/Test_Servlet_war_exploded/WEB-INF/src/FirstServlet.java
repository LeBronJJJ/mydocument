

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println(request.getCharacterEncoding());
        String name = request.getParameter("name");

        PrintStream out = new PrintStream(response.getOutputStream());

        out.append("<html>");
        out.append("<head>");
        out.append("<title>Servlet Test</title>");
        out.append("<body>");
        out.append("你的名字是" + name);
        out.append("</body>");
        out.append("</head>");
        out.append("</html>");

    }
}
