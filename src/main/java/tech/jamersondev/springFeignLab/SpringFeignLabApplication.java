package tech.jamersondev.springFeignLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tech.jamersondev.springFeignLab.Util.Conversor;
import tech.jamersondev.springFeignLab.interfaces.FeignConsumerIBGEApi;
import tech.jamersondev.springFeignLab.model.Names;

import java.util.Arrays;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignLabApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignLabApplication.class, args);
	}

	@Autowired
	private FeignConsumerIBGEApi ibgeConsumer;
	private Conversor conversor = new Conversor();

	@Override
	public void run(String... args) throws Exception {
		String body = ibgeConsumer.getNameBySexo("Jamerson");
		Names[] data = conversor.getData(body, Names[].class);
		System.out.println(Arrays.toString(data));

	}
}
