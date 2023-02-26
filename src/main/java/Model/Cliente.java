package Model;

import java.util.Date;

public class Cliente extends Pessoa {

    private String endereco;
    private String cep;

    public Cliente(int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg,
            String endereco, String cep) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

}
