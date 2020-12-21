package twix.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import twix.user.config.properties.SecurityConfigProperties;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

    private static final String USERS_URI = "/api/users/**";

    private final SecurityConfigProperties securityConfigProperties;

    public SecurityConfig(SecurityConfigProperties securityConfigProperties) {
        this.securityConfigProperties = securityConfigProperties;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, USERS_URI).permitAll()
                .anyRequest().denyAll()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(securityConfigProperties.getMapping())
                .allowedOrigins(securityConfigProperties.getAllowedOrigins().toArray(String[]::new))
                .allowedMethods(securityConfigProperties.getAllowedMethods().toArray(String[]::new))
                .exposedHeaders(securityConfigProperties.getAllowedMethods().toArray(String[]::new))
                .allowCredentials(true);
    }
}
