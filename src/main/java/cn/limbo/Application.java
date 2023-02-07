package cn.limbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by limbo on 2017/4/10.
 */

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableAsync
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}

}
