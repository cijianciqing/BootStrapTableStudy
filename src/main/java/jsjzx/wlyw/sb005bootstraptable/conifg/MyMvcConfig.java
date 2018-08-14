package jsjzx.wlyw.sb005bootstraptable.conifg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("atguigu").setViewName("success");//用于测试
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/main.html").setViewName("/asset/list");
    }

/*
//暂时禁用，其他功能测试完成后再启用
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        springboot已经做好论文静态资源映射
        registry.addInterceptor(new MyLoginInterceptor()).addPathPatterns("/*")
                .excludePathPatterns("/index.html","/","user/lgin");
    }*/
}
