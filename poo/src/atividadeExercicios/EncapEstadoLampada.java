package atividadeExercicios;

public enum EncapEstadoLampada {

    APAGADA("Apagada"),
    ACESA("Acesa"),
    MEIA_LUZ("Meia Luz");

    private final String descricao;

    EncapEstadoLampada(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
