package ma.emsi.client.services;

import lombok.RequiredArgsConstructor;
import ma.emsi.client.entity.Client;
import ma.emsi.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientsRepository;

    public void saveClient(Client Client) {
        clientsRepository.save(Client);
    }

    public List<Client> getAllClients() {
        return clientsRepository.findAll();
    }

    public Client getClientById(Integer id) {
        return clientsRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
    }

}
