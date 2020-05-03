package com.autenti.odor.service.mail;

import com.autenti.odor.model.mail.MailContent;

public interface MailQueueService {
    void save(MailContent mailContent);
}
