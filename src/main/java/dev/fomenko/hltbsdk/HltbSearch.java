package dev.fomenko.hltbsdk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.fomenko.hltbsdk.model.HltbGame;
import dev.fomenko.hltbsdk.model.HltbSearchResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import lombok.RequiredArgsConstructor;
import org.apache.http.HttpHeaders;

import java.util.ArrayList;
import java.util.List;

public class HltbSearch {
    private final ObjectMapper om;

    public HltbSearch(ObjectMapper om) {
        this.om = om;
    }

    public HltbSearch() {
        this(new ObjectMapper());
    }

    private static final String BASE_URL = "https://howlongtobeat.com/";
    private static final String SEARCH_URL = BASE_URL + "api/search";

    public List<HltbGame> search(List<String> query) {
        List<String> searchTerms = new ArrayList<>(query);

        var body = new JSONObject("""
                {
                       "searchType": "games",
                       "searchTerms": [
                          
                       ],
                       "searchPage": 1,
                       "size": 20,
                       "searchOptions": {
                           "games": {
                               "userId": 0,
                               "platform": "",
                               "sortCategory": "popular",
                               "rangeCategory": "main",
                               "rangeTime": {
                                   "min": 0,
                                   "max": 0
                               },
                               "gameplay": {
                                   "perspective": "",
                                   "flow": "",
                                   "genre": ""
                               },
                               "modifier": ""
                           },
                           "users": {
                               "sortCategory": "postcount"
                           },
                           "filter": "",
                           "sort": 0,
                           "randomizer": 0
                       }
                   }
                """);

        body.getJSONArray("searchTerms").put(searchTerms);

        var response = Unirest.post(SEARCH_URL)
                .body(body)
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .header(HttpHeaders.REFERER, BASE_URL)
                .asString();

        try {
            return om.readValue(response.getBody(), HltbSearchResponse.class).getData();
        } catch (JsonProcessingException e) {
            throw new HtlbSearchException("Failed to parse response", e);
        }

    }

    public List<HltbGame> search(String query) {
        return search(List.of(query));
    }
}
