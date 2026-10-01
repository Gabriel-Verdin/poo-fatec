package atividadeExercicios;

public class EncapLampada {

    private EncapEstadoLampada estadoAtual;

    public EncapLampada() {
        this.estadoAtual = EncapEstadoLampada.APAGADA;
    }

    public void acender() {
        this.estadoAtual = EncapEstadoLampada.ACESA;
    }

    public void apagar() {
        this.estadoAtual = EncapEstadoLampada.APAGADA;
    }

    public void ajustarMeiaLuz() {
        this.estadoAtual = EncapEstadoLampada.MEIA_LUZ;
    }

    public EncapEstadoLampada getEstadoAtual() {
        return estadoAtual;
    }

}
