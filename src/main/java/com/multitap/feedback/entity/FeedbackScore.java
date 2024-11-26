package com.multitap.feedback.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FeedbackScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    private String mentoringSessionUuid;
    private Byte element1;
    private Byte element2;
    private Byte element3;
    private Byte element4;
    private Byte element5;

    @Builder
    public FeedbackScore(Long id, String uuid, String mentoringSessionUuid, Byte element1, Byte element2, Byte element3, Byte element4, Byte element5) {
        this.id = id;
        this.uuid = uuid;
        this.mentoringSessionUuid = mentoringSessionUuid;
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
        this.element5 = element5;
    }
}
