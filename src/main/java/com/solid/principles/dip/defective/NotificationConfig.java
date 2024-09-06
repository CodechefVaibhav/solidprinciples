package com.solid.principles.dip.defective;

import com.solid.principles.dip.defective.service.EmailNotificationService;
import com.solid.principles.dip.defective.components.NotificationSender;
import com.solid.principles.dip.defective.service.SMSNotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class NotificationConfig {

    @Bean(name = "email")
    public NotificationSender emailNotificationService() {
        return new EmailNotificationService();
    }

    @Bean(name = "sms")
    public NotificationSender smsNotificationService() {
        return new SMSNotificationService();
    }

    @Bean
    public Map<String, NotificationSender> notificationMethods(
            @Qualifier("email") NotificationSender emailNotificationService,
            @Qualifier("sms") NotificationSender smsNotificationService) {

        Map<String, NotificationSender> notificationMethods = new HashMap<>();
        return notificationMethods;
    }
}
