package fz.fxq.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fz.fxq.boot.mapper")
public class StudySpringBootApplication {
    static Logger logger = LoggerFactory.getLogger(StudySpringBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StudySpringBootApplication.class, args);

        logger.info("--------------------------");
        logger.info("------Start Success-------");
        logger.info("--------------------------");
    }

}
