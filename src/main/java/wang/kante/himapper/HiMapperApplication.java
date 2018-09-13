package wang.kante.himapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("wang.kante.himapper.mapper")
public class HiMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiMapperApplication.class, args);
	}
}
