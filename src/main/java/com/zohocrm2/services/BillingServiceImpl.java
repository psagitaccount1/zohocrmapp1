package com.zohocrm2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm2.entities.Billing;
import com.zohocrm2.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billingRepo;
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);

	}

}
