package com.multitap.feedback.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedbackScoreRequestVo {

    private String mentoringSessionUuid;
    private Byte element1;
    private Byte element2;
    private Byte element3;
    private Byte element4;
    private Byte element5;

}
