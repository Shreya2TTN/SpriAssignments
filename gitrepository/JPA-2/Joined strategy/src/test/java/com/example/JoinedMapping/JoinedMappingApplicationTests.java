package com.example.JoinedMapping;

import com.example.JoinedMapping.Entity.Cheque;
import com.example.JoinedMapping.Entity.CreditCard;
import com.example.JoinedMapping.Repository.MobileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JoinedMappingApplicationTests {
	@Autowired
	MobileRepository mobileRepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void testCreate(){
		Cheque cheque=new Cheque();
		cheque.setChequeNumber("21423345");
		cheque.setModel("Readmi 9");
		cheque.setPrice(9999);
		mobileRepository.save(cheque);

		CreditCard creditCard=new CreditCard();
		creditCard.setCcNumber("24345436");
		creditCard.setModel("Realmi 5");
		creditCard.setPrice(7897);
		mobileRepository.save(creditCard);
	}

}
