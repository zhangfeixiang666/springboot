package cn.asiainfo.config;

import cn.asiainfo.exception.MyExceptionResolver;
import cn.asiainfo.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 15:28
 * @Version 1.0
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
	@Autowired
	private MyExceptionResolver myExceptionResolver;
	@Autowired
	private MyInterceptor myInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor).addPathPatterns("/**");
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

		resolvers.add(myExceptionResolver);
	}
}
