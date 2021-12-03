package edu.isu.cs.cs2263.hw02.views;

import edu.isu.cs.cs2263.hw02.App;
import javafx.scene.Node;
import lombok.Getter;
import lombok.Setter;

public abstract class AppView implements IAppView {

    @Getter @Setter
    protected Node view;
    protected App parent;

    public AppView(App parent) {
        this.parent = parent;
        initView();
    }
}
