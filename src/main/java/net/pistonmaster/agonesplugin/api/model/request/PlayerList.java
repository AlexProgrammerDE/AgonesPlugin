package net.pistonmaster.agonesplugin.api.model.request;

import java.util.List;

public final class PlayerList {

    private final List<String> list;

    public PlayerList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }
}
