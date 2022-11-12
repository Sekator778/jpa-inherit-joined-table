package com.sekator.jpainheritjoinedtable;

import com.sekator.jpainheritjoinedtable.model.Archer;
import com.sekator.jpainheritjoinedtable.model.Infantry;
import com.sekator.jpainheritjoinedtable.model.InfantryType;
import com.sekator.jpainheritjoinedtable.model.Knight;
import com.sekator.jpainheritjoinedtable.repository.ArcherRepository;
import com.sekator.jpainheritjoinedtable.repository.InfantryRepository;
import com.sekator.jpainheritjoinedtable.repository.KnightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaInheritJoinedTableApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JpaInheritJoinedTableApplication.class, args);
		InfantryRepository archerRepository =
				configurableApplicationContext.getBean(ArcherRepository.class);
		InfantryRepository knightRepository =
				configurableApplicationContext.getBean(KnightRepository.class);

		Infantry archer = new Archer(InfantryType.LIGHT, 300, 500, 100, 1000);
		Infantry knight = new Knight(InfantryType.HEAVY, 280, 1000, 300, true);

		archerRepository.save(archer);
		knightRepository.save(knight);

		knightRepository.delete(knight);

	}

}
