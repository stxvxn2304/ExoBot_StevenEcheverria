package esDataAccessComponent.esDTOs;

public class esAntCiberDronDTO {
    private Integer esIdAntCiberDron;
    private String esSerie         ;
    private String Estado          ;
    private String FechaCreacion   ;
    private String FechaModifica   ;

    public esAntCiberDronDTO() {}
    public esAntCiberDronDTO(String esSerie) {
        this.esIdAntCiberDron = 0;
        this.esSerie = esSerie;
    }
    public esAntCiberDronDTO(Integer esIdAntCiberDron, String esSerie, String estado, String fechaCreacion,
            String fechaModifica) {
        this.esIdAntCiberDron = esIdAntCiberDron;
        this.esSerie = esSerie;
        Estado = estado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }
    public Integer getEsIdAntCiberDron() {
        return esIdAntCiberDron;
    }
    public void setEsIdAntCiberDron(Integer esIdAntCiberDron) {
        this.esIdAntCiberDron = esIdAntCiberDron;
    }
    public String getEsSerie() {
        return esSerie;
    }
    public void setEsSerie(String esSerie) {
        this.esSerie = esSerie;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getFechaCreacion() {
        return FechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }
    public String getFechaModifica() {
        return FechaModifica;
    }
    public void setFechaModifica(String fechaModifica) {
        FechaModifica = fechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "\n IdAntCiberDron :  " + getEsIdAntCiberDron()
                + "\n Serie          :  " + getEsSerie()
                + "\n Estado         :  " + getEstado()
                + "\n FechaCreacion  :  " + getFechaCreacion()
                + "\n FechaModifica  :  " + getFechaModifica()
                + "\n --------------------------- ";
    }
}
