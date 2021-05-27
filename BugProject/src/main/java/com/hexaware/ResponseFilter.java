package com.hexaware;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/bug")
public class ResponseFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse response, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletResponse response2 = (HttpServletResponse) response;
		response2.addHeader("myhexware-header", "blah");
		arg2.doFilter(arg0, response);
	}

}
