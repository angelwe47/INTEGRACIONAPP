package pe.ineappep1.ineappep1alumnoservice.Alumno;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Alumno {
    Long id;
String nombre;
String apellido;
String dni;
String curso;


}
