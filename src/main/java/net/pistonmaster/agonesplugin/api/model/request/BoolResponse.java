package net.pistonmaster.agonesplugin.api.model.request;

public final class BoolResponse {

    private final boolean bool;

    public BoolResponse(boolean bool) {
        this.bool = bool;
    }

    public boolean value() {
        return bool;
    }
}
