package id.pixel.portogateway.util;

public class ConfigEnv {

    private ConfigEnv() {}

    private static String jwtSecret;
    private static int jwtTokenExpiredTime;
    private static String cmsPortoApiUrl;
    private static String cmsPortoApiValidateUserEndpoint;
    private static String cmsPortoApiRegisterUserEndpoint;
    private static String allowedOrigin;

    public static String getJwtSecret() {
        return jwtSecret;
    }

    public static void setJwtSecret(String jwtSecret) {
        ConfigEnv.jwtSecret = jwtSecret;
    }

    public static int getJwtTokenExpiredTime() {
        return jwtTokenExpiredTime;
    }

    public static void setJwtTokenExpiredTime(int jwtTokenExpiredTime) {
        ConfigEnv.jwtTokenExpiredTime = jwtTokenExpiredTime;
    }

    public static String getCmsPortoApiUrl() {
        return cmsPortoApiUrl;
    }

    public static void setCmsPortoApiUrl(String cmsPortoApiUrl) {
        ConfigEnv.cmsPortoApiUrl = cmsPortoApiUrl;
    }

    public static String getCmsPortoApiValidateUserEndpoint() {
        return cmsPortoApiValidateUserEndpoint;
    }

    public static void setCmsPortoApiValidateUserEndpoint(String cmsPortoApiValidateUserEndpoint) {
        ConfigEnv.cmsPortoApiValidateUserEndpoint = cmsPortoApiValidateUserEndpoint;
    }

    public static String getCmsPortoApiRegisterUserEndpoint() {
        return cmsPortoApiRegisterUserEndpoint;
    }

    public static void setCmsPortoApiRegisterUserEndpoint(String cmsPortoApiRegisterUserEndpoint) {
        ConfigEnv.cmsPortoApiRegisterUserEndpoint = cmsPortoApiRegisterUserEndpoint;
    }

    public static String getAllowedOrigin() {
        return allowedOrigin;
    }

    public static void setAllowedOrigin(String allowedOrigin) {
        ConfigEnv.allowedOrigin = allowedOrigin;
    }
}