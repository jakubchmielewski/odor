package com.autenti.odor.service.newdocument;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.autenti.odor.model.document.DocumentData;
import com.autenti.odor.model.document.DocumentDetails;
import com.autenti.odor.model.document.RecipientDetails;
import com.autenti.odor.model.mail.MailContent;
import com.autenti.odor.service.mail.MailQueueService;

@ExtendWith(MockitoExtension.class)
class NewDocumentMailServiceTest {

    private NewDocumentMailService newDocumentMailService;
    @Mock
    private NewDocumentMailContentRenderer renderer;
    @Mock
    private MailQueueService mailQueueService;

    @BeforeEach
    void setUp() {
        newDocumentMailService = new NewDocumentMailServiceImpl(renderer, mailQueueService);
    }

    @Test
    void givenData_whenSending_shouldAddToQueue() {
        //given
        final DocumentData newDocumentData = DocumentData.of(
                new DocumentDetails("title"),
                new RecipientDetails("test@fake.autenti.com"));
        final String documentLink = "127.0.0.1";
        final MailContent mailContent = MailContent.builder().build();
        when(renderer.render(newDocumentData, documentLink)).thenReturn(mailContent);

        //when
        newDocumentMailService.send(newDocumentData, documentLink);

        //then
        verify(mailQueueService).save(mailContent);
    }
}