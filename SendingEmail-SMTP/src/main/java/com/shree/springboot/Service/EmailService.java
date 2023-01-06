package com.shree.springboot.Service;

import com.shree.springboot.Entity.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);

}
