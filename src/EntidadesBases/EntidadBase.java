package EntidadesBases;

import java.time.LocalDate;

public class EntidadBase {
    private String id;
    private LocalDate fechaRegistro;

    public String getId() {
        return id;
    }

    
    public String getFechaRegistro() {
        return fechaRegistro != null ? fechaRegistro.toString() : "No registrada";
    }

    public String actualizarFechaRegistro() {
        this.fechaRegistro = LocalDate.now();
        return fechaRegistro.toString();
    }
}
