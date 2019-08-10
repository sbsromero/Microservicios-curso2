package com.microservice.accountservice.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.microservice.accountservice.stream.NotificationStreams;

@EnableBinding(NotificationStreams.class)
public class StreamsConfig {

}
