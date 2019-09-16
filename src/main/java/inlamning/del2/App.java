package inlamning.del2;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import hello.wsdl.FullCountryInfoResponse;

@SpringBootApplication
public class App 
{
// För att kunna köra Spring
	public static void main( String[] args ) 
    {
		SpringApplication.run(App.class,args);

		
    	
    }
	
	@Bean
	CommandLineRunner lookup(Del_C quoteClient) {
		return args -> {
		
			//Input värdet för vilket land
			System.out.println("Ange landets ISO Kod: ");
			Scanner input = new Scanner(System.in);
			String country = input.nextLine();
		
			// Output för det sökande land samt huvudstand och valuta
			FullCountryInfoResponse response = quoteClient.getCountryFull(country);
			System.err.println(
				"Land : " +	response.getFullCountryInfoResult().getSName() +"\n" +
				"Huvudstad : " +	response.getFullCountryInfoResult().getSCapitalCity() +"\n"+
				 "Valuta : " +	response.getFullCountryInfoResult().getSCurrencyISOCode()
					
					);
			input.close();
		};
	}

}
