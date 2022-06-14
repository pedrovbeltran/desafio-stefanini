package com.stefanini.hackathon.repository;

import com.stefanini.hackathon.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


    List<Aluno> findAll();
}
