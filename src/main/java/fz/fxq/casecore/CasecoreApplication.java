package fz.fxq.casecore;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fz.fxq.casecore.mapper")
public class CasecoreApplication {
    static Logger logger = LoggerFactory.getLogger(CasecoreApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CasecoreApplication.class, args);

        logger.info("--------------------------");
        logger.info("------Start Success-------");
        logger.info("--------------------------");
    }

}
