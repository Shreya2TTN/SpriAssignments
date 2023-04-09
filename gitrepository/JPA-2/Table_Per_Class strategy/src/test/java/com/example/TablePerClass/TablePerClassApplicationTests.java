package com.example.TablePerClass;

import com.example.TablePerClass.Entity.Cheque;
import com.example.TablePerClass.Entity.CreditCard;
import com.example.TablePerClass.Entity.Mobile;
import com.example.TablePerClass.Repository.MobileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TablePerClassApplicationTests {
	@Autowired
	MobileRepository mobileRepository;

	@Test
	void testTablePerClass(){
		Cheque ch=new Cheque();
		ch.setModel("realmi 9");
		ch.setPrice(15000);
		ch.setChequeNumber("232343454");
		mobileRepository.save(ch);
		CreditCard cc=new CreditCard();
		cc.setModel("poco m4");
		cc.setPrice(24000);
		cc.setCcNumber("242353454");
		mobileRepository.save(cc);
	}
}
