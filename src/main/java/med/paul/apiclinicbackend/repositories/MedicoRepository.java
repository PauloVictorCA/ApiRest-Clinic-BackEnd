package med.paul.apiclinicbackend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import med.paul.apiclinicbackend.DTO.ListagemMedicosDTO;
import med.paul.apiclinicbackend.entities.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

	Page<Medico> findAllByAtivoTrue(Pageable paginacao);

}
