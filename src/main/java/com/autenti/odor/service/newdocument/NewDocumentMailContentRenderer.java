package com.autenti.odor.service.newdocument;

import com.autenti.odor.model.document.DocumentData;
import com.autenti.odor.model.mail.MailContent;

interface NewDocumentMailContentRenderer {
    MailContent render(
            DocumentData documentData,
            String documentLink);
}
