package dao.cliente;

import java.util.List;
import modelo.Cliente;

public interface ClienteDAO {

    public boolean salvar(Cliente cliente);

    public Cliente consultarPK(String clienteId);

    public boolean apagarPK(int clienteId);

    public List consultarTudo();
}
