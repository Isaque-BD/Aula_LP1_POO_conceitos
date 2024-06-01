package pib.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javafx.beans.binding.BooleanExpression;

public class UpdateSql {


    public void updateCidade(int qtdPessoa, String nomeRegiao, Double rendimento){

        DbConnection db =  new DbConnection();

        try {
            db.executeNotReturn("UPDATE cidade SET qtdPessoas = '"+qtdPessoa+"' WHERE nome = '"+nomeRegiao+"'");
            db.executeNotReturn("UPDATE cidade SET rendimento_mensal = '"+rendimento+"' WHERE nome = '"+nomeRegiao+"'");
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }finally{
            db.disconnect();
        }
    }

    public void updateEstado(String nomeRegiao, int qtdPessoa, int qtdCidade, int mediaPessoa, Double rendimento){

        DbConnection db =  new DbConnection();

        try {
            db.executeNotReturn("UPDATE estado SET qtd_pessoas = '"+qtdPessoa+"' WHERE estado = '"+nomeRegiao+"'");
            db.executeNotReturn("UPDATE estado SET qtd_cidades = '"+qtdCidade+"' WHERE estado = '"+nomeRegiao+"'");
            db.executeNotReturn("UPDATE estado SET media_pessoas_cidade = '"+mediaPessoa+"' WHERE estado = '"+nomeRegiao+"'");
            db.executeNotReturn("UPDATE estado SET rendimento_mensal = '"+rendimento+"' WHERE estado = '"+nomeRegiao+"'");
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }finally{
            db.disconnect();
        }


    }

    public void updatePais(String nomeRegiao, int qtd_estados, int mediaPessoa, Double rendimento ){

        DbConnection db =  new DbConnection();

        try {
            db.executeNotReturn("UPDATE pais SET qtd_estados = '"+qtd_estados+"' WHERE pais = '"+nomeRegiao+"'");
            db.executeNotReturn("UPDATE pais SET media_pessoas_estado = '"+mediaPessoa+"' WHERE pais = '"+nomeRegiao+"'");
            db.executeNotReturn("UPDATE pais SET rendimento_mensal = '"+rendimento+"' WHERE pais = '"+nomeRegiao+"'");
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }finally{
            db.disconnect();
        }
    }

}




    

    
