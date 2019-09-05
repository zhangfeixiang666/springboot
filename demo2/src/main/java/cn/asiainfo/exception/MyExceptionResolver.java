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
 * @Date 2019/9/5 14:21
 * @Version 1.0
 */
@Component
public class MyExceptionResolver implements HandlerExceptionResolver  {
	@Override
	public ModelAndView resolveException (HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

		ex.printStackTrace();
		MyException e = null;
		//获取到异常对象
		if (ex instanceof MyException){
			e=(MyException)ex;
		}else {
			e = new MyException("请联系管理员！！！");
		}
		try {
			request.getRequestDispatcher("/error.html").forward(request,response);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return null;
	}
}
