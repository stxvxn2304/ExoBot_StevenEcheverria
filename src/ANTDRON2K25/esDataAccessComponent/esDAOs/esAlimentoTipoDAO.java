package ANTDRON2K25.esDataAccessComponent.esDAOs;

import ANTDRON2K25.esApp.esInfrastructureComponent.esAppException;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esAlimentoTipoDTO;
import ANTDRON2K25.esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;

public class esAlimentoTipoDAO extends DataHelperSQLiteDAO<esAlimentoTipoDTO>{
    public esAlimentoTipoDAO() throws esAppException {
        super(esAlimentoTipoDTO.class, "esAlimentoTipo", "esIdAlimentoTipo");
    }
}
