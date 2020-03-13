package alvares_cabral;

public abstract class Feira {
    Fazer_feira comprar;
    Fiscalizar_feira verificar;

    public Feira(){ }

    public void set_fruta (Fazer_feira f) {
        comprar = f;
    }

    public void set_verdura (Fazer_feira v) {
        comprar = v;
    }

    public void set_fiscal_de_feira (Fiscalizar_feira u) {
        verificar = u;
    }

    public void chama_comprar_fruta() {
        comprar.comprar_na_barraca();
    }

    public void chama_comprar_verdura() {
        comprar.comprar_na_barraca();
    }

    public void chama_fiscalizar_feira() { verificar.verificar_barraca(); }
}
