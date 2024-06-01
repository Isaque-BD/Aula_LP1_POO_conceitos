package pib.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertSql {

    public void insertCidade(int qtdPessoa, String nomeRegiao, Double rendimento) {
        DbConnection db = new DbConnection();
        Connection conn = db.getConnection();
        PreparedStatement stmt = null;

        String sql = "INSERT INTO cidade (cidade, qtd_pessoas, rendimento_mensal) VALUES (?, ?, ?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeRegiao);
            stmt.setInt(2, qtdPessoa);
            stmt.setDouble(3, rendimento);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            db.disconnect();
        }
    }

    public void insertEstado(String nomeRegiao, int qtdCidade, int mediaPessoa, Double rendimento) {
        DbConnection db = new DbConnection();
        Connection conn = db.getConnection();
        PreparedStatement stmt = null;

        String sql = "INSERT INTO estado (estado, qtd_cidade, media_pessoas_cidade, media_rendimento) VALUES (?,?,?,?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeRegiao);
            stmt.setInt(2, qtdCidade);
            stmt.setInt(3, mediaPessoa);
            stmt.setDouble(4, rendimento);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            db.disconnect();
        }
    }

    public void insertPais(String nomeRegiao, int qtdEstados, int mediaPessoa, Double rendimento) {
        DbConnection db = new DbConnection();
        Connection conn = db.getConnection();
        PreparedStatement stmt = null;

        String sql = "INSERT INTO pais (pais, qtd_estados, media_pessoas_estado, rendimento_mensal) VALUES (?, ?, ?,?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeRegiao);
            stmt.setInt(2, qtdEstados);
            stmt.setInt(3, mediaPessoa);
            stmt.setDouble(4, rendimento);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            db.disconnect();
        }
    }
}
