package ohos.samples.helloworld.slice;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;
import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_PARENT;
import static ohos.hiviewdfx.HiLog.LOG_APP;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.samples.helloworld.ResourceTable;

/**
 * MainAbilitySlice02
 */
public class MainAbilitySlice02 extends AbilitySlice {

    static HiLogLabel LABEL = new HiLogLabel(LOG_APP, 0x00201, "MainAbilitySlice02");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        DependentLayout myLayout = new DependentLayout(this);
        myLayout.setWidth(MATCH_PARENT);
        myLayout.setHeight(MATCH_PARENT);
        ShapeElement element = new ShapeElement();
        myLayout.setBackground(element);
        Text text = new Text(this);
        text.setText(ResourceTable.String_main_ability_slice02);
        text.setWidth(MATCH_PARENT);
        text.setTextSize(55);
        text.setTextColor(Color.BLACK);
        DependentLayout.LayoutConfig textConfig = new DependentLayout.LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
        textConfig.addRule(DependentLayout.LayoutConfig.CENTER_IN_PARENT);
        text.setLayoutConfig(textConfig);

        text.setClickedListener(listener -> {
            Intent intentA = genIntent("", "ohos.samples.helloworld", "ohos.samples.helloworld.SecondAbility");
            startAbility(intentA);
        });

        myLayout.addComponent(text);

        super.setUIContent(myLayout);

        HiLog.info(LABEL, "MainAbilitySlice02 onStart");
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
        HiLog.info(LABEL, "MainAbilitySlice02 onForeground");
    }

    @Override
    protected void onActive() {
        super.onActive();
        HiLog.info(LABEL, "MainAbilitySlice02 onActive");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        HiLog.info(LABEL, "MainAbilitySlice02 onInactive");
    }

    @Override
    protected void onBackground() {
        super.onBackground();
        HiLog.info(LABEL, "MainAbilitySlice02 onBackground");
    }

    @Override
    protected void onStop() {
        super.onStop();
        HiLog.info(LABEL, "MainAbilitySlice02 onStop");
    }

    /**
     * 根据参数生成intent实例
     *
     * @param deviceName  设备名
     * @param bundleName  包名
     * @param abilityName 完整类名或类名
     * @return intent
     */
    private static Intent genIntent(String deviceName, String bundleName, String abilityName) {
        Operation operation;
        if (abilityName.contains(".")) {
            operation = new Intent.OperationBuilder()
                    .withDeviceId(deviceName)
                    .withBundleName(bundleName)
                    .withAbilityName(abilityName)
                    .build();
        } else {
            operation = new Intent.OperationBuilder()
                    .withDeviceId(deviceName)
                    .withBundleName(bundleName)
                    .withAbilityName(bundleName + "." + abilityName)
                    .build();
        }
        Intent intent = new Intent();
        intent.setOperation(operation);
        return intent;
    }

}

