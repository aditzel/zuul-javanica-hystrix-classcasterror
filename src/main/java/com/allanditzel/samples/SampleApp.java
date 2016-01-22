package com.allanditzel.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by allan on 1/21/2016.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableCircuitBreaker
public class SampleApp {

    public static void main(String[] args) {
        SpringApplication.run(SampleApp.class, args);
    }

    @Bean
    public SampleZuulFilterWithJavanicaHystrix sampleZuulFilterWithJavanicaHystrix() {
        return new SampleZuulFilterWithJavanicaHystrix();
    }
}
