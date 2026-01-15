package ANTDRON2K25.esBusinessComponent.esEntities;


import ANTDRON2K25.esBusinessComponent.esFactoryBL;
import ANTDRON2K25.esBusinessComponent.esInterfaces.esIHormiga;
import ANTDRON2K25.esDataAccessComponent.esDAOs.esHormigaDAO;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esHormigaDTO;


public abstract class esHormiga implements esIHormiga {
    protected esFactoryBL<esHormigaDTO> factory = new esFactoryBL<>(esHormigaDAO.class);
    public esHormigaDTO data = new esHormigaDTO();
    private Boolean esEstado = true;
    private String esSexo;
    
   

    public Boolean esSaltar(){
        System.out.println("La hormiga esta saltando normalmente...");
        return true;
    }

    public Boolean esCortar(){
        System.out.println("La hormiga esta cortando normalmente...");
        return true;
    }

    public Boolean getEsEstado() {
        return esEstado;
    }

    public void setEsEstado(Boolean esEstado) {
        this.esEstado = esEstado;
    }

    public String getEsSexo() {
        return esSexo;
    }

    public void setEsSexo(String esSexo) {
        this.esSexo = esSexo;
    }

    // protected esHormigaDAO eshormigaDAO;
    // protected Hormiga() throws AppException  {
    //     this.eshormigaDAO = new esHormigaDAO();
    // }

    // public FactoryBL<HormigaDTO> factory = new FactoryBL<>(() -> {
    //     try {
    //         return new esHormigaDAO();
    //     } catch (Exception e) {
    //         new RuntimeException();
    //     }
    // });
}
