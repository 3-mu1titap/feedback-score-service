package com.multitap.feedback.application;

import com.multitap.feedback.dto.FeedbackScoreRequestDto;
import com.multitap.feedback.infrastructure.FeedbackScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreServiceImpl implements ScoreService{

    private final FeedbackScoreRepository feedbackScoreRepository;

    @Override
    public void addScore(FeedbackScoreRequestDto feedbackScoreRequestDto) {
        feedbackScoreRepository.save(feedbackScoreRequestDto.toEntity(feedbackScoreRequestDto));
    }
}
