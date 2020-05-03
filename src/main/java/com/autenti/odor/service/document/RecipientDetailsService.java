package com.autenti.odor.service.document;

import com.autenti.odor.model.document.RecipientDetails;

public interface RecipientDetailsService {

    RecipientDetails load();

    void save(RecipientDetails recipientDetails);
}
