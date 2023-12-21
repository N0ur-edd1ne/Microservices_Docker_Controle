package ma.emsi.client.controller;


import ma.emsi.client.entity.Client;
import lombok.RequiredArgsConstructor;
import ma.emsi.client.services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientsService;

    @PostMapping
    public void save(@RequestBody Client clt) {
        clientsService.saveClient(clt);
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientsService.getAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Integer id) {
        return ResponseEntity.ok(clientsService.getClientById(id));
    }


}
