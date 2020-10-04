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


import com.unsada.practica4.modelo.Fcompras;
import com.unsada.practica4.service.FcomprasServiceApi;


@RestController
@RequestMapping(value = "/api/v1/fcompras")
@CrossOrigin("*")
public class FcomprasRestController {

		@Autowired
		private FcomprasServiceApi fcomprasServiceApi;
		
		@GetMapping(value = "/all")
		public Map<String, Object> list() {

			HashMap<String, Object> response = new HashMap<String, Object>();

			try {
				List<Fcompras> fcomprasList;
				fcomprasList = (List<Fcompras>) fcomprasServiceApi.findAll();
				response.put("message", "Successful load");
				response.put("list", fcomprasList);
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

				Optional<Fcompras> fcompras = fcomprasServiceApi.findById(id);

				if (fcompras.isPresent()) {
					response.put("message", "Successful load");
					response.put("data", fcompras);
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
		public ResponseEntity<String> create(@RequestBody Fcompras data) {

			try {
				System.out.print("Proceso de guardar datos");
				fcomprasServiceApi.save(data);
				return new ResponseEntity<>("Save successful ", HttpStatus.OK);
			} catch (Exception e) {
				System.out.print(e);
				return new ResponseEntity<>("" + e, HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}
		
		@PutMapping(value = "/update/{id}")

		public Map<String, Object> update(@PathVariable("id") Long id, @RequestBody Fcompras data) {

			HashMap<String, Object> response = new HashMap<String, Object>();

			try {
				data.setIdFcompras(id);
				fcomprasServiceApi.save(data);
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
				fcomprasServiceApi.deleteById(id);
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
