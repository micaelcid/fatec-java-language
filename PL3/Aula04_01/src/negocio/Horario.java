package negocio;

public class Horario {
    private Hora hora;
    private Minuto minuto;
    private Segundo segundo;

    public Horario(int hora, int minuto, int segundo){
        this.hora = new Hora(hora);
        this.minuto = new Minuto(minuto);
        this.segundo = new Segundo(segundo);
    }

    public void informar(){
        final String horario = String.format("%s:%s:%s", hora.getTexto(), minuto.getTexto(), segundo.getTexto());
        System.out.println(horario);
    }

    public void incrementar() {
        if (segundo.getUnidade() < 59) {
            segundo.incrementar();
        } else  {
            segundo = new Segundo(0);

            if (minuto.getUnidade() < 59) {
                minuto.incrementar();
            } else {
                minuto = new Minuto(0);

                if (hora.getUnidade() < 23) {
                    hora.incrementar();
                } else {
                    hora = new Hora(0);
                }
            }
        }
    }
}
