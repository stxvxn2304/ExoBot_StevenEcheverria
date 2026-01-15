// import esBusinessComponent.esFactoryBL;
// import esBusinessComponent.esEntities.esHLarva;
// import esBusinessComponent.esEntities.esHormiga;
// import esDataAccessComponent.esDAOs.esAlimentoTipoDAO;
// import esDataAccessComponent.esDAOs.esAntCiberDronDAO;
// import esDataAccessComponent.esDAOs.esHormigaDAO;
// import esDataAccessComponent.esDTOs.VWesHormigaDTO;
// import esDataAccessComponent.esDTOs.esAlimentoTipoDTO;
// import esDataAccessComponent.esDTOs.esAntCiberDronDTO;
// import esDataAccessComponent.esDTOs.esHormigaDTO;
// import esInfrastructureComponent.esAppException;

import java.util.List;
import java.util.Scanner;

import ANTDRON2K25.esApp.esConsoleApp.esSistemaRuso;
import ANTDRON2K25.esApp.esInfrastructureComponent.esAppException;
import ANTDRON2K25.esApp.esInfrastructureComponent.esTools.esCMDColor;
import ANTDRON2K25.esApp.esInfrastructureComponent.esTools.esCMDProgress;
import ANTDRON2K25.esBusinessComponent.esFactoryBL;
import ANTDRON2K25.esBusinessComponent.esEntities.esAlimento;
import ANTDRON2K25.esBusinessComponent.esEntities.esEntomologo;
import ANTDRON2K25.esBusinessComponent.esEntities.esEntomologoGenetista;
import ANTDRON2K25.esBusinessComponent.esEntities.esEntomologoNoGenetista;
import ANTDRON2K25.esBusinessComponent.esEntities.esHLarva;
import ANTDRON2K25.esBusinessComponent.esEntities.esHObrera;
import ANTDRON2K25.esBusinessComponent.esEntities.esHormiga;
import ANTDRON2K25.esBusinessComponent.esEntities.esNectarivoro;
import ANTDRON2K25.esDataAccessComponent.esDAOs.esAlimentoDAO;
import ANTDRON2K25.esDataAccessComponent.esDAOs.esHormigaDAO;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esAlimentoDTO;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esHormigaDTO;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        esSistemaRuso sistemaRuso = new esSistemaRuso();
        esEntomologoNoGenetista entomologo = new esEntomologoNoGenetista();
        esEntomologoGenetista entomologoGenetista = new esEntomologoGenetista();
        esFactoryBL<esHormigaDTO> blH = new esFactoryBL<>(esHormigaDAO.class);
        esFactoryBL<esAlimentoDTO> blA = new esFactoryBL<>(esAlimentoDAO.class);
        
        sistemaRuso.esPresentarCedulaNombre(sc);
        System.out.println(esCMDColor.RED+"readAll"+esCMDColor.RESET);
        List<esHormiga> hormigas = entomologo.esEtlAntNest();
        List<esAlimento> alimentos = entomologo.esEtlAntFood();

        //Creacion de los datos
        for( int i = 1; i <= hormigas.size(); i++){
            esHormigaDTO oDTO = new esHormigaDTO();
            oDTO.setEsIdHormigaTipo(1); //LARVA por defecto
            oDTO.setEsIdEstado(1); //VIVA por defecto
            oDTO.setEsIdSexo(1); //MACHO por defecto
            try {
                blH.add(oDTO);
            } catch (esAppException _) {
            }
        }

        for (int i = 1; i <= alimentos.size(); i++) {
            esAlimentoDTO oDTO = new esAlimentoDTO();
            oDTO.setEsIdAlimentoTipo(1); //Nectarívoro por defecto
            try {
                blA.add(oDTO);
            } catch (esAppException _) {
            }
        }

        //Almacenamiento de los datos
        for (esHormiga hormiga : hormigas) {
            if(hormiga instanceof esHLarva){
                try {
                    for( int i = 1; i <= blH.getAll().size(); i++){
                        esHormigaDTO oDTO = blH.getBy(i);
                        oDTO.setEsIdHormigaTipo(1);
                        blH.upd(oDTO);
                    }
                } catch (esAppException _) {
                }
            }else{
                try {
                    for (int i = 1; i <= blH.getAll().size(); i++) {
                        esHormigaDTO oDTO = blH.getBy(i);
                        oDTO.setEsIdHormigaTipo(2);
                        blH.upd(oDTO);
                    }
                } catch (esAppException _) {
                }
            }
        }

        for (esAlimento alimento : alimentos) {
            if (alimento instanceof esNectarivoro) {
                try {
                    for (int i = 1; i <= blA.getAll().size(); i++) {
                        esAlimentoDTO oDTO = blA.getBy(i);
                        oDTO.setEsIdAlimentoTipo(1);
                        blA.upd(oDTO);
                    }
                } catch (esAppException _) {
                }
            } else {
                try {
                    for (int i = 1; i <= blA.getAll().size(); i++) {
                        esAlimentoDTO oDTO = blA.getBy(i);
                        oDTO.setEsIdAlimentoTipo(2);
                        blA.upd(oDTO);
                    }
                } catch (esAppException _) {
                }
            }
        }

        for (esHormiga hormiga : hormigas) {
            if (hormiga instanceof esHObrera) {
                ((esHObrera)hormiga).esSuperCortadora(true);
            }else{
                hormiga.esCortar();
            }
        }
        int i = 0;
        for (esAlimento alimento : alimentos) {
            i++;
            System.out.println("Alimento "+i);
            alimento = entomologo.esPreparar(alimento);
            alimento = entomologoGenetista.esPreparar(alimento);
            System.out.print("\n");
        }

        sc.close();

        // testing: Bl 
        // try {
            // esHLarva esLarva = new esHLarva();
            // System.out.println(esLarva.getLarva(1).toString());

            // esHormiga h = esLarva.comer("hierba");
            // System.out.println(h.toString());

            //generic BL
            // esFactoryBL<esAntCiberDronDTO> bl = new esFactoryBL<>(esAntCiberDronDAO.class);
            // for( int i = 1; i <= bl.getAll().size(); i++){
            //     esAntCiberDronDTO oDTO = bl.getBy(i);
            //     oDTO.setEsSerie("Serie-BL"+i);
            //     bl.upd(oDTO);
            // }

            // for(esAntCiberDronDTO dto : bl.getAll()){
            //     System.out.println(dto.toString());
            // }
        // } catch (Exception _) {
        // }

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
