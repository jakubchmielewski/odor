package com.autenti.odor.service.document;

import com.autenti.odor.model.document.DocumentData;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class DocumentDataServiceFacadeImpl implements DocumentDataServiceFacade {
    private final DocumentDetailsService documentDetailsService;
    private final RecipientDetailsService recipientDetailsService;

    @Override
    public DocumentData load() {
        return null;
    }

}
