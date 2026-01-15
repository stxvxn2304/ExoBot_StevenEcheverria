package ANTDRON2K25.esBusinessComponent.esEntities;

import java.util.List;

public class esEntomologoGenetista extends esEntomologo {
    public esAlimento esPreparar(esAlimento alimento){
        esGenoma genoma = alimento.getEsGenomaA();
        if(alimento instanceof esNectarivoro){
            String genomaAleatorio = new String[] { "X", "XX", "XY" }[new java.util.Random().nextInt(3)];
            if (genomaAleatorio.equals("XY")) {
                alimento.setEsGenomaA(new esGenoma());
                System.out.println( "[ Preparado ]-<Herbivoro + Genoma XY>");
                return (esHerbivoro) alimento;
            }else{
                System.out.println( "[ Preparado ]-<Nectarívoro>");
                return alimento;
            }
        }else{
            System.out.println("[ Preparado ]-<Nectarívoro>");
            return alimento;
        }
    }
}
