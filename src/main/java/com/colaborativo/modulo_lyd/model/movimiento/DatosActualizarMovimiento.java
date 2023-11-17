package com.colaborativo.modulo_lyd.model.movimiento;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarMovimiento(
        @NotNull Long id_movimiento,
        String tipo_movimiento,
        String descripcion,
        Boolean activo) {

}
