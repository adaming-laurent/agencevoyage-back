package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.OperatingCompanyBean;
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
	public List<FlightBean> findAllFlight(){
		return microServiceReclamationProxies.findAllFlight();
	}
	
	@GetMapping("/Flights/{id}")
	public FlightBean findOneFlight(@PathVariable("id") Long id){
		return microServiceReclamationProxies.findOneFlight(id);
	}
	
	@GetMapping("/journeys")
	public List<JourneyBean> findAllJourney(){
		return microServiceReclamationProxies.findAllJourney();
	}	
	
	@GetMapping("/journeys/{id}")
	public JourneyBean findOneJourney(@PathVariable("id") Long id){
		return microServiceReclamationProxies.findOneJourney(id);
	}
	
	@GetMapping("/TrainRides")
	public List<TrainRideBean> findAllTrainRides(){
		return microServiceReclamationProxies.findAllTrainRides();
	}
	
	@GetMapping("/TrainRides/{id}")
	public TrainRideBean findOneTrainRides(@PathVariable("id") Long id){
		return microServiceReclamationProxies.findOneTrainRides(id);
	}
	
	@GetMapping("/RiverCruises")
	public List<RiverCruiseBean> findAllRiverCruise(){
		return microServiceReclamationProxies.findAllRiverCruise();
	}		
	
	@GetMapping("/RiverCruises/{id}")
	public RiverCruiseBean findOneRiverCruise(@PathVariable("id") Long id){
		return microServiceReclamationProxies.findOneRiverCruise(id);
	}
	
	
	@PostMapping("/Flights")
	public FlightBean saveFlight(@RequestBody FlightBean Flight) {
		return microServiceReclamationProxies.saveFlight(Flight);
	}
	
	@PostMapping("/Journeys")
	public JourneyBean saveJourney(@RequestBody JourneyBean Journey) {
		return microServiceReclamationProxies.saveJourney(Journey);
	}
	
	@PostMapping("/TrainRides")
	public TrainRideBean saveTrainRide(@RequestBody TrainRideBean TrainRide) {
		return microServiceReclamationProxies.saveTrainRide(TrainRide);
	}
	
	@PostMapping("/RiverCruises")
	public RiverCruiseBean saveRiverCruise(@RequestBody RiverCruiseBean RiverCruise) {
		return microServiceReclamationProxies.saveRiverCruise(RiverCruise);
	}
	
	@DeleteMapping("/Flights/{id}")
	public void deleteFlight(@PathVariable("id") Long id) {
		microServiceReclamationProxies.deleteFlight(id);
	}
		
	@DeleteMapping("/journeys/{id}")
	public void deleteJourney(@PathVariable("id") Long id) {
		microServiceReclamationProxies.deleteFlight(id);
	}
	
	@DeleteMapping("/TrainRides/{id}")
	public void deleteTrainRide(@PathVariable("id") Long id) {
		microServiceReclamationProxies.deleteFlight(id);
	}
	
	@DeleteMapping("/RiverCruises/{id}")
	public void deleteRiverCruise(@PathVariable("id") Long id) {
		microServiceReclamationProxies.deleteFlight(id);
	}
}
