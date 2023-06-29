package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.DadosEnderecoPaciente;

public record DadosCadastraPaciente(String nome, String email, String telefone, String cpf, DadosEnderecoPaciente endereco) {
}
