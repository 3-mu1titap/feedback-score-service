package com.multitap.feedback.kafka.producer;

import com.multitap.feedback.entity.FeedbackScore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@NoArgsConstructor
public class FeedbackScoreDto {

    private String uuid;
    private String mentoringSessionUuid;
    //todo: 멘토 이름
    private String mentoringDate;
    private String categoryCode;
    private Integer element1;
    private Integer element2;
    private Integer element3;
    private Integer element4;
    private Integer element5;
    private String content;

    @Builder
    public FeedbackScoreDto(String uuid, String mentoringSessionUuid, String mentoringDate, String categoryCode, Integer element1, Integer element2, Integer element3, Integer element4, Integer element5, String content) {
        this.uuid = uuid;
        this.mentoringSessionUuid = mentoringSessionUuid;
        this.mentoringDate = mentoringDate;
        this.categoryCode = categoryCode;
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
        this.element5 = element5;
        this.content = content;
    }

    public static FeedbackScoreDto from(FeedbackScore feedbackScore) {
        return FeedbackScoreDto.builder()
                .uuid(feedbackScore.getUuid())
                .mentoringSessionUuid(feedbackScore.getMentoringSessionUuid())
                .mentoringDate(formatDate(feedbackScore.getCreatedDate()))
                .categoryCode(feedbackScore.getCategoryCode())
                .element1(feedbackScore.getElement1())
                .element2(feedbackScore.getElement2())
                .element3(feedbackScore.getElement3())
                .element4(feedbackScore.getElement4())
                .element5(feedbackScore.getElement5())
                .content(feedbackScore.getContent())
                .build();
    }

    private static String formatDate(LocalDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return date.format(formatter);
    }
}

