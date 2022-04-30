package net.pistonmaster.agonesplugin.api.endpoints;

import net.pistonmaster.agonesplugin.api.model.request.BoolResponse;
import net.pistonmaster.agonesplugin.api.model.request.PlayerCount;
import net.pistonmaster.agonesplugin.api.model.request.PlayerInfo;
import net.pistonmaster.agonesplugin.api.model.request.PlayerList;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AlphaEndpoints extends Endpoints {

    @POST("/alpha/player/connect")
    BoolResponse playerConnect(@Body PlayerInfo info);

    @POST("/alpha/player/disconnect")
    BoolResponse playerDisconnect(@Body PlayerInfo info);

    @GET("/alpha/player/connected")
    PlayerList getConnectedPlayers();

    @GET("/alpha/player/connected/{player}")
    BoolResponse isPlayerConnected(@Path("player") String playerId);

    @GET("/alpha/player/capacity")
    PlayerCount getPlayerCount();

    @GET("/alpha/player/capacity")
    PlayerCount getPlayerCapacity();

    @POST("/alpha/player/capacity")
    Void setPlayerCapacity(@Body PlayerCount count);

}
