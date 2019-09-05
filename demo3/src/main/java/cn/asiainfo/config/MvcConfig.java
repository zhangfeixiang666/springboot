package cn.asiainfo.config;

import cn.asiainfo.exception.MyExceptionResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 16:12
 * @Version 1.0
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
	@Autowired
	private MyExceptionResolver myExceptionResolver;

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		resolvers.add(myExceptionResolver);
	}
}
