package com.allanditzel.samples;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by allan on 1/21/2016.
 */
public class SampleZuulFilterWithJavanicaHystrix extends ZuulFilter {

    private static final Logger log = LoggerFactory.getLogger(SampleZuulFilterWithJavanicaHystrix.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @HystrixCommand(fallbackMethod = "fallbackMethod")
    @Override
    public Object run() {

        log.info("Running pre filter.");

        return null;
    }


    public Object fallbackMethod() {

        log.info("Fallback method invoked.");

        return null;
    }
}
