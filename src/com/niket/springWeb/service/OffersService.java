package com.niket.springWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niket.springWeb.dao.OffersDao;
import com.niket.springWeb.entity.Offer;

@Service
public class OffersService {

	OffersDao odao ;
	
	
	
	
	public OffersDao getOdao() {
		return odao;
	}



	@Autowired
	public void setOdao(OffersDao odao) {
		this.odao = odao;
	}

	public List<Offer> getAllOffers(){
		return odao.getAllOffers();
	}


	public OffersService(){
		System.out.println("hello World ");
	}
	
	
}
