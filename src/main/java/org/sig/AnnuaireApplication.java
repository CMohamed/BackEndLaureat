package org.sig;

import java.util.Date;

import org.sig.Entity.Laureat;
import org.sig.dao.LaureatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnuaireApplication implements CommandLineRunner {
	@Autowired
	private LaureatRepository laureatRepository ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AnnuaireApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// laureatRepository.save(new Laureat("CHADAD", "med", "m", "0672078647", "chadad.mohamed@gmail.com", "2019", "SIG", "Lydec", 12.5, 10.87, 1, "prive", new Date(), "Debutant", "Guelmim"));
		// laureatRepository.save(new Laureat("nom","mm","m","05","rachid@","1998","gc","walo", 14, 15, 0, "public",new Date(), "professionel", "casa"));
		// laureatRepository.save(new Laureat("DAD", "med", "m", "0672047", "chadad.mohamed@gil.com", "2022", "SIG", "Lydec", 12.5, 10.87, 1, "prive", new Date(), "Dent", "Gue"));
		
		laureatRepository.findAll().forEach(l->{
			System.out.println(l.getName());
		});
	}
}
