package decoupled_domain_minimum_example.greetService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"decoupled_domain_minimum_example.configuration"})
public class DecoupledDomainMinimumExampleApplicationTests {

	@Test
	public void contextLoads() {
		assertThat(3,is(3));
	}

}