package com.multitap.feedback.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedbackScoreRequestDto {
    private String uuid;
    private Byte element1;
    private Byte element2;
    private Byte element3;
    private Byte element4;
    private Byte element5;

    @Builder
    public FeedbackScoreRequestDto from(Fe)
}
