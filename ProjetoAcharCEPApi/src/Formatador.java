import com.google.gson.annotations.SerializedName;

public class Formatador {
    @SerializedName("cep")
    private String cep;

    @SerializedName("logradouro")
    private String logradouro;

    @SerializedName("bairro")
    private String bairro;

    @SerializedName("localidade")
    private String localidade;

    @SerializedName("estado")
    private String estado;

    @SerializedName("ddd")
    private String ddd;

    @Override
    public String toString() {
        return "Seu endereço {" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", estado='" + estado + '\'' +
                ", ddd='" + ddd + '\'' +
                '}';
    }

    public String getCep() {
        return cep;
    }
}
