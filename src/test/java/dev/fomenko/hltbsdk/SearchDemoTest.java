package dev.fomenko.hltbsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.fomenko.hltbsdk.model.HltbGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

class SearchDemoTest {

    @Test
    @Disabled
    void searchDemo() {

        var test = new HltbSearch(new ObjectMapper());

        var games = test.search(List.of("red dead"));
        System.out.println(games);
        Assertions.assertTrue(names(games).contains("Red Dead Redemption 2"));


        games = test.search(List.of("god of war"));
        System.out.println(games);
        Assertions.assertTrue(names(games).contains("God of War: Ragnarök"));

        games = test.search(List.of("star wars"));
        System.out.println(games);
        Assertions.assertTrue(names(games).contains("Star Wars Jedi: Fallen Order"));
    }

    private List<String> names(List<HltbGame> games) {
        return games.stream().map(HltbGame::getGameName).toList();
    }

}