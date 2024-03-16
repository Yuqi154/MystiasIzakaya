
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.touhou.mystiasizakaya.init;

import net.touhou.mystiasizakaya.MystiasIzakayaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class MystiasIzakayaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MystiasIzakayaMod.MODID);
	public static final RegistryObject<CreativeModeTab> MYSTIASS_IZAKAYA = REGISTRY.register("mystiass_izakaya",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mystias_izakaya.mystiass_izakaya")).icon(() -> new ItemStack(MystiasIzakayaModItems.ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MystiasIzakayaModBlocks.COOKING_RANGE.get().asItem());
				tabData.accept(MystiasIzakayaModBlocks.BANK.get().asItem());
				tabData.accept(MystiasIzakayaModItems.LIAO_LI_TAI.get());
				tabData.accept(MystiasIzakayaModItems.SHAO_KAO_JIA.get());
				tabData.accept(MystiasIzakayaModItems.YOU_GUO.get());
				tabData.accept(MystiasIzakayaModItems.ZHENG_GUO.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_GUO.get());
				tabData.accept(MystiasIzakayaModItems.BA_MU_MAN.get());
				tabData.accept(MystiasIzakayaModItems.BAI_GUO.get());
				tabData.accept(MystiasIzakayaModItems.BAN_LI.get());
				tabData.accept(MystiasIzakayaModItems.BING_KUAI.get());
				tabData.accept(MystiasIzakayaModItems.BING_DI_LIAN.get());
				tabData.accept(MystiasIzakayaModItems.CHAN_SHUI.get());
				tabData.accept(MystiasIzakayaModItems.DI_GUA.get());
				tabData.accept(MystiasIzakayaModItems.DOU_FU.get());
				tabData.accept(MystiasIzakayaModItems.FENG_MI.get());
				tabData.accept(MystiasIzakayaModItems.HAI_DAN.get());
				tabData.accept(MystiasIzakayaModItems.HAI_TAI.get());
				tabData.accept(MystiasIzakayaModItems.HE_NIU.get());
				tabData.accept(MystiasIzakayaModItems.HE_TUN.get());
				tabData.accept(MystiasIzakayaModItems.HEI_MAO_ZHU_ROU.get());
				tabData.accept(MystiasIzakayaModItems.HEI_YAN.get());
				tabData.accept(MystiasIzakayaModItems.HUAN_TAN_HUA.get());
				tabData.accept(MystiasIzakayaModItems.HUANG_GUA.get());
				tabData.accept(MystiasIzakayaModItems.HUANG_YOU.get());
				tabData.accept(MystiasIzakayaModItems.JI_DAN.get());
				tabData.accept(MystiasIzakayaModItems.JI_SHANG_JIN_QIANG_YU.get());
				tabData.accept(MystiasIzakayaModItems.JIN_QIANG_YU.get());
				tabData.accept(MystiasIzakayaModItems.LA_JIAO.get());
				tabData.accept(MystiasIzakayaModItems.LIAN_ZI.get());
				tabData.accept(MystiasIzakayaModItems.LU_ROU.get());
				tabData.accept(MystiasIzakayaModItems.LU_SHUI.get());
				tabData.accept(MystiasIzakayaModItems.LUO_BU.get());
				tabData.accept(MystiasIzakayaModItems.MIAN_FEN.get());
				tabData.accept(MystiasIzakayaModItems.MO_GU.get());
				tabData.accept(MystiasIzakayaModItems.NAI_YOU.get());
				tabData.accept(MystiasIzakayaModItems.NAN_GUA.get());
				tabData.accept(MystiasIzakayaModItems.NING_MENG.get());
				tabData.accept(MystiasIzakayaModItems.NIU_ROU.get());
				tabData.accept(MystiasIzakayaModItems.NUO_MI.get());
				tabData.accept(MystiasIzakayaModItems.PANG_XIE.get());
				tabData.accept(MystiasIzakayaModItems.PU_TAO.get());
				tabData.accept(MystiasIzakayaModItems.SAN_WEN_YU.get());
				tabData.accept(MystiasIzakayaModItems.SONG_LU.get());
				tabData.accept(MystiasIzakayaModItems.SONG_ZI.get());
				tabData.accept(MystiasIzakayaModItems.TAO_ZI.get());
				tabData.accept(MystiasIzakayaModItems.TU_DOU.get());
				tabData.accept(MystiasIzakayaModItems.XIA.get());
				tabData.accept(MystiasIzakayaModItems.YANG_CONG.get());
				tabData.accept(MystiasIzakayaModItems.YE_ZHU_ROU.get());
				tabData.accept(MystiasIzakayaModItems.YUE_GUANG_CAO.get());
				tabData.accept(MystiasIzakayaModItems.ZHANG_YU.get());
				tabData.accept(MystiasIzakayaModItems.ZHI_SHI.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_ROU.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_SUN.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_ZI.get());
				tabData.accept(MystiasIzakayaModItems.ZUN_YU.get());
				tabData.accept(MystiasIzakayaModItems.BAI_GUO_LUO_BU_PAI_GU_TANG.get());
				tabData.accept(MystiasIzakayaModItems.BAI_TAO_SHENG_BA_QIAO.get());
				tabData.accept(MystiasIzakayaModItems.BAI_XUE.get());
				tabData.accept(MystiasIzakayaModItems.BAN_NI_DI_KE_DAN.get());
				tabData.accept(MystiasIzakayaModItems.BEI_JI_TIAN_XIA_MI_TAO_SE_LA.get());
				tabData.accept(MystiasIzakayaModItems.BU_SI_NIAO.get());
				tabData.accept(MystiasIzakayaModItems.CHAO_ROU_SI.get());
				tabData.accept(MystiasIzakayaModItems.CHOU_DOU_FU.get());
				tabData.accept(MystiasIzakayaModItems.CI_SHEN_PIN_PAN.get());
				tabData.accept(MystiasIzakayaModItems.DA_BAN_SHAO.get());
				tabData.accept(MystiasIzakayaModItems.DA_SHE_YAN.get());
				tabData.accept(MystiasIzakayaModItems.DOU_FU_GUO.get());
				tabData.accept(MystiasIzakayaModItems.DOU_FU_WEI_CHENG.get());
				tabData.accept(MystiasIzakayaModItems.ER_TIAN_LIU.get());
				tabData.accept(MystiasIzakayaModItems.FAN_TUAN.get());
				tabData.accept(MystiasIzakayaModItems.HAI_XIAN_WEI_CHENG_TANG.get());
				tabData.accept(MystiasIzakayaModItems.HONG_SHAO_MAN_YU.get());
				tabData.accept(MystiasIzakayaModItems.HUA_GUANG_YU_JIAN_BAO.get());
				tabData.accept(MystiasIzakayaModItems.HUAN_TAN_HUA_GAO.get());
				tabData.accept(MystiasIzakayaModItems.HUANG_YOU_NIU_PAI.get());
				tabData.accept(MystiasIzakayaModItems.HUI_LING_DUN_NIU_PAI.get());
				tabData.accept(MystiasIzakayaModItems.KAO_BA_MU_MAN.get());
				tabData.accept(MystiasIzakayaModItems.KAO_MO_GU.get());
				tabData.accept(MystiasIzakayaModItems.LENG_DOU_FU.get());
				tabData.accept(MystiasIzakayaModItems.LI_LIANG_TANG.get());
				tabData.accept(MystiasIzakayaModItems.LIANG_CAI_DIAO_HUA.get());
				tabData.accept(MystiasIzakayaModItems.LIU_SHUI_SU_MIAN.get());
				tabData.accept(MystiasIzakayaModItems.LU_SHUI_ZHU_DAN.get());
				tabData.accept(MystiasIzakayaModItems.MA_PO_DOU_FU.get());
				tabData.accept(MystiasIzakayaModItems.MA_SHU.get());
				tabData.accept(MystiasIzakayaModItems.MAO_YU_RONG_YAN_DOU_FU.get());
				tabData.accept(MystiasIzakayaModItems.MAO_YU_SAN_SE_BING_JI_LING.get());
				tabData.accept(MystiasIzakayaModItems.MI_ZHI_XIAO_YU_GAN.get());
				tabData.accept(MystiasIzakayaModItems.MI_ZHI_CHA_SHAO.get());
				tabData.accept(MystiasIzakayaModItems.MO_GU_ROU_PIAN.get());
				tabData.accept(MystiasIzakayaModItems.NAI_YOU_TUN_CAI.get());
				tabData.accept(MystiasIzakayaModItems.NENG_LIANG_CHUAN.get());
				tabData.accept(MystiasIzakayaModItems.NIU_ROU_GAI_JIAO_FAN.get());
				tabData.accept(MystiasIzakayaModItems.PENG_LAI_YU_ZHI.get());
				tabData.accept(MystiasIzakayaModItems.RE_SONG_BING.get());
				tabData.accept(MystiasIzakayaModItems.SAI_XIONG_ZHANG.get());
				tabData.accept(MystiasIzakayaModItems.SHI_LI_YIN_XING.get());
				tabData.accept(MystiasIzakayaModItems.SHU_CAI_ZHUAN_JI.get());
				tabData.accept(MystiasIzakayaModItems.SHUI_JIAO.get());
				tabData.accept(MystiasIzakayaModItems.SHUI_ZHU_YU.get());
				tabData.accept(MystiasIzakayaModItems.SI_KANG_BING.get());
				tabData.accept(MystiasIzakayaModItems.TANG_YUAN.get());
				tabData.accept(MystiasIzakayaModItems.TAO_HUA_GENG.get());
				tabData.accept(MystiasIzakayaModItems.TU_DOU_KE_LE_BING.get());
				tabData.accept(MystiasIzakayaModItems.TUN_GU_LA_MIAN.get());
				tabData.accept(MystiasIzakayaModItems.WEN_NUAN_FAN_TUAN.get());
				tabData.accept(MystiasIzakayaModItems.WU_YI_SHI_YAO_GUAI_MU_SI.get());
				tabData.accept(MystiasIzakayaModItems.XIANG_JIAN_SAN_WEN_YU.get());
				tabData.accept(MystiasIzakayaModItems.XIANG_ZHA_CHAN_SHUI.get());
				tabData.accept(MystiasIzakayaModItems.XING_HONG_E_MO_DAN_GAO.get());
				tabData.accept(MystiasIzakayaModItems.YAN_JIANG.get());
				tabData.accept(MystiasIzakayaModItems.YE_WEI_JIA_NONG.get());
				tabData.accept(MystiasIzakayaModItems.YI_SHI_HUI_FAN.get());
				tabData.accept(MystiasIzakayaModItems.YING_LUO_XUE.get());
				tabData.accept(MystiasIzakayaModItems.YOU_DOU_FU.get());
				tabData.accept(MystiasIzakayaModItems.YUE_GUANG_TUAN_ZI.get());
				tabData.accept(MystiasIzakayaModItems.YUE_ZHI_LIAN_REN.get());
				tabData.accept(MystiasIzakayaModItems.ZA_CHUI.get());
				tabData.accept(MystiasIzakayaModItems.ZHA_BA_MU_MAN.get());
				tabData.accept(MystiasIzakayaModItems.ZHA_ZHU_ROU_PAI.get());
				tabData.accept(MystiasIzakayaModItems.ZHEN_HAI_XIAN_WEI_CHENG_TANG.get());
				tabData.accept(MystiasIzakayaModItems.ZHI_ZHU_ROU_FAN_TUAN.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_LU_DIE.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_ROU_GAI_JIAO_FAN.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_ROU_ZUN_YU_XUN.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_QU_JI.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_SUN_CHAO_ROU.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_TONG_ZHENG_DAN.get());
				tabData.accept(MystiasIzakayaModItems.ZHU_DOU_FU.get());
				tabData.accept(MystiasIzakayaModItems.HEI_AN_WU_ZHI.get());
				tabData.accept(MystiasIzakayaModItems.LU_CHA.get());
				tabData.accept(MystiasIzakayaModItems.SHUI_TA_JI.get());
				tabData.accept(MystiasIzakayaModItems.QUE_JIU.get());
				tabData.accept(MystiasIzakayaModItems.GUO_WEI_HIGH_BALL.get());
				tabData.accept(MystiasIzakayaModItems.GUO_WEI_SOUR.get());
				tabData.accept(MystiasIzakayaModItems.QI.get());
				tabData.accept(MystiasIzakayaModItems.MEI_JIU.get());
				tabData.accept(MystiasIzakayaModItems.CHAO_ZUN_PI_JIU.get());
				tabData.accept(MystiasIzakayaModItems.RI_YUE_XING.get());
				tabData.accept(MystiasIzakayaModItems.NIU_NAI.get());
				tabData.accept(MystiasIzakayaModItems.HONG_YOU_GUO_ZHI.get());
				tabData.accept(MystiasIzakayaModItems.BO_ZI_QI_SHUI.get());
				tabData.accept(MystiasIzakayaModItems.FENG_ZHU.get());
				tabData.accept(MystiasIzakayaModItems.TIAN_GOU_YONG.get());
				tabData.accept(MystiasIzakayaModItems.SHEN_ZHI_MAI.get());
				tabData.accept(MystiasIzakayaModItems.XING_HONG_E_MO.get());
				tabData.accept(MystiasIzakayaModItems.XIAO.get());
				tabData.accept(MystiasIzakayaModItems.A_FU_JIA_DUO.get());
				tabData.accept(MystiasIzakayaModItems.HONG_MO_GUAN_HONG_CHA.get());
				tabData.accept(MystiasIzakayaModItems.HONG_WU.get());
				tabData.accept(MystiasIzakayaModItems.NI_GE_LUO_NI.get());
				tabData.accept(MystiasIzakayaModItems.JIAO_FU.get());
				tabData.accept(MystiasIzakayaModItems.YUE_MIAN_HUO_JIAN.get());
				tabData.accept(MystiasIzakayaModItems.SHI_SI_YE.get());
				tabData.accept(MystiasIzakayaModItems.DONG_NIANG.get());
				tabData.accept(MystiasIzakayaModItems.YU_LU_CHA.get());
				tabData.accept(MystiasIzakayaModItems.HUO_SHU_QIU.get());
				tabData.accept(MystiasIzakayaModItems.BING_SHAN_MAO_YU_DONG_NING.get());
				tabData.accept(MystiasIzakayaModItems.DA_BING_GUN_ER.get());
				tabData.accept(MystiasIzakayaModItems.DA_YIN_NIANG.get());
				tabData.accept(MystiasIzakayaModItems.KA_PEI.get());
				tabData.accept(MystiasIzakayaModItems.GU_FA_NAI_YOU_BING_SHA.get());
				tabData.accept(MystiasIzakayaModItems.YAO_JING_YU_LU.get());
				tabData.accept(MystiasIzakayaModItems.PU_TONG_JIAN_SHEN_CHA.get());
				tabData.accept(MystiasIzakayaModItems.GUI_SHA.get());
				tabData.accept(MystiasIzakayaModItems.QI_BAO_JIAN.get());
				tabData.accept(MystiasIzakayaModItems.GU_MING_DI_BING_JI_LING.get());
				tabData.accept(MystiasIzakayaModItems.YANG_ZHI_GAN_LU.get());
				tabData.accept(MystiasIzakayaModItems.QI_LIN.get());
				tabData.accept(MystiasIzakayaModItems.LING_XIAN.get());
				tabData.accept(MystiasIzakayaModItems.EN_1.get());
				tabData.accept(MystiasIzakayaModItems.EN_5.get());
				tabData.accept(MystiasIzakayaModItems.EN_10.get());
				tabData.accept(MystiasIzakayaModItems.EN_10K.get());
			})

					.build());
}
