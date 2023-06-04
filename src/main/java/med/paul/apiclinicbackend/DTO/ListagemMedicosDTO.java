package med.paul.apiclinicbackend.DTO;

import med.paul.apiclinicbackend.Enums.EspecialidadesMedicasEnum;
import med.paul.apiclinicbackend.entities.Medico;

public record ListagemMedicosDTO(Long id, String nome, String email, String crm, EspecialidadesMedicasEnum especialidade) {

    public ListagemMedicosDTO(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}

