package com.jonathan.tarefaapi.repository;

import com.jonathan.tarefaapi.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // JpaRepository já traz CRUD completo
}
