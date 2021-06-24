package ohos.samples.helloworld;

import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.samples.helloworld.slice.SecondAbilitySlice01;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

import static ohos.hiviewdfx.HiLog.LOG_APP;

public class SecondAbility extends Ability {

    static HiLogLabel LABEL = new HiLogLabel(LOG_APP, 0x00201, "SecondAbility");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(SecondAbilitySlice01.class.getName());

        HiLog.info(LABEL, "SecondAbility onStart");
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
        HiLog.info(LABEL, "SecondAbility onForeground");
    }

    @Override
    protected void onActive() {
        super.onActive();
        HiLog.info(LABEL, "SecondAbility onActive");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        HiLog.info(LABEL, "SecondAbility onInactive");
    }

    @Override
    protected void onBackground() {
        super.onBackground();
        HiLog.info(LABEL, "SecondAbility onBackground");
    }

    @Override
    protected void onStop() {
        super.onStop();
        HiLog.info(LABEL, "SecondAbility onStop");
    }


}
