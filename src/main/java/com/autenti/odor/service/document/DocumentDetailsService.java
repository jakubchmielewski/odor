package com.autenti.odor.service.document;

import com.autenti.odor.model.document.DocumentDetails;

public interface DocumentDetailsService {

    DocumentDetails load();

    void save(DocumentDetails documentDetails);
}
