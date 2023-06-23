package dev.fomenko.hltbsdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HltbGame {
    private int count;
    @JsonProperty("game_id")
    private int gameId;
    @JsonProperty("game_name")
    private String gameName;
    @JsonProperty("game_name_date")
    private int gameNameDate;
    @JsonProperty("game_alias")
    private String gameAlias;
    @JsonProperty("game_type")
    private String gameType;
    @JsonProperty("game_image")
    private String gameImage;
    @JsonProperty("comp_lvl_combine")
    private int compLvlCombine;
    @JsonProperty("comp_lvl_sp")
    private int compLvlSp;
    @JsonProperty("comp_lvl_co")
    private int compLvlCo;
    @JsonProperty("comp_lvl_mp")
    private int compLvlMp;
    @JsonProperty("comp_lvl_spd")
    private int compLvlSpd;
    @JsonProperty("comp_main")
    private int compMain;
    @JsonProperty("comp_plus")
    private int compPlus;
    @JsonProperty("comp_100")
    private int comp100;
    @JsonProperty("comp_all")
    private int compAll;
    @JsonProperty("comp_main_count")
    private int compMainCount;
    @JsonProperty("comp_plus_count")
    private int compPlusCount;
    @JsonProperty("comp_100_count")
    private int comp100Count;
    @JsonProperty("comp_all_count")
    private int compAllCount;
    @JsonProperty("invested_co")
    private int investedCo;
    @JsonProperty("invested_mp")
    private int investedMp;
    @JsonProperty("invested_co_count")
    private int investedCoCount;
    @JsonProperty("invested_mp_count")
    private int investedMpCount;
    @JsonProperty("count_comp")
    private int countComp;
    @JsonProperty("count_speedrun")
    private int countSpeedrun;
    @JsonProperty("count_backlog")
    private int countBacklog;
    @JsonProperty("count_review")
    private int countReview;
    @JsonProperty("review_score")
    private int reviewScore;
    @JsonProperty("count_playing")
    private int countPlaying;
    @JsonProperty("count_retired")
    private int countRetired;
    @JsonProperty("profile_dev")
    private String profileDev;
    @JsonProperty("profile_popular")
    private int profilePopular;
    @JsonProperty("profile_steam")
    private int profileSteam;
    @JsonProperty("profile_platform")
    private String profilePlatform;
    @JsonProperty("release_world")
    private int releaseWorld;
}
