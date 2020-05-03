package com.autenti.odor.service.newdocument;

import com.autenti.odor.model.document.DocumentData;

public interface NewDocumentMailService {
    void send(
            DocumentData DocumentData,
            String documentLink);
}
