package com.dylan.bonvoyage.notification.internal.model;

import java.util.Date;

public class Notification {
    private Date date;
    private NotificationType format;
    private String hotelName;

    public Notification() {
    }

    public Notification(Date date, NotificationType format, String hotelName) {
        this.date = date;
        this.format = format;
        this.hotelName = hotelName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public NotificationType getFormat() {
        return format;
    }

    public void setFormat(NotificationType format) {
        this.format = format;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
