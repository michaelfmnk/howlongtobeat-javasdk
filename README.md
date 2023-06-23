# Howlongtobeat Java SDK

This is a Java library that provides a convenient way to search for games using the HowLongToBeat (HLTB) API. 


## Usage

```java
var hltb = new HltbSearch();
var games = test.search(List.of("red dead"));
for (HltbGame game : games) {
    System.out.println(game.getGameName() + " " + game.getCompAll());
}
```

## Contribution

Contributions are welcome. If you find a bug or have an idea for a new feature, please open an issue or a pull request on the GitHub repository.