package com.mrochko.testingUA.mapper;

import com.mrochko.testingUA.dto.AnswerDTO;
import com.mrochko.testingUA.dto.QuestionDTO;
import com.mrochko.testingUA.model.Answer;
import com.mrochko.testingUA.model.Question;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-08T17:53:58+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public QuestionDTO mapToQuestionDTO(Question question) {
        if ( question == null ) {
            return null;
        }

        QuestionDTO.QuestionDTOBuilder questionDTO = QuestionDTO.builder();

        questionDTO.answerList( answerListToAnswerDTOList( question.getAnswerList() ) );
        questionDTO.id( question.getId() );
        questionDTO.questionText( question.getQuestionText() );

        return questionDTO.build();
    }

    @Override
    public Question mapToQuestion(QuestionDTO questionDTO) {
        if ( questionDTO == null ) {
            return null;
        }

        Question question = new Question();

        question.setAnswerList( answerDTOListToAnswerList( questionDTO.getAnswerList() ) );
        question.setQuestionText( questionDTO.getQuestionText() );

        return question;
    }

    @Override
    public List<Question> mapToListOfQuestions(List<QuestionDTO> questionDTOList) {
        if ( questionDTOList == null ) {
            return null;
        }

        List<Question> list = new ArrayList<Question>( questionDTOList.size() );
        for ( QuestionDTO questionDTO : questionDTOList ) {
            list.add( mapToQuestion( questionDTO ) );
        }

        return list;
    }

    @Override
    public List<QuestionDTO> mapToListOfQuestionsDTO(List<Question> questionList) {
        if ( questionList == null ) {
            return null;
        }

        List<QuestionDTO> list = new ArrayList<QuestionDTO>( questionList.size() );
        for ( Question question : questionList ) {
            list.add( mapToQuestionDTO( question ) );
        }

        return list;
    }

    protected AnswerDTO answerToAnswerDTO(Answer answer) {
        if ( answer == null ) {
            return null;
        }

        AnswerDTO.AnswerDTOBuilder answerDTO = AnswerDTO.builder();

        answerDTO.answerStatus( answer.getAnswerStatus() );
        answerDTO.answerText( answer.getAnswerText() );
        answerDTO.id( answer.getId() );

        return answerDTO.build();
    }

    protected List<AnswerDTO> answerListToAnswerDTOList(List<Answer> list) {
        if ( list == null ) {
            return null;
        }

        List<AnswerDTO> list1 = new ArrayList<AnswerDTO>( list.size() );
        for ( Answer answer : list ) {
            list1.add( answerToAnswerDTO( answer ) );
        }

        return list1;
    }

    protected Answer answerDTOToAnswer(AnswerDTO answerDTO) {
        if ( answerDTO == null ) {
            return null;
        }

        Answer answer = new Answer();

        answer.setAnswerStatus( answerDTO.getAnswerStatus() );
        answer.setAnswerText( answerDTO.getAnswerText() );
        answer.setId( answerDTO.getId() );

        return answer;
    }

    protected List<Answer> answerDTOListToAnswerList(List<AnswerDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Answer> list1 = new ArrayList<Answer>( list.size() );
        for ( AnswerDTO answerDTO : list ) {
            list1.add( answerDTOToAnswer( answerDTO ) );
        }

        return list1;
    }
}
