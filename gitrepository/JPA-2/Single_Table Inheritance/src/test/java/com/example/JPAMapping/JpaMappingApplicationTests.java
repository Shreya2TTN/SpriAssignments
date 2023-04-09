package com.example.JPAMapping;

import com.example.JPAMapping.Entity.Cheque;
import com.example.JPAMapping.Entity.CreditCard;
import com.example.JPAMapping.Entity.Mobile;
import com.example.JPAMapping.Repository.MobileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaMappingApplicationTests {
	@Autowired
	MobileRepository mobileRepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void testCreate(){
		CreditCard creditCard=new CreditCard();
		creditCard.setCcNumber("2321425");
		creditCard.setPrice(7534);
		creditCard.setModel("Realme 4");
		mobileRepository.save(creditCard);

		Cheque cheque=new Cheque();
		cheque.setChequeNumber("34434");
		cheque.setModel("Redmi 9");
		cheque.setPrice(9545);
		mobileRepository.save(cheque);

	}

}
