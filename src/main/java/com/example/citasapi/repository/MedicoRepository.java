package com.example.citasapi.repository;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.citasapi.models.MedicoModelo;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface MedicoRepository extends JpaRepository <MedicoModelo, Long>{
    Optional<MedicoModelo> findByCedulaId (Long cedula_id_medico);
}
