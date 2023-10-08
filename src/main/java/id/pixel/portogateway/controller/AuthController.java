package id.pixel.portogateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
@Slf4j
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> authLogin() {
        log.info("API Login is being hit..");
        return null;
    }

}
