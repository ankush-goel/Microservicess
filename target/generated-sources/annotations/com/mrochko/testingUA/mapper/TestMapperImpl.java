package com.mrochko.testingUA.mapper;

import com.mrochko.testingUA.dto.AnswerDTO;
import com.mrochko.testingUA.dto.QuestionDTO;
import com.mrochko.testingUA.dto.TestDTO;
import com.mrochko.testingUA.model.Answer;
import com.mrochko.testingUA.model.Question;
import com.mrochko.testingUA.model.Subject;
import com.mrochko.testingUA.model.Test;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-08T17:53:58+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
public class TestMapperImpl implements TestMapper {

    @Override
    public TestDTO mapToTestDTO(Test test) {
        if ( test == null ) {
            return null;
        }

        TestDTO.TestDTOBuilder testDTO = TestDTO.builder();

        testDTO.subjectId( testSubjectId( test ) );
        testDTO.description( test.getDescription() );
        testDTO.id( test.getId() );
        testDTO.minutes( test.getMinutes() );
        testDTO.questionList( questionListToQuestionDTOList( test.getQuestionList() ) );
        testDTO.testDifficulty( test.getTestDifficulty() );
        testDTO.title( test.getTitle() );

        return testDTO.build();
    }

    @Override
    public Test mapToTest(TestDTO testDTO) {
        if ( testDTO == null ) {
            return null;
        }

        Test test = new Test();

        test.setSubject( testDTOToSubject( testDTO ) );
        test.setDescription( testDTO.getDescription() );
        test.setMinutes( testDTO.getMinutes() );
        test.setQuestionList( questionDTOListToQuestionList( testDTO.getQuestionList() ) );
        test.setTestDifficulty( testDTO.getTestDifficulty() );
        test.setTitle( testDTO.getTitle() );

        return test;
    }

    @Override
    public List<TestDTO> mapToListOfTestsDTO(List<Test> testList) {
        if ( testList == null ) {
            return null;
        }

        List<TestDTO> list = new ArrayList<TestDTO>( testList.size() );
        for ( Test test : testList ) {
            list.add( mapToTestDTO( test ) );
        }

        return list;
    }

    @Override
    public List<Test> mapToListOfTests(List<TestDTO> testDtoList) {
        if ( testDtoList == null ) {
            return null;
        }

        List<Test> list = new ArrayList<Test>( testDtoList.size() );
        for ( TestDTO testDTO : testDtoList ) {
            list.add( mapToTest( testDTO ) );
        }

        return list;
    }

    private Long testSubjectId(Test test) {
        if ( test == null ) {
            return null;
        }
        Subject subject = test.getSubject();
        if ( subject == null ) {
            return null;
        }
        Long id = subject.getId();
        if ( id == null ) {
            return null;
        }
        return id;
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

    protected QuestionDTO questionToQuestionDTO(Question question) {
        if ( question == null ) {
            return null;
        }

        QuestionDTO.QuestionDTOBuilder questionDTO = QuestionDTO.builder();

        questionDTO.answerList( answerListToAnswerDTOList( question.getAnswerList() ) );
        questionDTO.id( question.getId() );
        questionDTO.questionText( question.getQuestionText() );

        return questionDTO.build();
    }

    protected List<QuestionDTO> questionListToQuestionDTOList(List<Question> list) {
        if ( list == null ) {
            return null;
        }

        List<QuestionDTO> list1 = new ArrayList<QuestionDTO>( list.size() );
        for ( Question question : list ) {
            list1.add( questionToQuestionDTO( question ) );
        }

        return list1;
    }

    protected Subject testDTOToSubject(TestDTO testDTO) {
        if ( testDTO == null ) {
            return null;
        }

        Subject subject = new Subject();

        subject.setId( testDTO.getSubjectId() );

        return subject;
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

    protected Question questionDTOToQuestion(QuestionDTO questionDTO) {
        if ( questionDTO == null ) {
            return null;
        }

        Question question = new Question();

        question.setAnswerList( answerDTOListToAnswerList( questionDTO.getAnswerList() ) );
        question.setId( questionDTO.getId() );
        question.setQuestionText( questionDTO.getQuestionText() );

        return question;
    }

    protected List<Question> questionDTOListToQuestionList(List<QuestionDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Question> list1 = new ArrayList<Question>( list.size() );
        for ( QuestionDTO questionDTO : list ) {
            list1.add( questionDTOToQuestion( questionDTO ) );
        }

        return list1;
    }
}
