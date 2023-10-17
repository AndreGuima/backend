package br.com.backend.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<UserModel, Integer>{

}
