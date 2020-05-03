package com.autenti.odor.service.document;

import com.autenti.odor.model.document.DocumentData;

public interface DocumentDataServiceFacade {

    DocumentData load();

    DocumentDetailsService getDocumentDetailsService();

    RecipientDetailsService getRecipientDetailsService();
}
