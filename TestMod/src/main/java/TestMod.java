// same with project name
import basemod.BaseMod;
import basemod.interfaces.PostBattleSubscriber;
import basemod.interfaces.PostDungeonInitializeSubscriber;
import basemod.interfaces.PostExhaustSubscriber;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.rooms.AbstractRoom;
@SpireInitializer
public class TestMod implements PostBattleSubscriber,
        PostDungeonInitializeSubscriber, PostExhaustSubscriber {

    @java.lang.Override
    public void receivePostBattle(AbstractRoom abstractRoom) {

    }

    @java.lang.Override
    public void receivePostDungeonInitialize() {

    }

    @java.lang.Override
    public void receivePostExhaust(AbstractCard abstractCard) {

    }
}

