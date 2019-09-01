package com.kostas.requestlogger.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
public class RequestLoggerController {

    private static final String[] HEADERS_TO_TRY = {
            "X-Forwarded-For",
            "Proxy-Client-IP",
            "WL-Proxy-Client-IP",
            "HTTP_X_FORWARDED_FOR",
            "HTTP_X_FORWARDED",
            "HTTP_X_CLUSTER_CLIENT_IP",
            "HTTP_CLIENT_IP",
            "HTTP_FORWARDED_FOR",
            "HTTP_FORWARDED",
            "HTTP_VIA",
            "REMOTE_ADDR"
    };

    private Logger logger = LoggerFactory.getLogger(RequestLoggerController.class);

    @GetMapping("/")
    public ResponseEntity<String> track(HttpServletRequest request) {
        StringBuffer sb = new StringBuffer("\n-----------------REQUEST DETECTED--------------------------\n");
        Enumeration<String> headers = request.getHeaderNames();
        while (headers.hasMoreElements()) {
            String header = headers.nextElement();
            sb.append(String.format("%s : %s \n", header, request.getHeader(header)));
        }
        sb.append(String.format("remote address: : %s", request.getRemoteAddr()));
        sb.append("\n ---------END OF REQUEST------------------------------------ \n");
        logger.info(sb.toString());
        return new ResponseEntity<String>("", HttpStatus.OK);
    }
}
