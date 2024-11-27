package com.multitap.feedback.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedbackScoreRequestVo {

    private String mentoringSessionUuid;
    @Schema(description = "멘토링 카테고리", example = "자기소개서", nullable = true)
    private String categoryCode;
    @Schema(description = "구성 및 논리적 흐름", example = "1", nullable = true)
    private Integer element1;
    @Schema(description = "자기소개 및 강점 강조", example = "2", nullable = true)
    private Integer element2;
    @Schema(description = "지원 동기 및 직무 적합성", example = "3", nullable = true)
    private Integer element3;
    @Schema(description = "글의 표현력 및 문법", example = "4", nullable = true)
    private Integer element4;
    @Schema(description = "성취 및 경험 사례", example = "5", nullable = true)
    private Integer element5;
    @Schema(description = "멘토의 코멘트", example = "점수가 형편 없네요 멘토링 10번 더 받으셈", nullable = true)
    private String content;

}
