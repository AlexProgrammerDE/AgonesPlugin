package net.pistonmaster.agonesplugin.api.model.request;

public final class PlayerInfo {

    private final String playerID;

    public PlayerInfo(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerID() {
        return playerID;
    }
}
