package com.paciente.historial.Domain.Repository;

import com.paciente.historial.Domain.Model.Entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepository extends JpaRepository<PacienteEntity, Integer> {

}
