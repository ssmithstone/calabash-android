package sh.calaba.instrumentationbackend.actions.contextmenu;

import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;


public class PressMenuItemByIndex implements Action {

    @Override
    public Result execute(String... args) {
        InstrumentationBackend.solo.pressMenuItem(Integer.parseInt(args[0]));
        return Result.successResult();
    }

    @Override
    public String key() {
        return "press_menu_item";
    }

}