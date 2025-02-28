package com.mrochko.testingUA.mapper;

import com.mrochko.testingUA.dto.UserDTO;
import com.mrochko.testingUA.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-08T17:53:58+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO mapToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.access( user.getAccess() );
        userDTO.email( user.getEmail() );
        userDTO.id( user.getId() );
        userDTO.login( user.getLogin() );
        userDTO.name( user.getName() );
        userDTO.password( user.getPassword() );
        userDTO.surname( user.getSurname() );
        userDTO.tel( user.getTel() );
        userDTO.userRole( user.getUserRole() );

        return userDTO.build();
    }

    @Override
    public User mapToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setAccess( userDTO.getAccess() );
        user.setEmail( userDTO.getEmail() );
        user.setLogin( userDTO.getLogin() );
        user.setName( userDTO.getName() );
        user.setPassword( userDTO.getPassword() );
        user.setSurname( userDTO.getSurname() );
        user.setTel( userDTO.getTel() );
        user.setUserRole( userDTO.getUserRole() );

        return user;
    }

    @Override
    public List<UserDTO> mapToListOfUsersDTO(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( userList.size() );
        for ( User user : userList ) {
            list.add( mapToUserDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> mapToListOfUsers(List<UserDTO> userDtoList) {
        if ( userDtoList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userDtoList.size() );
        for ( UserDTO userDTO : userDtoList ) {
            list.add( mapToUser( userDTO ) );
        }

        return list;
    }
}
