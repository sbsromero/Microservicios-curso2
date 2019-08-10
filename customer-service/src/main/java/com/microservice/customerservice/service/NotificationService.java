package com.microservice.customerservice.service;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.microservice.customerservice.model.Notification;
import com.microservice.customerservice.stream.NotificationStreams;

@Service
public class NotificationService {

	private final NotificationStreams notificationStreams;

	public NotificationService(NotificationStreams notificationStreams) {
		super();
		this.notificationStreams = notificationStreams;
	}

	public void sendNotification(final Notification notification) {
		MessageChannel messageChannel = notificationStreams.notifyTo();
		messageChannel.send(MessageBuilder.withPayload(notification)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
	}
}
