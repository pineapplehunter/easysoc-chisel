package org.easysoc.plugins.chisel.module;

import com.intellij.openapi.module.*;
import com.intellij.openapi.util.Key;
import icons.Icons;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import java.util.Properties;

public class ChiselModuleType extends ModuleType<ChiselModuleBuilder> {
    private static final ChiselModuleType INSTANCE = new ChiselModuleType();
    public static final String ID = "CHISEL_MODULE";
    public static final Key<Properties> EASYSOC_CHIP = Key.create("EASYSOC_CHIP");
    public static final Key<String> NEWPROJECT_TYPE = Key.create("NEWPROJECT_TYPE");

    public ChiselModuleType() {
        super(ID);
    }

    public static ChiselModuleType getInstance() {
        return INSTANCE;
    }

    @NotNull
    @Override
    public ChiselModuleBuilder createModuleBuilder() {
        return new ChiselModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "Chisel";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Create new Chisel project based on templates.";
    }


    @NotNull
    @Override
    public Icon getNodeIcon(@Deprecated boolean b) {
        return Icons.Chisel;
    }

}
