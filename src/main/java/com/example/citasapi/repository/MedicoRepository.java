package com.example.citasapi.repository;
import java.util.Optional;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.citasapi.models.MedicoModelo;


@Repository
public class MedicoRepository extends CrudRepository <MedicoModelo, Long>{
    Optional<MedicoModelo> findByCedulaId(Long cedula_id_medico);
}
