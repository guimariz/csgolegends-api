package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.ProPlayerModel;
import model.ProPlayerStatsModel;

@RestController
@RequestMapping(value="/proplayer")
public class ProPlayerController {
	
	@GetMapping(value="/listar-todos")
	public List<ProPlayerModel> getProPlayerList() {
		
		ProPlayerModel proPlayer = new ProPlayerModel("Fallen", new ProPlayerStatsModel(10, 20));
		
		return Arrays.asList(proPlayer, proPlayer, proPlayer);
	}

}
