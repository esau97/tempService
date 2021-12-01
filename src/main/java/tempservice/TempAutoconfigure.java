package tempservice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnClass(Temp.class)
@EnableConfigurationProperties(TempProperties.class)
public class TempAutoconfigure {
	
	private final TempProperties properties;
	
	public TempAutoconfigure(TempProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public Temp tempActual() {
		System.out.println("Temperatura en grados: "+properties.getTipo());
		return new Temp(properties.getTipo());
	}
}
