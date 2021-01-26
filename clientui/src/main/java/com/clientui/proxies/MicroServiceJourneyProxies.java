package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.FlightBean;
import com.clientui.beans.JourneyBean;
import com.clientui.beans.RiverCruiseBean;
import com.clientui.beans.TrainRideBean;

@FeignClient(name = "microservice-journey")
@RibbonClient(name = "microservice-journey")
public interface MicroServiceJourneyProxies {

	@GetMapping("/Flights")
	public List<FlightBean> findAllFlight();

	@GetMapping("/Flights/{id}")
	public FlightBean findOneFlight(@PathVariable("id") Long id);

	@GetMapping("/journeys")
	public List<JourneyBean> findAllJourney();

	@GetMapping("/journeys/{id}")
	public JourneyBean findOneJourney(@PathVariable("id") Long id);

	@GetMapping("/TrainRides")
	public List<TrainRideBean> findAllTrainRides();

	@GetMapping("/TrainRides/{id}")
	public TrainRideBean findOneTrainRides(@PathVariable("id") Long id);

	@GetMapping("/RiverCruises")
	public List<RiverCruiseBean> findAllRiverCruise();

	@GetMapping("/RiverCruises/{id}")
	public RiverCruiseBean findOneRiverCruise(@PathVariable("id") Long id);

	@PostMapping("/Flights")
	public FlightBean saveFlight(@RequestBody FlightBean Flight);

	@PostMapping("/Journeys")
	public JourneyBean saveJourney(@RequestBody JourneyBean Journey);

	@PostMapping("/TrainRides")
	public TrainRideBean saveTrainRide(@RequestBody TrainRideBean TrainRide);

	@PostMapping("/RiverCruises")
	public RiverCruiseBean saveRiverCruise(@RequestBody RiverCruiseBean RiverCruise);

	@DeleteMapping("/Flights/{id}")
	public void deleteFlight(@PathVariable("id") Long id);

	@DeleteMapping("/journeys/{id}")
	public void deleteJourney(@PathVariable("id") Long id);

	@DeleteMapping("/TrainRides/{id}")
	public void deleteTrainRide(@PathVariable("id") Long id);

	@DeleteMapping("/RiverCruises/{id}")
	public void deleteRiverCruise(@PathVariable("id") Long id);
}
