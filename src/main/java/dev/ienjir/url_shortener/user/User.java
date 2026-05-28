package dev.ienjir.url_shortener.user;

import java.time.LocalDateTime;

public record User(
        Integer id,
        String email,
        String password_hash,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated
) {
}