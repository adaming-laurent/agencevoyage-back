package com.clientui.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientui.beans.CustomerBean;
import com.clientui.beans.FlightBean;
import com.clientui.beans.JourneyBean;
import com.clientui.beans.LocationBean;
import com.clientui.beans.OperatingBean;
import com.clientui.beans.RiverCruiseBean;
import com.clientui.beans.TrainRideBean;
import com.clientui.proxies.MicroServiceCustomerProxies;
import com.clientui.proxies.MicroServiceJourneyProxies;
import com.clientui.proxies.MicroServiceLocationProxies;
import com.clientui.proxies.MicroServiceOperatingProxies;

@RestController
@CrossOrigin
public class ClientController {
	
	@Autowired
	private MicroServiceJourneyProxies msJourneyProxies;
	
	@Autowired
	private MicroServiceOperatingProxies msOperatingProxies;

	@Autowired
	private MicroServiceLocationProxies msLocationProxies;
	
	@Autowired
	private MicroServiceCustomerProxies msCustomerProxies;
	

	
	//JourneyController
	
	@GetMapping("/Flights")
	public List<FlightBean> findAllFlight() {
		return msJourneyProxies.findAllFlight();
	}

	@GetMapping("/Flights/{id}")
	public FlightBean findOneFlight(@PathVariable("id") Long id) {
		return msJourneyProxies.findOneFlight(id);
	}

	@GetMapping("/journeys")
	public List<JourneyBean> findAllJourney() {
		return msJourneyProxies.findAllJourney();
	}

	@GetMapping("/journeys/{id}")
	public JourneyBean findOneJourney(@PathVariable("id") Long id) {
		return msJourneyProxies.findOneJourney(id);
	}

	@GetMapping("/TrainRides")
	public List<TrainRideBean> findAllTrainRides() {
		return msJourneyProxies.findAllTrainRides();
	}

	@GetMapping("/TrainRides/{id}")
	public TrainRideBean findOneTrainRides(@PathVariable("id") Long id) {
		return msJourneyProxies.findOneTrainRides(id);
	}

	@GetMapping("/RiverCruises")
	public List<RiverCruiseBean> findAllRiverCruise() {
		return msJourneyProxies.findAllRiverCruise();
	}

	@GetMapping("/RiverCruises/{id}")
	public RiverCruiseBean findOneRiverCruise(@PathVariable("id") Long id) {
		return msJourneyProxies.findOneRiverCruise(id);
	}

	@PostMapping("/Flights")
	public FlightBean saveFlight(@RequestBody FlightBean Flight) {
		return msJourneyProxies.saveFlight(Flight);
	}

	@PostMapping("/Journeys")
	public JourneyBean saveJourney(@RequestBody JourneyBean Journey) {
		return msJourneyProxies.saveJourney(Journey);
	}

	@PostMapping("/TrainRides")
	public TrainRideBean saveTrainRide(@RequestBody TrainRideBean TrainRide) {
		return msJourneyProxies.saveTrainRide(TrainRide);
	}

	@PostMapping("/RiverCruises")
	public RiverCruiseBean saveRiverCruise(@RequestBody RiverCruiseBean RiverCruise) {
		return msJourneyProxies.saveRiverCruise(RiverCruise);
	}

	@DeleteMapping("/Flights/{id}")
	public void deleteFlight(@PathVariable("id") Long id) {
		msJourneyProxies.deleteFlight(id);
	}

	@DeleteMapping("/journeys/{id}")
	public void deleteJourney(@PathVariable("id") Long id) {
		msJourneyProxies.deleteFlight(id);
	}

	@DeleteMapping("/TrainRides/{id}")
	public void deleteTrainRide(@PathVariable("id") Long id) {
		msJourneyProxies.deleteFlight(id);
	}

	@DeleteMapping("/RiverCruises/{id}")
	public void deleteRiverCruise(@PathVariable("id") Long id) {
		msJourneyProxies.deleteFlight(id);
	}
	
	
	//OperatingController
	
	@GetMapping("/operatings")
	public List<OperatingBean> findAllOperationg() {
		return msOperatingProxies.findAllOperating();
	}
	
	@GetMapping("/operatings/{idOperating}")
	public OperatingBean findOneOperating(@PathParam("idOperating") Long id) {
		return msOperatingProxies.findOneOperating(id);
	}
	
	@PostMapping("/operatings")
	public OperatingBean save(@RequestBody OperatingBean operating) {
		return msOperatingProxies.saveOperating(operating);
	}

	@DeleteMapping("/operatings/{idOperating}")
	public void deleteOperating(@PathParam("idOperating") Long id) {
		msOperatingProxies.deleteOperating(id);
	}
	
	@PutMapping(value = "/operatings/{oId}")
	public OperatingBean updateOperating(@PathVariable(value = "id") Long id, @RequestBody OperatingBean operating) {
		return msOperatingProxies.updateOperating(id, operating);
	}
	
	//LocationController
	
	@GetMapping("/locations")
	public List<LocationBean> findAllLocation() {
		return msLocationProxies.findAllLocation();
	}
	
	@GetMapping("/locations/{idLocation}")
	public LocationBean findOneLocation(@PathParam("idLocation") Long id) {
		return msLocationProxies.findOneLocation(id);
	}
	
	@PostMapping("/locations")
	public LocationBean save(@RequestBody LocationBean location) {
		return msLocationProxies.saveLocation(location);
	}

	@DeleteMapping("/locations/{idLocation}")
	public void deleteLocation(@PathParam("idLocation") Long id) {
		msLocationProxies.deleteLocation(id);
	}
	
	@PutMapping(value = "/locations/{lId}")
	public LocationBean updateLocation(@PathVariable(value = "id") Long id, @RequestBody LocationBean location) {
		return msLocationProxies.updateLocation(id, location);
	}
	
	//CustomerController
	
	@GetMapping(value = "/customers")
	public List<CustomerBean> getAll() {
		return msCustomerProxies.getAll();
	}

	@GetMapping(value = "/customers/{cId}")
	public CustomerBean findOne(@PathVariable(value = "cId") Long id) {
		return msCustomerProxies.findOne(id);
	}

	@PostMapping(value = "/customers")
	public CustomerBean create(@RequestBody CustomerBean cIn) {
		return msCustomerProxies.create(cIn);
	}

	@DeleteMapping(value = "/customers/{cId}")
	public void delete(@PathVariable(value = "cId") Long id) {
		msCustomerProxies.delete(id);
	}

	@PutMapping(value = "/customers/{cId}")
	public CustomerBean update(@PathVariable(value = "cId") Long id, @RequestBody CustomerBean cIn) {
		return msCustomerProxies.update(id, cIn);
	}
}
