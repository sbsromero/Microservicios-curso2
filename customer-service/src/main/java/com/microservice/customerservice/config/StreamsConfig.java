package com.microservice.customerservice.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.microservice.customerservice.stream.NotificationStreams;

@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
