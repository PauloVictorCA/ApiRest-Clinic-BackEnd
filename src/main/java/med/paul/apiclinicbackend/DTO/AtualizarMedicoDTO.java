package med.paul.apiclinicbackend.DTO;

import jakarta.validation.constraints.NotNull;

public record AtualizarMedicoDTO (
		
		@NotNull
		Long id,
		
		String nome, 
		String telefone, 
		DadosEnderecoDTO endereco) {
	
}
