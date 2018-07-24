package com.boot.dasboot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.boot.dasboot.model.Shipwreck;
import com.boot.dasboot.model.ShipwreckStub;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list(){
		return ShipwreckStub.list();
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck){
		return ShipwreckStub.create(shipwreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id){
		return ShipwreckStub.get(id);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
		return ShipwreckStub.update(id, shipwreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id){
		return ShipwreckStub.delete(id);
	}
}
