package io.github.dkdotinc.mixin;

import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Overwrite;

import java.io.InputStream;

@Mixin(Window.class)
public class WindowMixin {
    @Overwrite
    public void setIcon(InputStream icon16, InputStream icon32) {
    }
}
