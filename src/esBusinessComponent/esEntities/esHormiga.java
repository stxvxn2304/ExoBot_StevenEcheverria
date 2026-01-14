package esBusinessComponent.esEntities;


import esBusinessComponent.esFactoryBL;
import esDataAccessComponent.esDAOs.esHormigaDAO;
import esDataAccessComponent.esDTOs.esHormigaDTO;


public abstract class esHormiga {
    protected esFactoryBL<esHormigaDTO> factory = new esFactoryBL<>(esHormigaDAO.class);
    public esHormigaDTO data = new esHormigaDTO();

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
