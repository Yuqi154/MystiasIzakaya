package org.hiedacamellia.mystiasizakaya.core.data;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.hiedacamellia.mystiasizakaya.core.data.lang.ChineseLanguageProvider;
import org.hiedacamellia.mystiasizakaya.core.data.lang.EnglishLanguageProvider;
import org.hiedacamellia.mystiasizakaya.core.data.provider.MIModelProvider;
import org.hiedacamellia.mystiasizakaya.core.data.provider.MIRecipeProvider;
import org.hiedacamellia.mystiasizakaya.core.data.provider.MIStateProvider;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Data {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var packOutput = gen.getPackOutput();
        var helper = event.getExistingFileHelper();
        gen.addProvider(event.includeClient(), new EnglishLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ChineseLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new MIModelProvider(packOutput, helper));
        gen.addProvider(event.includeClient(), new MIStateProvider(packOutput, helper));
        gen.addProvider(event.includeServer(), new MIRecipeProvider(packOutput, event.getLookupProvider()));
    }
}