package med.paul.apiclinicbackend.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.paul.apiclinicbackend.Enums.EspecialidadesMedicasEnum;

//lombok RECORD
public record MedicosDTO(
		
		@NotBlank
		String nome, 
		
		@NotBlank 
		@Email
		String email,
		
		@NotBlank
		String telefone,
		
		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String crm, 
		
		@NotNull
		EspecialidadesMedicasEnum especialidade, 
		
		@NotNull @Valid	DadosEnderecoDTO endereco) {
	
}
