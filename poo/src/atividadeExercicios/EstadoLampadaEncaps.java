package atividadeExercicios;

public enum EstadoLampadaEncaps {

    APAGADA("Apagada"),
    ACESA("Acesa"),
    MEIA_LUZ("Meia Luz");

    private final String descricao;

    EstadoLampadaEncaps(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
