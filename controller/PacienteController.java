package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastraPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @PostMapping
    public void cadastar(@RequestBody DadosCadastraPaciente dados) {
        System.out.println(dados);
    }
}
