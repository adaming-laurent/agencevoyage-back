package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.OperatingCompanyBean;

@FeignClient(name = "microservice-operating", url = "localhost:9093/")
public interface MicroServiceOperatingCompanyProxies {
	@GetMapping(value="/operating")
	List<OperatingCompanyBean> findAll();
}
