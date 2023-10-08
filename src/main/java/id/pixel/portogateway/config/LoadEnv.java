package id.pixel.portogateway.config;

import id.pixel.portogateway.util.ConfigEnv;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class LoadEnv {

    @Value("${security.jwt.secret}")
    private String jwtSecret;

    @Value("${security.jwt.expired-time}")
    private int jwtExpiredTime;

    @Value("${security.allowed-origin}")
    private String allowedOrigin;

    @Value("${cms-porto-api.url}")
    private String cmsPortoApiUrl;

    @Value("${cms-porto-api.endpoint.validate-user}")
    private String cmsPortoApiValidateUserEndpoint;

    @Value("${cms-porto-api.endpoint.register-user}")
    private String cmsPortoApiRegisterUserEndpoint;

    @PostConstruct
    public void loadEnv() {
        ConfigEnv.setJwtSecret(jwtSecret);
        ConfigEnv.setJwtTokenExpiredTime(jwtExpiredTime);
        ConfigEnv.setCmsPortoApiUrl(cmsPortoApiUrl);
        ConfigEnv.setAllowedOrigin(allowedOrigin);
        ConfigEnv.setCmsPortoApiValidateUserEndpoint(cmsPortoApiValidateUserEndpoint);
        ConfigEnv.setCmsPortoApiRegisterUserEndpoint(cmsPortoApiRegisterUserEndpoint);
    }

}