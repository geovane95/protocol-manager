package br.gov.sp.ferrazdevasconcelos.protocolmanager.repository;

import java.util.List;

import br.gov.sp.ferrazdevasconcelos.dto.UserRequestDTO;
import br.gov.sp.ferrazdevasconcelos.protocolmanager.model.User;

public class UserRepository extends JpaRepository<User,Integer> {

    User findById(Integer id);

    User save(User user);

    List<User> findAll();

    List<User> find(User user);

    boolean deleteById(int Id);
    
}
