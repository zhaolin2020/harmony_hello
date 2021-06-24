package ohos.samples.helloworld.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.samples.helloworld.ResourceTable;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;
import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_PARENT;
import static ohos.hiviewdfx.HiLog.LOG_APP;

/**
 * SecondAbilitySlice02
 */
public class SecondAbilitySlice02 extends AbilitySlice {

    static HiLogLabel LABEL = new HiLogLabel(LOG_APP, 0x00201, "SecondAbilitySlice02");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        DependentLayout myLayout = new DependentLayout(this);
        myLayout.setWidth(MATCH_PARENT);
        myLayout.setHeight(MATCH_PARENT);
        ShapeElement element = new ShapeElement();
        myLayout.setBackground(element);
        Text text = new Text(this);
        text.setText(ResourceTable.String_second_ability_slice02);
        text.setWidth(MATCH_PARENT);
        text.setTextSize(55);
        text.setTextColor(Color.BLACK);
        DependentLayout.LayoutConfig textConfig = new DependentLayout.LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
        textConfig.addRule(DependentLayout.LayoutConfig.CENTER_IN_PARENT);
        text.setLayoutConfig(textConfig);
        myLayout.addComponent(text);
        super.setUIContent(myLayout);

        HiLog.info(LABEL, "SecondAbilitySlice02 onStart");
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
        HiLog.info(LABEL, "SecondAbilitySlice02 onForeground");
    }

    @Override
    protected void onActive() {
        super.onActive();
        HiLog.info(LABEL, "SecondAbilitySlice02 onActive");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        HiLog.info(LABEL, "SecondAbilitySlice02 onInactive");
    }

    @Override
    protected void onBackground() {
        super.onBackground();
        HiLog.info(LABEL, "SecondAbilitySlice02 onBackground");
    }

    @Override
    protected void onStop() {
        super.onStop();
        HiLog.info(LABEL, "SecondAbilitySlice02 onStop");
    }

}

