package alvares_cabral;

public class Simula_Feira {
    public static void main(String[] args) {
        Feira a = new Fruta();
        a.set_fruta(a.comprar);
        a.chama_comprar_fruta();

        Feira b = new Verdura();
        b.set_verdura(b.comprar);
        b.chama_comprar_verdura();

        Feira c = new Fiscal_da_feira();
        c.set_fiscal_de_feira(c.verificar);
        c.chama_fiscalizar_feira();
    }
}
