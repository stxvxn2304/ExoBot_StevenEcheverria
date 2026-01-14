package esDataAccessComponent.esDAOs;

import esDataAccessComponent.esDTOs.esAlimentoTipoDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;
import esInfrastructureComponent.esAppException;

public class esAlimentoTipoDAO extends DataHelperSQLiteDAO<esAlimentoTipoDTO>{
    public esAlimentoTipoDAO() throws esAppException {
        super(esAlimentoTipoDTO.class, "esAlimentoTipo", "esIdAlimentoTipo");
    }
}
