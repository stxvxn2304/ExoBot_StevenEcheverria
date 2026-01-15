package ANTDRON2K25.esDataAccessComponent.esDAOs;

import ANTDRON2K25.esApp.esInfrastructureComponent.esAppException;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esAlimentoDTO;
import ANTDRON2K25.esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;

public class esAlimentoDAO extends DataHelperSQLiteDAO<esAlimentoDTO> {
    public esAlimentoDAO() throws esAppException {
        super(esAlimentoDTO.class, "esAlimento", "esIdAlimento");
    }
}
