package com.multitap.feedback.presentation;

import com.multitap.feedback.application.ScoreService;
import com.multitap.feedback.common.response.BaseResponse;
import com.multitap.feedback.dto.FeedbackScoreRequestDto;
import com.multitap.feedback.vo.FeedbackScoreRequestVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Tag(name = "피드백 점수 API", description = "피드백 관련 API endpoints")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/feedback-score")
public class FeedbackScoreController {

    private final ScoreService scoreService;

    //todo: 리포트 : 피드백 리드 db에 들어갈 목록 : 날짜, 항목별 점수, 멘토 이름, 멘토의 코멘트 내용 (2)
    //todo: 피드백 값이 새로 들어올때 마다 요소별 차이 점수 % 를 계산해서 바로 read DB에 업데이트 되는 형식으로 만들기 (2-1)
    //todo: 다 만든 다음에 볼팡이 점수 ai 돌리는거 구현하기 (3-1)
    //todo: get 으로 회원의 멘토링 피드백 점수 리스트 보여주기 구현 (1-1)

    @Operation(summary = "피드백 점수 등록", description = "각 피드백 요소에 점수를 등록합니다.")
    @PostMapping()
    public BaseResponse<Void> addFeedbackScore(@RequestBody FeedbackScoreRequestVo feedbackScoreRequestVo, @RequestHeader("userUuid") String uuid) {
        scoreService.addScore(FeedbackScoreRequestDto.from(feedbackScoreRequestVo, uuid));
        return new BaseResponse<>();
    }

}
