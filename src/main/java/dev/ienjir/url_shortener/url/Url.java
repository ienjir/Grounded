package dev.ienjir.url_shortener.url;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Url(
        Integer id,
        String shortCode,
        Text originalURL,
        Boolean isActive,
        LocalDateTime expires,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated
) {
}