package ANTDRON2K25.esBusinessComponent.esEntities;

import ANTDRON2K25.esBusinessComponent.esFactoryBL;
import ANTDRON2K25.esDataAccessComponent.esDAOs.esAlimentoDAO;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esAlimentoDTO;

public abstract class esAlimento {
    protected esFactoryBL<esAlimentoDTO> factory = new esFactoryBL<>(esAlimentoDAO.class);
    public esAlimentoDTO data = new esAlimentoDTO();
    private esGenoma esGenomaA = null; //Sin genoma por defecto
    public esGenoma getEsGenomaA() {
        return esGenomaA;
    }
    public void setEsGenomaA(esGenoma esGenomaA) {
        this.esGenomaA = esGenomaA;
    }
    
}
