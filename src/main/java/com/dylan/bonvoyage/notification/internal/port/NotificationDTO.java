package com.dylan.bonvoyage.notification.internal.port;

import java.util.Date;

public class NotificationDTO {
    private Date date;
    private String format;
    private String hotelName;

    public NotificationDTO(Date date, String format, String hotelName) {
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
