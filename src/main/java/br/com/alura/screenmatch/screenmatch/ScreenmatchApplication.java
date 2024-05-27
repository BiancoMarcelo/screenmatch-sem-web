package br.com.alura.screenmatch.screenmatch;

import br.com.alura.screenmatch.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner { //aplicação de linha de comando precisa do implements (implementa a interface de comandos, permite que eu crie dentro do método principal as chamadas
// se é uma interface eu tenho um contrato, preciso implementar os métodos que nesse caso é o run
	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { // isso aqui significa que quando eu chamar o SpingApplication.run, ele vai rodar o que estiver dentro desse método, isso aqui vira o main
		var consumoApi = new ConsumoApi(); // isso é instanciar a classe consumo Api
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=the+boys&apikey=476f28e5");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}


}
