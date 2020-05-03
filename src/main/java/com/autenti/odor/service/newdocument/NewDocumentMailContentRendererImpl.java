package com.autenti.odor.service.newdocument;

import com.autenti.odor.model.document.DocumentData;
import com.autenti.odor.model.mail.MailContent;

class NewDocumentMailContentRendererImpl implements NewDocumentMailContentRenderer {
    @Override
    public MailContent render(
            DocumentData newDocumentData,
            String documentLink) {
        return MailContent.builder()
                .title(newDocumentData.getTitle())
                .recipientAddress(newDocumentData.getRecipientAddress())
                .body(MailContent.Body.builder()
                        .documentDetails(newDocumentData.getDocumentDetails())
                        .documentLink(documentLink)
                        .build())
                .footer(MailContent.Footer.builder()
                        .documentDetails(newDocumentData.getDocumentDetails())
                        .build())
                .build();
    }
}
