package atividadeExercicios;

public class LampadaEncaps {

    private EstadoLampadaEncaps estadoAtual;

    public LampadaEncaps() {
        this.estadoAtual = EstadoLampadaEncaps.APAGADA;
    }

    public void acender() {
        this.estadoAtual = EstadoLampadaEncaps.ACESA;
    }

    public void apagar() {
        this.estadoAtual = EstadoLampadaEncaps.APAGADA;
    }

    public void ajustarMeiaLuz() {
        this.estadoAtual = EstadoLampadaEncaps.MEIA_LUZ;
    }

    public EstadoLampadaEncaps getEstadoAtual() {
        return estadoAtual;
    }

}
