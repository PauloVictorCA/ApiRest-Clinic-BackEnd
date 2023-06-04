package med.paul.apiclinicbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import med.paul.apiclinicbackend.entities.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
