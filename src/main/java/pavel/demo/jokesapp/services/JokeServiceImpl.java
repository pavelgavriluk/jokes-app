package pavel.demo.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.Setter;

@Service
@Setter
public class JokeServiceImpl implements JokeService{

	// fields
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	// constructors
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke(){
		return chuckNorrisQuotes.getRandomQuote();
	}



}
