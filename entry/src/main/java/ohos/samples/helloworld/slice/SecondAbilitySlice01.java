package ohos.samples.helloworld.slice;

import ohos.agp.components.Button;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.samples.helloworld.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

import static ohos.hiviewdfx.HiLog.LOG_APP;

/**
 * SecondAbilitySlice01
 */
public class SecondAbilitySlice01 extends AbilitySlice {

    static final HiLogLabel LABEL = new HiLogLabel(LOG_APP, 0x00201, "SecondAbilitySlice01");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_second_ability_slice01);
        initComponents();

        HiLog.info(LABEL, "SecondAbilitySlice01 onStart");
    }

    private void initComponents() {
        Button button = (Button) findComponentById(ResourceTable.Id_button);
        button.setClickedListener(listener -> present(new SecondAbilitySlice02(), new Intent()));
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
        HiLog.info(LABEL, "SecondAbilitySlice01 onForeground");
    }

    @Override
    protected void onActive() {
        super.onActive();
        HiLog.info(LABEL, "SecondAbilitySlice01 onActive");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        HiLog.info(LABEL, "SecondAbilitySlice01 onInactive");
    }

    @Override
    protected void onBackground() {
        super.onBackground();
        HiLog.info(LABEL, "SecondAbilitySlice01 onBackground");
    }

    @Override
    protected void onStop() {
        super.onStop();
        HiLog.info(LABEL, "SecondAbilitySlice01 onStop");
    }

}
