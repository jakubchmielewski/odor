package com.autenti.odor.model.newdocument;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import org.junit.jupiter.api.Test;

import com.autenti.odor.model.document.DocumentData;
import com.autenti.odor.model.document.DocumentDetails;
import com.autenti.odor.model.document.RecipientDetails;

class NewDocumentDataTest {

    @Test
    void givenNullData_whenCreating_shouldThrowException() {
        //when
        Throwable exception = catchThrowable(() -> DocumentData
                .of(null, null));

        //then
        assertThat(exception).isInstanceOf(NullPointerException.class);
    }

    @Test
    void givenValidData_whenCreating_shouldCreateInstance() {
        //given
        final DocumentDetails documentDetails = new DocumentDetails("title");
        final RecipientDetails recipientDetails = new RecipientDetails("test@fake.autenti.com");

        //when
        DocumentData newDocumentData = DocumentData.of(documentDetails, recipientDetails);

        //Then
        assertThat(newDocumentData).isNotNull();
    }
}