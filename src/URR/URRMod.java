package URR;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;


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
