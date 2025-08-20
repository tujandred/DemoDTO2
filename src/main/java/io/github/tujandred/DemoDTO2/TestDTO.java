package io.github.tujandred.DemoDTO2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {
    private Long id = 0L;
    private String nombre = "Nombre de prueba";
    private String descripcion = "Descripcion de prueba";
}
