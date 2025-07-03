package EntidadesBases;

import java.time.LocalDate;

public abstract class EntidadBase {
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

    public EntidadBase(String id, LocalDate fechaRegistro) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
