package med.paul.apiclinicbackend.DTO;

import med.paul.apiclinicbackend.Enums.EspecialidadesMedicasEnum;

//lombok RECORD
public record MedicosDTO(String nome, String email, String crm, EspecialidadesMedicasEnum especialidade, DadosEnderecoDTO endereco) {
	
}
