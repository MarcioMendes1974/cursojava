package implementacoes;

import beans.AgendaRevisao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExecutarAgenda {
    public static void main(String[] args)throws ParseException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/mm/aaaa");

        System.out.println("executar aegnda ");
        AgendaRevisao agenda1 = new AgendaRevisao();
        agenda1.cliente = "ana maria ";
        agenda1.modelo = "gol ";
        agenda1.kmVeiculo = 15000;
        agenda1.data =formataData.parse("07/04/2022");
    //*    agenda1.data "13:00";

        System.out.println(" nome agenda "+agenda1.cliente);
        System.out.println(" nome agenda "+agenda1.cliente);
        System.out.println("data "+formataData.format(agenda1.data));


    }
}
