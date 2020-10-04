package com.unsada.practica4.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.unsada.practica4.modelo.Cliente;
import com.unsada.practica4.service.ClienteServiceApi;

@RestController
@RequestMapping(value = "/api/v1/cliente")
@CrossOrigin("*")
public class ClienteRestController {
	@Autowired
	private ClienteServiceApi clienteServiceApi;
	
	@GetMapping(value = "/all")
	public Map<String, Object> list() {

		HashMap<String, Object> response = new HashMap<String, Object>();

		try {
			List<Cliente> clienteList;
			clienteList = (List<Cliente>) clienteServiceApi.findAll();
			response.put("message", "Successful load");
			response.put("list", clienteList);
			response.put("success", true);
			return response;

		} catch (Exception e) {
			response.put("message", e.getMessage());
			response.put("success ", false);
			return response;
		}

	}
	
	@GetMapping(value = "/find/{id}")
	public Map<String, Object> data(@PathVariable("id") Long id) {
		HashMap<String, Object> response = new HashMap<String, Object>();

		try {

			Optional<Cliente> cliente = clienteServiceApi.findById(id);

			if (cliente.isPresent()) {
				response.put("message", "Successful load");
				response.put("data", cliente);
				response.put("success", true);
				return response;
			} else {
				response.put("message", "Not found data");
				response.put("data", null);
				response.put("success", false);
				return response;
			}

		} catch (Exception e) {
			response.put("message", "" + e.getMessage());
			response.put("success", false);
			return response;
		}
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<String> create(@RequestBody Cliente data) {

		try {
			System.out.print("Proceso de guardar datos");
			clienteServiceApi.save(data);
			return new ResponseEntity<>("Save successful ", HttpStatus.OK);
		} catch (Exception e) {
			System.out.print(e);
			return new ResponseEntity<>("" + e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@PutMapping(value = "/update/{id}")

	public Map<String, Object> update(@PathVariable("id") Long id, @RequestBody Cliente data) {

		HashMap<String, Object> response = new HashMap<String, Object>();

		try {
			data.setIdCliente(id);;;
			clienteServiceApi.save(data);
			response.put("message", "Successful update");
			response.put("success", true);
			return response;
		} catch (Exception e) {
			response.put("message", e.getMessage());
			response.put("success", false);
			return response;
		}

	}
	
	@DeleteMapping(value = "/delete/{id}")

	public Map<String, Object> update(@PathVariable("id") Long id) {

		HashMap<String, Object> response = new HashMap<String, Object>();

		try {
			clienteServiceApi.deleteById(id);
			;
			response.put("message", "Successful delete");
			response.put("success", true);
			return response;
		} catch (Exception e) {
			response.put("message", e.getMessage());
			response.put("success", false);
			return response;
		}

	}
	
}
