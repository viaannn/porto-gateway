package id.pixel.portogateway.config;

import id.pixel.portogateway.util.ConfigEnv;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GenerateConfigEnv {

    @Value("${config.jwt.secret}")
    private String jwtSecret;

    @Value("${config.jwt.expired-time}")
    private int jwtExpiredTime;

    @Value("${cms-porto-api.url}")
    private String cmsPortoApiUrl;

    @Value("${cms-porto-api.endpoint.validate-user}")
    private String cmsPortoApiValidateUserEndpoint;

    @Value("${cms-porto-api.endpoint.register-user}")
    private String cmsPortoApiRegisterUserEndpoint;

    @PostConstruct
    public void loadConfig() {
        ConfigEnv.setJwtSecret(jwtSecret);
        ConfigEnv.setJwtTokenExpiredTime(jwtExpiredTime);
        ConfigEnv.setCmsPortoApiUrl(cmsPortoApiUrl);
        ConfigEnv.setCmsPortoApiValidateUserEndpoint(cmsPortoApiValidateUserEndpoint);
        ConfigEnv.setCmsPortoApiRegisterUserEndpoint(cmsPortoApiRegisterUserEndpoint);

    }

}
