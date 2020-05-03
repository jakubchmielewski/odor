package com.autenti.odor.port;

import com.autenti.odor.model.document.DocumentData;
import com.autenti.odor.service.document.DocumentDataServiceFacade;
import com.autenti.odor.service.newdocument.NewDocumentMailService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class DocumentPort {
    private final NewDocumentMailService newDocumentMailService;
    private final DocumentDataServiceFacade documentDataServiceFacade;

    void addDocument(DocumentSentCommand command) {
        documentDataServiceFacade.getDocumentDetailsService().save(command.toDocumentDetails());
    }

    void addRecipient(SigningProcessCreatedCommand command) {
        documentDataServiceFacade.getRecipientDetailsService().save(command.toRecipientDetails());
    }

    void register(DocumentLinkCreatedCommand command) {
        if ("NEW_DOCUMENT".equals(command.getReason())) {
            final DocumentData documentData = documentDataServiceFacade.load();
            newDocumentMailService.send(documentData, command.getDocumentLink());
        }
    }
}
