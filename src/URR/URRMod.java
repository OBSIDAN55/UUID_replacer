package URR;

import arc.*;
import arc.scene.ui.Dialog;
import arc.util.*;
import mindustry.*;
import mindustry.game.EventType.*;
import mindustry.gen.Call;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ListFormat;

public class URRMod extends Mod {

    public URRMod(){
        Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> {
                Core.settings.put("uuid","");
                BaseDialog dialog = new BaseDialog("UUID");
                dialog.cont.add("UUID has been replaced on random generated. generated UUID: "+Vars.platform.getUUID()).row();
                dialog.cont.button("OK", dialog::hide).size(100f, 50f);
                dialog.show();
            });

        });
    }
}
