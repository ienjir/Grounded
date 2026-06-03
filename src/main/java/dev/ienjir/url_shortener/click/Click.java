package dev.ienjir.url_shortener.click;

import java.time.LocalDateTime;

public record Click(
        Integer id,
        Integer url_id,
        LocalDateTime clicked_at,
        String ip_address
) {
}