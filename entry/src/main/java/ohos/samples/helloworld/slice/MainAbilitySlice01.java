package ohos.samples.helloworld.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.samples.helloworld.ResourceTable;

import static ohos.hiviewdfx.HiLog.LOG_APP;

/**
 * MainAbilitySlice01
 */
public class MainAbilitySlice01 extends AbilitySlice {

    static HiLogLabel LABEL = new HiLogLabel(LOG_APP, 0x00201, "MainAbilitySlice01");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_main_ability_slice01);
        initComponents();

        HiLog.info(LABEL, "MainAbilitySlice01 onStart");
    }

    private void initComponents() {
        Button button = (Button) findComponentById(ResourceTable.Id_button);
        button.setClickedListener(listener -> present(new MainAbilitySlice02(), new Intent()));
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
        HiLog.info(LABEL, "MainAbilitySlice01 onForeground");
    }

    @Override
    protected void onActive() {
        super.onActive();
        HiLog.info(LABEL, "MainAbilitySlice01 onActive");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        HiLog.info(LABEL, "MainAbilitySlice01 onInactive");
    }

    @Override
    protected void onBackground() {
        super.onBackground();
        HiLog.info(LABEL, "MainAbilitySlice01 onBackground");
    }

    @Override
    protected void onStop() {
        super.onStop();
        HiLog.info(LABEL, "MainAbilitySlice01 onStop");
    }

}


