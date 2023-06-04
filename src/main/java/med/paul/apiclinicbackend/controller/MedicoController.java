package med.paul.apiclinicbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.paul.apiclinicbackend.DTO.ListagemMedicosDTO;
import med.paul.apiclinicbackend.DTO.MedicosDTO;
import med.paul.apiclinicbackend.entities.Medico;
import med.paul.apiclinicbackend.repositories.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@Autowired
	private MedicoRepository medicoRepository;

	@PostMapping
	@Transactional
	public void cadastrarMedico(@RequestBody @Valid MedicosDTO dados) {
		medicoRepository.save(new Medico(dados));
	} 
	
	@GetMapping
	public Page<ListagemMedicosDTO> listarMedico(@PageableDefault(size = 2, sort = {"nome"}) Pageable paginacao){
		return medicoRepository.findAll(paginacao).map(ListagemMedicosDTO::new);
	}
}
