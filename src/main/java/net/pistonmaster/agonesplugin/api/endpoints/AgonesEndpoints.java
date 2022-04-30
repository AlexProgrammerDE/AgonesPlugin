package net.pistonmaster.agonesplugin.api.endpoints;

import net.pistonmaster.agonesplugin.api.model.GameServer;
import net.pistonmaster.agonesplugin.api.model.request.Empty;
import net.pistonmaster.agonesplugin.api.model.request.LabelOrAnnotation;
import net.pistonmaster.agonesplugin.api.model.request.Reservation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AgonesEndpoints extends Endpoints {

    @POST("/ready")
    Void ready();

    @POST("/health")
    Void health(@Body Empty empty);

    @POST("/reserve")
    Void reserve(@Body Reservation request);

    @POST("/allocate")
    Void allocate();

    @POST("/shutdown")
    Void shutdown();

    @GET("/gameserver")
    GameServer gameServer();

    @POST("/metadata/label")
    Void label(@Body LabelOrAnnotation label);

    @POST("/metadata/annotation")
    Void annotation(@Body LabelOrAnnotation annotation);

}
