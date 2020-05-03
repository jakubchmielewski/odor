package com.autenti.odor.model.document;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DocumentData {
    @NonNull
    @Getter
    private final DocumentDetails documentDetails;
    @NonNull
    private final RecipientDetails recipientDetails;

    public static DocumentData of(
            DocumentDetails documentDetails,
            RecipientDetails recipientDetails) {
        return new DocumentData(documentDetails, recipientDetails);
    }

    public String getTitle() {
        return documentDetails.getTitle();
    }

    public String getRecipientAddress() {
        return recipientDetails.getAddress();
    }
}
