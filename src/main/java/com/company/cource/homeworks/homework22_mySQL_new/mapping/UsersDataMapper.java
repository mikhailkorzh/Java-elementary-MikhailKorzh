package homeworks.homework22_mySQL_new.mapping;


import homeworks.homework22_mySQL_new.model.UserEntity;

import java.util.List;

public interface UsersDataMapper {

    public List<UserEntity> findByUsername(String userName);

    public List<UserEntity>  findByEmail(String userEmail);

    public List<UserEntity> getAllUsers();


}
