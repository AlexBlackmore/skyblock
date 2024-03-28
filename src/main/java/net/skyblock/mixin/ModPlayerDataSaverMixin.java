package net.skyblock.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.skyblock.Skyblock;
import net.skyblock.util.IEntityDataSaver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class ModPlayerDataSaverMixin implements IEntityDataSaver {
    private NbtCompound currencies;
    private final String CURRENCIES_KEY = "Currencies";
    private NbtCompound coins;
    private final String COINS_KEY = "Coins";
    private double purse;
    private final String PURSE_KEY = "Purse";
    private double bank;
    private final String BANK_KEY = "Bank";
    private int mithrilPowder;
    private final String MITHRIL_POWDER_KEY = "MithrilPowder";

    @Override
    public NbtCompound getPersistentData() {
        NbtCompound nbt = new NbtCompound();

        if(this.currencies == null) {
            this.currencies = new NbtCompound();

            this.coins = new NbtCompound();
            this.coins.putDouble(PURSE_KEY, this.purse = 0);
            this.coins.putDouble(BANK_KEY, this.bank = 0);
            this.currencies.put(COINS_KEY, this.coins);

            this.currencies.putInt(MITHRIL_POWDER_KEY, this.mithrilPowder = 0);
        }
        nbt.put(CURRENCIES_KEY, currencies);

        return nbt;
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfo ci) {
        nbt.put(Skyblock.MOD_ID, getPersistentData());
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo info) {
        if(nbt.contains(Skyblock.MOD_ID, 10)) {
            NbtCompound nbt1 = nbt.getCompound(Skyblock.MOD_ID);
        }
    }
}
