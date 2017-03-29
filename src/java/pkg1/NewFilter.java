/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nikheel
 */
public class NewFilter implements Filter {
    
    private FilterConfig filterConfig;
    private String pwd1;
    private String nm;

    public NewFilter() {
        this.pwd1 = null;
        this.nm = null;
        this.filterConfig = null;
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        try
        {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;
            response.setContentType("text/html");
            
            pwd1 = req.getParameter("pwd");
            nm = req.getParameter("unm");
            
            if(pwd1 == null ? nm == null : pwd1.equals(nm))
            {
                chain.doFilter(request, response);
            }
            else
            {
                RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
                       
            System.out.print("I was here\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
            
        }
    
    public void destroy() {        
    }

    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        }
    
}
