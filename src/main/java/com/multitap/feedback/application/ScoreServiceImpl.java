package com.multitap.feedback.application;

import com.multitap.feedback.dto.FeedbackScoreRequestDto;
import com.multitap.feedback.infrastructure.FeedbackScoreRepository;
import com.multitap.feedback.kafka.producer.FeedbackScoreDto;
import com.multitap.feedback.kafka.producer.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreServiceImpl implements ScoreService {

    private final FeedbackScoreRepository feedbackScoreRepository;
    private final KafkaProducerService kafkaProducerService;

    @Override
    //todo: 멘토 이름도 가져오도록 훈석님한테 물어보기
    public void addScore(FeedbackScoreRequestDto feedbackScoreRequestDto) {
        kafkaProducerService.sendFeedbackScore(FeedbackScoreDto.from(feedbackScoreRepository.save(feedbackScoreRequestDto.toEntity(feedbackScoreRequestDto))));
    }
}
