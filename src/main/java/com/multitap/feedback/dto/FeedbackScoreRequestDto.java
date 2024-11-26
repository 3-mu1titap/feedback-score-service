package com.multitap.feedback.dto;

import com.multitap.feedback.entity.FeedbackScore;
import com.multitap.feedback.vo.FeedbackScoreRequestVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedbackScoreRequestDto {
    private String uuid;
    private String mentoringSessionUuid;
    private Byte element1;
    private Byte element2;
    private Byte element3;
    private Byte element4;
    private Byte element5;

    @Builder
    public FeedbackScoreRequestDto(String uuid, String mentoringSessionUuid, Byte element1, Byte element2, Byte element3, Byte element4, Byte element5) {
        this.uuid = uuid;
        this.mentoringSessionUuid = mentoringSessionUuid;
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
        this.element5 = element5;
    }

    public static FeedbackScoreRequestDto from(FeedbackScoreRequestVo feedbackScoreRequestVo, String uuid) {
        return FeedbackScoreRequestDto.builder()
                .uuid(uuid)
                .mentoringSessionUuid(feedbackScoreRequestVo.getMentoringSessionUuid())
                .element1(feedbackScoreRequestVo.getElement1())
                .element2(feedbackScoreRequestVo.getElement2())
                .element3(feedbackScoreRequestVo.getElement3())
                .element4(feedbackScoreRequestVo.getElement4())
                .element5(feedbackScoreRequestVo.getElement5())
                .build();
    }

    public FeedbackScore toEntity(FeedbackScoreRequestDto feedbackScoreRequestDto) {
        return FeedbackScore.builder()
                .uuid(feedbackScoreRequestDto.getUuid())
                .mentoringSessionUuid(feedbackScoreRequestDto.getMentoringSessionUuid())
                .element1(feedbackScoreRequestDto.getElement1())
                .element2(feedbackScoreRequestDto.getElement2())
                .element3(feedbackScoreRequestDto.getElement3())
                .element4(feedbackScoreRequestDto.getElement4())
                .element5(feedbackScoreRequestDto.getElement5())
                .build();
    }


}
