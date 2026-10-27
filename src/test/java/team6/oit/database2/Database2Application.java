package team6.oit.database2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class Database2Application {

  public static void main(String[] args) {
    SpringApplication.run(Database2Application.class, args);
  }
}
