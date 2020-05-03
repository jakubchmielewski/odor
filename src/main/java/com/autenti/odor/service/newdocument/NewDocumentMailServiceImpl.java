package com.autenti.odor.service.newdocument;

import com.autenti.odor.model.document.DocumentData;
import com.autenti.odor.model.mail.MailContent;
import com.autenti.odor.service.mail.MailQueueService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class NewDocumentMailServiceImpl implements NewDocumentMailService {
    private final NewDocumentMailContentRenderer renderer;
    private final MailQueueService mailQueueService;

    @Override
    public void send(
            DocumentData documentData,
            String documentLink) {
        MailContent mailContent = renderer.render(documentData, documentLink);
        mailQueueService.save(mailContent);
    }
}
