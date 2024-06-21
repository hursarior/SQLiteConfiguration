package com.Conection.SpringSQLliteConexio.repository;

import com.Conection.SpringSQLliteConexio.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
