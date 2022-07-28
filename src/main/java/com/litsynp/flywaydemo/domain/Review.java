package com.litsynp.flywaydemo.domain;

import com.litsynp.flywaydemo.glboal.domain.BaseTimeEntity;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review extends BaseTimeEntity {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(columnDefinition = "BINARY(16)")
    private UUID userId;

    @Column(columnDefinition = "BINARY(16)")
    private UUID placeId;

    @NotNull
    private String content;

    @Builder
    public Review(UUID id, UUID userId, UUID placeId, String content) {
        this.id = id;
        this.userId = userId;
        this.placeId = placeId;
        this.content = content;
    }
}
