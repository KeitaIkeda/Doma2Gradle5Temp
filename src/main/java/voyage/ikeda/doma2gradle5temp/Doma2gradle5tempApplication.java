package voyage.ikeda.doma2gradle5temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import voyage.ikeda.doma2gradle5temp.service.MainService;

@SpringBootApplication
public class Doma2gradle5tempApplication {

    public static void main(String[] args) {
        SpringApplication.run(Doma2gradle5tempApplication.class, args).getBean(MainService.class)
                .getUser();
    }

}
