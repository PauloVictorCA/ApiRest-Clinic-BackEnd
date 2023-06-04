package med.paul.apiclinicbackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.paul.apiclinicbackend.DTO.MedicosDTO;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	@PostMapping
	public void cadastrarMedico(@RequestBody MedicosDTO dados) {
		System.out.println(dados);
	}
	
}
