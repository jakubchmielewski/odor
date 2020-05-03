package com.autenti.odor.model.mail;

import com.autenti.odor.model.document.DocumentDetails;

import lombok.Builder;

@Builder
public class MailContent {
    private final String title;
    private final String recipientAddress;
    private final Body body;
    private final Footer footer;

    @Builder
    public static class Body {
        private final DocumentDetails documentDetails;
        private final String documentLink;
    }

    @Builder
    public static class Footer {
        private final DocumentDetails documentDetails;
    }
}
