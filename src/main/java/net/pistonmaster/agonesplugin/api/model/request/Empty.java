package net.pistonmaster.agonesplugin.api.model.request;

public class Empty {

    private static final Empty INSTANCE = new Empty();

    private Empty() {
    }

    public static Empty empty() {
        return INSTANCE;
    }
}
