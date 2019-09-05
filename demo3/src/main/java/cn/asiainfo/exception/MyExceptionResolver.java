package cn.asiainfo.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 16:13
 * @Version 1.0
 */
@Component
public class MyExceptionResolver implements HandlerExceptionResolver {
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

		ex.printStackTrace();

		try {
			request.getRequestDispatcher("/error.html").forward(request,response);
		} catch (ServletException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
