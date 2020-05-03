package com.autenti.odor.port;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class DocumentLinkCreatedCommand {
    private final String documentLink;
    private final String reason;
}
