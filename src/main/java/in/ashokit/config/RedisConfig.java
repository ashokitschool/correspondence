package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jendisConnectionFactory() {
		JedisConnectionFactory jcf = new JedisConnectionFactory();
		// set redis server properties
		return jcf;
	}

	@Bean
	public RedisTemplate<String, String> redisTemplate(){
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jendisConnectionFactory());
		return redisTemplate;
	}
}
