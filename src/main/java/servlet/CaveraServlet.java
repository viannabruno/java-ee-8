package servlet;

import cdi.ApplicationBean;
import cdi.RequestBean;
import cdi.SessionBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cavera/")
public class CaveraServlet extends HttpServlet {

    @Inject
    private ApplicationBean ab;

    @Inject
    private RequestBean rb;

    @Inject
    private SessionBean sb;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Funciona!");

        resp.getWriter().append("Funciona!");

        resp.getWriter().append("AplicationBean: " + ab.getContador() + " ");
        resp.getWriter().append("SessionBean: " + sb.getContador() + " ");
        resp.getWriter().append("RequestBean: " + rb.getContador() + " ");

        System.out.println("AplicationBean: " + ab.getContador());
        System.out.println("SessionBean: " + sb.getContador());
        System.out.println("RequestBean: " + rb.getContador());
    }


}
