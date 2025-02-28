package com.mrochko.testingUA.mapper;

import com.mrochko.testingUA.dto.HistoryOfTestDTO;
import com.mrochko.testingUA.model.HistoryOfTest;
import com.mrochko.testingUA.model.Test;
import com.mrochko.testingUA.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-08T17:53:57+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
public class HistoryOfTestMapperImpl implements HistoryOfTestMapper {

    @Override
    public HistoryOfTestDTO mapToHistoryOfTestDTO(HistoryOfTest historyOfTest) {
        if ( historyOfTest == null ) {
            return null;
        }

        HistoryOfTestDTO.HistoryOfTestDTOBuilder historyOfTestDTO = HistoryOfTestDTO.builder();

        historyOfTestDTO.studentName( historyOfTestUserName( historyOfTest ) );
        historyOfTestDTO.testTitle( historyOfTestTestTitle( historyOfTest ) );
        historyOfTestDTO.completionTime( historyOfTest.getCompletionTime() );
        historyOfTestDTO.id( historyOfTest.getId() );
        historyOfTestDTO.resultInPercent( historyOfTest.getResultInPercent() );
        historyOfTestDTO.testProgressStatus( historyOfTest.getTestProgressStatus() );

        return historyOfTestDTO.build();
    }

    @Override
    public List<HistoryOfTestDTO> mapToListDTO(List<HistoryOfTest> historyOfTestList) {
        if ( historyOfTestList == null ) {
            return null;
        }

        List<HistoryOfTestDTO> list = new ArrayList<HistoryOfTestDTO>( historyOfTestList.size() );
        for ( HistoryOfTest historyOfTest : historyOfTestList ) {
            list.add( mapToHistoryOfTestDTO( historyOfTest ) );
        }

        return list;
    }

    private String historyOfTestUserName(HistoryOfTest historyOfTest) {
        if ( historyOfTest == null ) {
            return null;
        }
        User user = historyOfTest.getUser();
        if ( user == null ) {
            return null;
        }
        String name = user.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String historyOfTestTestTitle(HistoryOfTest historyOfTest) {
        if ( historyOfTest == null ) {
            return null;
        }
        Test test = historyOfTest.getTest();
        if ( test == null ) {
            return null;
        }
        String title = test.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }
}
