package org.coder229.authserver.model;

import java.time.Instant;

public record LoginResponse(Long id,
                            String accessToken,
                            Instant expires) {
}
