import esBusinessComponent.esFactoryBL;
import esBusinessComponent.esEntities.esHLarva;
import esDataAccessComponent.esDAOs.esAlimentoTipoDAO;
import esDataAccessComponent.esDAOs.esAntCiberDronDAO;
import esDataAccessComponent.esDAOs.esHormigaDAO;
import esDataAccessComponent.esDTOs.VWesHormigaDTO;
import esDataAccessComponent.esDTOs.esAlimentoTipoDTO;
import esDataAccessComponent.esDTOs.esAntCiberDronDTO;
import esDataAccessComponent.esDTOs.esHormigaDTO;
import esInfrastructureComponent.esAppException;

public class App {
    public static void main(String[] args) {
        // testing: Bl 
        try {

            esFactoryBL<esAntCiberDronDTO> bl = new esFactoryBL<>(esAntCiberDronDAO.class);
            for( int i = 1; i <= bl.getAll().size(); i++){
                esAntCiberDronDTO oDTO = bl.getBy(i);
                oDTO.setEsSerie("Serie-BL"+i);
                bl.upd(oDTO);
            }

            for(esAntCiberDronDTO dto : bl.getAll()){
                System.out.println(dto.toString());
            }
        } catch (Exception _) {
        }

        // testing: DAO
        // try {

        //         esAntCiberDronDAO dao = new esAntCiberDronDAO();
        //         for( int i = 1; i <= dao.readAll().size(); i++){
        //             esAntCiberDronDTO oDTO = dao.readBy(i);
        //             oDTO.setEsSerie("Serie-00"+i);
        //             dao.update(oDTO);
        //         }

        //         for(esAntCiberDronDTO dto : dao.readAll()){
        //             System.out.println(dto.toString());
        //         }

        // } catch (Exception _) {
        // }

        // try {
        //     esHLarva l = new esHLarva();
        //     System.out.println(l.getLarva(1).getEsNombre());
        //     for (esHormigaDTO larva : l.getLarvas()) {
        //         System.out.println(larva.toString());
        //     }
        // } catch (Exception e) {
        // }
        // try {
        //     esHormigaDAO esHDao = new esHormigaDAO();
        //     for(VWesHormigaDTO h : esHDao.readAllVWHormiga()){
        //         System.out.println(h.toString());
        //     }
        // } catch (Exception _) {
        // }

        // try {

        //     esAlimentoTipoDAO esDao = new esAlimentoTipoDAO();
        //     esAlimentoTipoDTO esODTO = esDao.readBy(1);
        //     esODTO.setEsNombre("CARnivoro");
        //     esODTO.setEsDescripcion("Salado");
        //     esDao.update(esODTO);

        //     for (esAlimentoTipoDTO esDto : esDao.readAll()) {
        //         System.out.println(esDto.toString());

        //     }
        // } catch (esAppException _) {}

        // esSexoDAO sexoDAO = new esSexoDAO();
        // for (esSexoDTO sexoDTO : sexoDAO.readAll()) {
        //     System.out.println(sexoDTO.toString());
        // }

        // esAutomata esAutomata = new esAutomata();
        // Scanner esTipoArsenal = new Scanner("a,ab,abbb,abcdt,abcdtttt,abc,abcd,adfs").useDelimiter(",");
        // while (esTipoArsenal.hasNext())
        //     System.out.println((esAutomata.esCheckTipoArsenal(esTipoArsenal.next()+" ") ? " boom " : " no boom "));
        // esTipoArsenal.close();

        // esSistemaRuso esSistemaRuso = new esSistemaRuso();
        // try {
        //     esSistemaRuso.esReadCoord("esStorage\\esDataFile\\EcheverriaSteven.csv");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // esAppException exception = new esAppException(new Exception("error en clases"), null, "main");
        
        // int a = 10;
        // int b = 0;
        // try {
        //     a = a / b;
        // } catch (Exception e) {
        //     esAppException er = new esAppException("Error al dividir por cero", e, null, "main(...)");
        //     esAppMSG.showError(er.getMessage());

        // }
        // System.out.println("Final Feliz...");

    }
}
