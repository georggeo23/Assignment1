package sheridan.georggeo.Assignment1.controller;

import sheridan.georggeo.Assignment1.model.Gifts;
import sheridan.georggeo.Assignment1.model.GiftBox;
import sheridan.georggeo.Assignment1.service.GameService;
import sheridan.georggeo.Assignment1.model.GameData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {
    private final Logger log = LoggerFactory.getLogger(GameController.class);

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }


    @GetMapping(value = {"/", "/input"})
    public String input(){
        log.trace("input() is called");
        return "Input";
    }

    @GetMapping("/play")
    public ModelAndView play(@RequestParam GiftBox userChoice){
        log.trace("play() is called");
        log.debug("userChoice = " + userChoice);
        Gifts chestItem = gameService.getRandomItem();
        log.debug("Chest Item = " + chestItem);
        GameData gameData = gameService.getGameData(userChoice, chestItem);
        log.debug("gameData = " + gameData);
        return new ModelAndView("Output", "gameData", gameData);
    }
}
