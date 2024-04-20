package dao.cliente;

import dao.Conexao;
import dao.DadosBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDAOMySQL implements ClienteDAO {

    @Override
    public boolean salvar(Cliente cliente) {
        boolean resultado = false;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        try {
            String sql = null;
            if (cliente.getClienteId() != -1) {
                sql = "update cliente set NOME = ?, ENDERECO = ?, CIDADE=?, ESTADO=?, CEP=?, ESCOLARIDADE=? where CLIENTEID = ?";
            } else {
                sql = "insert into cliente (NOME, ENDERECO, CIDADE, ESTADO, CEP, ESCOLARIDADE )  values  (?,?,?,?,?,?)";
            }
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getEndereco());
            pstmt.setString(3, cliente.getCidade());
            pstmt.setString(4, cliente.getEstado());
            pstmt.setString(5, cliente.getCep());
            pstmt.setString(6, cliente.getEscolaridade());
            if (cliente.getClienteId() != -1) {
                pstmt.setInt(7, cliente.getClienteId());
            }

            pstmt.executeUpdate();
            resultado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultado;
    }

    @Override
    public List consultarTudo() {
        Cliente cliente = null;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try {
            String sql = "select * from cliente";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setClienteId(rs.getInt("clienteId"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEscolaridade(rs.getString("escolaridade"));
                lista.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return lista;
    }

    @Override
    public boolean apagarPK(int clienteId) {
        boolean resultado = false;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        try {
            String sql = "delete from cliente where clienteId = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, clienteId);
            pstmt.executeUpdate();
            resultado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultado;
    }

    @Override
    public Cliente consultarPK(String clienteId) {
        Cliente cliente = null;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String sql = "select * from cliente where clienteId = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(clienteId));
            rs = pstmt.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setClienteId(rs.getString("clienteId"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEscolaridade(rs.getString("escolaridade"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return cliente;
    }
}
