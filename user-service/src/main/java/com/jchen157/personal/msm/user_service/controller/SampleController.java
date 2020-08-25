//package com.jchen157.personal.msm.user_service.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//
//@RestController
//@RequestMapping("/user")
//public class SampleController {
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Value("${utility-service.url}")
//    private String utilServiceUrl;
//
//    @GetMapping("/sample")
//    public String getExample() {
//        return "this is user service";
//    }
//
//    @GetMapping("/util")
//    public String callUtilService() {
//        String url = utilServiceUrl + "/utility";
//        logger.info("url {}", url);
//        RestTemplate template = new RestTemplate();
//        ResponseEntity<String> responseEntity = template.getForEntity(url, String.class);
//        return responseEntity.getBody();
//    }
//}
