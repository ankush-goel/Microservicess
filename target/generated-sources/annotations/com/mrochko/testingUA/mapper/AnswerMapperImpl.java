package com.mrochko.testingUA.mapper;

import com.mrochko.testingUA.dto.AnswerDTO;
import com.mrochko.testingUA.model.Answer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-08T17:53:58+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
public class AnswerMapperImpl implements AnswerMapper {

    @Override
    public AnswerDTO mapToAnswerDTO(Answer answer) {
        if ( answer == null ) {
            return null;
        }

        AnswerDTO.AnswerDTOBuilder answerDTO = AnswerDTO.builder();

        answerDTO.answerStatus( answer.getAnswerStatus() );
        answerDTO.answerText( answer.getAnswerText() );
        answerDTO.id( answer.getId() );

        return answerDTO.build();
    }

    @Override
    public Answer mapToAnswer(AnswerDTO answerDTO) {
        if ( answerDTO == null ) {
            return null;
        }

        Answer answer = new Answer();

        answer.setAnswerStatus( answerDTO.getAnswerStatus() );
        answer.setAnswerText( answerDTO.getAnswerText() );

        return answer;
    }

    @Override
    public List<Answer> mapToListOfAnswers(List<AnswerDTO> answerDTOList) {
        if ( answerDTOList == null ) {
            return null;
        }

        List<Answer> list = new ArrayList<Answer>( answerDTOList.size() );
        for ( AnswerDTO answerDTO : answerDTOList ) {
            list.add( mapToAnswer( answerDTO ) );
        }

        return list;
    }

    @Override
    public List<AnswerDTO> mapToListOfAnswersDTO(List<Answer> answerList) {
        if ( answerList == null ) {
            return null;
        }

        List<AnswerDTO> list = new ArrayList<AnswerDTO>( answerList.size() );
        for ( Answer answer : answerList ) {
            list.add( mapToAnswerDTO( answer ) );
        }

        return list;
    }
}
