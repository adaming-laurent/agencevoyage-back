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

	@GetMapping("/flights")
	public List<FlightBean> findAllFlight();

	@GetMapping("/flights/{id}")
	public FlightBean findOneFlight(@PathVariable("id") Long id);

	@GetMapping("/journeys")
	public List<JourneyBean> findAllJourney();

	@GetMapping("/journeys/{id}")
	public JourneyBean findOneJourney(@PathVariable("id") Long id);

	@GetMapping("/trainRides")
	public List<TrainRideBean> findAllTrainRides();

	@GetMapping("/trainRides/{id}")
	public TrainRideBean findOneTrainRides(@PathVariable("id") Long id);

	@GetMapping("/riverCruises")
	public List<RiverCruiseBean> findAllRiverCruise();

	@GetMapping("/riverCruises/{id}")
	public RiverCruiseBean findOneRiverCruise(@PathVariable("id") Long id);

	@PostMapping("/flights")
	public FlightBean saveFlight(@RequestBody FlightBean Flight);

	@PostMapping("/journeys")
	public JourneyBean saveJourney(@RequestBody JourneyBean Journey);

	@PostMapping("/trainRides")
	public TrainRideBean saveTrainRide(@RequestBody TrainRideBean TrainRide);

	@PostMapping("/riverCruises")
	public RiverCruiseBean saveRiverCruise(@RequestBody RiverCruiseBean RiverCruise);

	@DeleteMapping("/flights/{id}")
	public void deleteFlight(@PathVariable("id") Long id);

	@DeleteMapping("/journeys/{id}")
	public void deleteJourney(@PathVariable("id") Long id);

	@DeleteMapping("/trainRides/{id}")
	public void deleteTrainRide(@PathVariable("id") Long id);

	@DeleteMapping("/riverCruises/{id}")
	public void deleteRiverCruise(@PathVariable("id") Long id);

	@GetMapping("/journeys/location/{locCode}")
	public List<JourneyBean> findByDestinationLocationCode(@PathVariable("locCode") String destinationLocationCode);

	@GetMapping("/journeys/company/{idCompany}")
	public List<JourneyBean> findByOperatingCompanyid(@PathVariable("idCompany") Long operatingCompanyid);
}
