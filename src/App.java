import java.util.Scanner;

import javax.swing.JFrame;

import esBusinessComponent.esEntities.esAutomata;
import esBusinessComponent.esEntities.esEstadoCivilBL;
import esBusinessComponent.esEntities.esRazaBL;
import esBusinessComponent.esEntities.esSexoBL;
import esBusinessComponent.esEntities.esSistemaRuso;
import esBusinessComponent.esEntities.esTipoPersonaBL;
import esDataAccessComponent.esDAOs.esEstadoCivilDAO;
import esDataAccessComponent.esDAOs.esRazaDAO;
import esDataAccessComponent.esDAOs.esSexoAnteDAO;
import esDataAccessComponent.esDAOs.esSexoDAO;
import esDataAccessComponent.esDAOs.esTipoPersonaDAO;
import esDataAccessComponent.esDTOs.*;
import esUserInterface.esForm.esSplashScreenForm;

public class App {
    public static void main(String[] args) throws Exception {
        // testing: DAO
        // try {
        //     esTipoPersonaDAO esTpDao = new esTipoPersonaDAO();
        //     for (esTipoPersonaDTO esTp : esTpDao.readAll())
        //         System.out.println(esTp.toString() +"\n");
        //     System.out.println("-----------------------------------");

        //     esSexoDAO esSDao = new esSexoDAO();
        //     for (esSexoDTO esS : esSDao.readAll())
        //         System.out.println(esS.toString() +"\n");
        //     System.out.println("-----------------------------------");

        //     esEstadoCivilDAO esEcDao = new esEstadoCivilDAO();
        //     for (esEstadoCivilDTO esEc : esEcDao.readAll())
        //         System.out.println(esEc.toString()+"\n");
        //     System.out.println("-----------------------------------");

        //     esRazaDAO esRDao = new esRazaDAO();
        //     for (esRazaDTO esR : esRDao.readAll())
        //         System.out.println(esR.toString()+"\n");
        //     System.out.println("-----------------------------------");

        // } catch (Exception e) {
        //     System.out.println(e.toString());
        // }
        // int a[] = { 10, 0 }, b = 10;
        // try {
        //     int resultadoA = a[1] / b;
        //     int resultadoB = b / a[0];
        //     throw new Exception("Te quiero fregar la vida");
        // } 
        // catch (ArithmeticException e) {
        //     System.out.println("El denominador no debe ser cero"); //+ e.getMessage());
        // } 
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Esta fuera de rango "); //+ e.getMessage());
        // } 
        // catch (Exception e) {
        //     System.out.println("Ups... lo siento ocurrio un error: " + e.getMessage());
        // } finally {
            //System.out.println("finally: Ejecucion con o sin error");
        // }
        // testing: BL
        // try {
        // esTipoPersonaBL esTpBL = new esTipoPersonaBL();
        // for (esTipoPersonaDTO esTp : esTpBL.esGetAll())
        // System.out.println(esTp.toString() +"\n");
        // System.out.println("-----------------------------------");

        // esSexoBL esSBL = new esSexoBL();
        // // esSBL.esAdd(new esSexoDTO(0, 0, "nuevo sexo", "prueba", null, null, null));
        // for (esSexoDTO esS : esSBL.esGetAll())
        // System.out.println(esS.toString() +"\n");
        // System.out.println("-----------------------------------");

        // esEstadoCivilBL esEcBL = new esEstadoCivilBL();
        // for (esEstadoCivilDTO esEc : esEcBL.esGetAll())
        // System.out.println(esEc.toString()+"\n");
        // System.out.println("-----------------------------------");

        // esRazaBL esRBL = new esRazaBL();
        // for (esRazaDTO esR : esRBL.esGetAll())
        // System.out.println(esR.toString()+"\n");
        // // System.out.println("-----------------------------------");

        // } catch (Exception e) {
        //     System.out.println(e.toString());
        // }

        // javax.swing.SwingUtilities.invokeLater(() -> {
        //     esSplashScreenForm.esShow();
        // });

        // esAutomata esAutomata = new esAutomata();
        // Scanner esTipoArsenal = new Scanner("a,ab,abbb,abcdt,abcdtttt,abc,abcd,adfs").useDelimiter(",");
        // while (esTipoArsenal.hasNext())
        //     System.out.println((esAutomata.esCheckTipoArsenal(esTipoArsenal.next()+" ") ? " boom " : " no boom "));
        // esTipoArsenal.close();

        esSistemaRuso esSistemaRuso = new esSistemaRuso();
        try {
            esSistemaRuso.esReadCoord("esStorage\\esDataFile\\EcheverriaSteven.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
