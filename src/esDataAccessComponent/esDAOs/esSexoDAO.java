package esDataAccessComponent.esDAOs;

import esDataAccessComponent.esDTOs.esSexoDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;
import esInfrastructureComponent.esAppException;

public class esSexoDAO extends DataHelperSQLiteDAO<esSexoDTO>{
    public esSexoDAO() throws esAppException {
        super(esSexoDTO.class, "esSexo", "esIdSexo");
    }
}
