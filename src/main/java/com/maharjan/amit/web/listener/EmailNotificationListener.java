package com.maharjan.amit.web.listener;

import com.maharjan.amit.web.entity.Subscriber;
import com.maharjan.amit.web.util.Mailer;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class EmailNotificationListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        HttpServletRequest request = (HttpServletRequest) srae.getServletRequest();
        if (request.getAttribute("SubscribeEmail") != null && (Boolean) request.getAttribute("SubscribeEmail")) {
            Subscriber subscriber = (Subscriber) request.getAttribute("Subscriber");
            System.out.println("Send Email Triggered");
            System.out.println(subscriber);

            Mailer mailer = new Mailer();
            mailer.setFrom("info@amit.maharjan");
            mailer.setTo("maharjanamit8@gmail.com");
            mailer.setHost("smtp.vianet.com.np");
            mailer.setPort("25");
            mailer.setSubject("Test");
            mailer.setBody("Testing");
            mailer.send();
        }
    }
}
