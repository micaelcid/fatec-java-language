package view;

import java.lang.Thread;
import java.time.LocalDateTime;

import negocio.Horario;

public class Relogio {
    public static void main(String[] args) throws InterruptedException {
        final LocalDateTime horarioAtual = LocalDateTime.now();

        final int hora = horarioAtual.getHour();
        final int minuto = horarioAtual.getMinute();
        final int segundo = horarioAtual.getSecond();

        Horario horario = new Horario(hora, minuto, segundo);

        while(true) {
            horario.informar();
            Thread.sleep(1000);
            horario.incrementar();
        }
    }
}
