package net.ssln.fangcun.collection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "net.ssln.fangcun.collection.dao")
public class Run {
	   public static void main(String[] args) throws Exception {
	        SpringApplication.run(Run.class, args);
	    }
}
