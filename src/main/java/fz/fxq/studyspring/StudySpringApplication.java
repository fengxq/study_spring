package fz.fxq.studyspring;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fz.fxq.studyspring.mapper")
public class StudySpringApplication {
    static Logger logger = LoggerFactory.getLogger(StudySpringApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StudySpringApplication.class, args);

        logger.info("--------------------------");
        logger.info("------Start Success-------");
        logger.info("--------------------------");
    }

}
