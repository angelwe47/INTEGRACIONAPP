package pe.ineappep1.ineappep1alumnoservice.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping
    @RequestMapping("/getAll")


public List<Alumno> getAll(){

Alumno alumno = Alumno.builder()
        .id(1L)
        .nombre("angel")
        .apellido("tineo")
        .dni("73180930")
        .curso("algoritmos").build();

Alumno alumno1 = Alumno.builder()
                .id(2L)
                .nombre("carlos")
                .apellido("sanchez")
                .dni("59856871")
                .curso("matematicas").build();





        return List.of(alumno, alumno1);

    }
}
