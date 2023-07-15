package com.dylan.bonvoyage.notification.internal.service;

import com.dylan.bonvoyage.notification.internal.model.Notification;
import com.dylan.bonvoyage.notification.internal.model.NotificationType;
import com.dylan.bonvoyage.notification.internal.port.NotificationDTO;
import com.dylan.bonvoyage.notification.internal.port.NotificationServiceAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements NotificationServiceAPI {

    private static final Logger LOG = LoggerFactory.getLogger(NotificationService.class);

    public void createNotification(NotificationDTO notificationDTO) {
        Notification notification = toEntity(notificationDTO);
        LOG.info("Received notification by module dependency for hotel {} in date {} by {}.",
                notification.getHotelName(),
                notification.getDate(),
                notification.getFormat());
    }

    private Notification toEntity(NotificationDTO notificationDTO) {
        Notification notification = new Notification();
        notification.setDate(notificationDTO.getDate());
        notification.setHotelName(notification.getHotelName());
        if (notificationDTO.getFormat().equals("SMS")) {
            notification.setFormat(NotificationType.SMS);
        }
        if (notificationDTO.getFormat().equals("EMAIL")) {
            notification.setFormat(NotificationType.EMAIL);
        }
        return notification;
    }
}