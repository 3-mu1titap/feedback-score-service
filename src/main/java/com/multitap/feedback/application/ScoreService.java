package com.multitap.feedback.application;

import com.multitap.feedback.dto.FeedbackScoreRequestDto;

public interface ScoreService {
    void addScore(FeedbackScoreRequestDto feedbackScoreRequestDto);
}
