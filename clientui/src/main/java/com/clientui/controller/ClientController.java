package com.clientui.controller;

import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
=======
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.FlightBean;
import com.clientui.beans.JourneyBean;
import com.clientui.beans.OperatingCompanyBean;
import com.clientui.beans.RiverCruiseBean;
import com.clientui.beans.TrainRideBean;
import com.clientui.proxies.MicroServiceJourneyProxies;
import com.clientui.proxies.MicroServiceOperatingCompanyProxies;

@Controller
public class ClientController {
	@Autowired
	private MicroServiceOperatingCompanyProxies microServiceOperatingCompanyProxies;

	@Autowired
	private MicroServiceJourneyProxies microServiceReclamationProxies;

	@RequestMapping("/operating")
	public String operatingAccueil(Model model) {
		List<OperatingCompanyBean> operatings = microServiceOperatingCompanyProxies.findAll();
		model.addAttribute("operatings", operatings);
		return "Operating";
	}

	@GetMapping("/Flights")
	public List<FlightBean> findAllFlight() {
		return microServiceReclamationProxies.findAllFlight();
=======
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientui.beans.CustomerBean;
import com.clientui.beans.FlightBean;
import com.clientui.beans.JourneyBean;
import com.clientui.beans.OperatingBean;
import com.clientui.beans.RiverCruiseBean;
import com.clientui.beans.TrainRideBean;
import com.clientui.proxies.MicroServiceCustomerProxies;
import com.clientui.proxies.MicroServiceJourneyProxies;
import com.clientui.proxies.MicroServiceOperatingProxies;

@RestController
@CrossOrigin
public class ClientController {
	@Autowired
	private MicroServiceOperatingProxies msOperatingProxies;

	@Autowired
	private MicroServiceJourneyProxies msJourneyProxies;
	
	@Autowired
	private MicroServiceCustomerProxies msCustomerProxies;

	
	//JourneyController
	
	@GetMapping("/Flights")
	public List<FlightBean> findAllFlight() {
		return msJourneyProxies.findAllFlight();
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@GetMapping("/Flights/{id}")
	public FlightBean findOneFlight(@PathVariable("id") Long id) {
<<<<<<< HEAD
		return microServiceReclamationProxies.findOneFlight(id);
=======
		return msJourneyProxies.findOneFlight(id);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@GetMapping("/journeys")
	public List<JourneyBean> findAllJourney() {
<<<<<<< HEAD
		return microServiceReclamationProxies.findAllJourney();
=======
		return msJourneyProxies.findAllJourney();
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@GetMapping("/journeys/{id}")
	public JourneyBean findOneJourney(@PathVariable("id") Long id) {
<<<<<<< HEAD
		return microServiceReclamationProxies.findOneJourney(id);
=======
		return msJourneyProxies.findOneJourney(id);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@GetMapping("/TrainRides")
	public List<TrainRideBean> findAllTrainRides() {
<<<<<<< HEAD
		return microServiceReclamationProxies.findAllTrainRides();
=======
		return msJourneyProxies.findAllTrainRides();
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@GetMapping("/TrainRides/{id}")
	public TrainRideBean findOneTrainRides(@PathVariable("id") Long id) {
<<<<<<< HEAD
		return microServiceReclamationProxies.findOneTrainRides(id);
=======
		return msJourneyProxies.findOneTrainRides(id);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@GetMapping("/RiverCruises")
	public List<RiverCruiseBean> findAllRiverCruise() {
<<<<<<< HEAD
		return microServiceReclamationProxies.findAllRiverCruise();
=======
		return msJourneyProxies.findAllRiverCruise();
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@GetMapping("/RiverCruises/{id}")
	public RiverCruiseBean findOneRiverCruise(@PathVariable("id") Long id) {
<<<<<<< HEAD
		return microServiceReclamationProxies.findOneRiverCruise(id);
=======
		return msJourneyProxies.findOneRiverCruise(id);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@PostMapping("/Flights")
	public FlightBean saveFlight(@RequestBody FlightBean Flight) {
<<<<<<< HEAD
		return microServiceReclamationProxies.saveFlight(Flight);
=======
		return msJourneyProxies.saveFlight(Flight);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@PostMapping("/Journeys")
	public JourneyBean saveJourney(@RequestBody JourneyBean Journey) {
<<<<<<< HEAD
		return microServiceReclamationProxies.saveJourney(Journey);
=======
		return msJourneyProxies.saveJourney(Journey);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@PostMapping("/TrainRides")
	public TrainRideBean saveTrainRide(@RequestBody TrainRideBean TrainRide) {
<<<<<<< HEAD
		return microServiceReclamationProxies.saveTrainRide(TrainRide);
=======
		return msJourneyProxies.saveTrainRide(TrainRide);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@PostMapping("/RiverCruises")
	public RiverCruiseBean saveRiverCruise(@RequestBody RiverCruiseBean RiverCruise) {
<<<<<<< HEAD
		return microServiceReclamationProxies.saveRiverCruise(RiverCruise);
=======
		return msJourneyProxies.saveRiverCruise(RiverCruise);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@DeleteMapping("/Flights/{id}")
	public void deleteFlight(@PathVariable("id") Long id) {
<<<<<<< HEAD
		microServiceReclamationProxies.deleteFlight(id);
=======
		msJourneyProxies.deleteFlight(id);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@DeleteMapping("/journeys/{id}")
	public void deleteJourney(@PathVariable("id") Long id) {
<<<<<<< HEAD
		microServiceReclamationProxies.deleteFlight(id);
=======
		msJourneyProxies.deleteFlight(id);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@DeleteMapping("/TrainRides/{id}")
	public void deleteTrainRide(@PathVariable("id") Long id) {
<<<<<<< HEAD
		microServiceReclamationProxies.deleteFlight(id);
=======
		msJourneyProxies.deleteFlight(id);
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}

	@DeleteMapping("/RiverCruises/{id}")
	public void deleteRiverCruise(@PathVariable("id") Long id) {
<<<<<<< HEAD
		microServiceReclamationProxies.deleteFlight(id);
=======
		msJourneyProxies.deleteFlight(id);
	}
	
	
	//OperatingController
	
	@GetMapping("/operatings")
	public List<OperatingBean> findAll() {
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
>>>>>>> 7d380f847524cbe299c6e9bd017a43ea876dc044
	}
}
