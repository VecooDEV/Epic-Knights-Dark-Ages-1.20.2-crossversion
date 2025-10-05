package com.magistuarmory.darkages.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.darkages.EpicKnightsDarkAges;
import com.magistuarmory.darkages.item.armor.AddonArmorTypes;
import com.magistuarmory.item.*;
import com.magistuarmory.item.armor.DyeableMedievalArmorItem;
import com.magistuarmory.item.armor.DyeableWearableArmorDecorationItem;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.level.material.MapColor;

public class AddonItems extends ModItemsProvider
{
	public static AddonItems INSTANCE = new AddonItems();

	//Weapons
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BYZANTINE_AXE = INSTANCE.addMedievalWeaponItem("steel_byzantine_axe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.BYZANTINE_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FALKOPING_AXE = INSTANCE.addMedievalWeaponItem("steel_falkoping_axe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.FALKOPING_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_MIGRATION_ERA_AXE = INSTANCE.addMedievalWeaponItem("steel_migration_era_axe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.MIGRATION_ERA_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SMALL_BROADAXE = INSTANCE.addMedievalWeaponItem("steel_small_broadaxe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SMALL_BROADAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SUTTON_HOO_AXE = INSTANCE.addMedievalWeaponItem("steel_sutton_hoo_axe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SUTTON_HOO_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_CRAYKE_AXE = INSTANCE.addMedievalWeaponItem("steel_crayke_axe", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.CRAYKE_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_DECORATED_SPEAR = INSTANCE.addMedievalWeaponItem("steel_decorated_spear", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.DECORATED_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_HARNHAM_SPEAR = INSTANCE.addMedievalWeaponItem("steel_harnham_spear", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.HARNHAM_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_JAVELIN = INSTANCE.addMedievalWeaponItem("steel_javelin", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.JAVELIN);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_KINGSTON_SPEAR = INSTANCE.addMedievalWeaponItem("steel_kingston_spear", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.KINGSTON_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> GOLDEN_MIGRATION_ERA_SWORD = INSTANCE.addMedievalWeaponItem("golden_migration_era_sword", new Item.Properties(), ModItemTier.IRON, AddonWeaponTypes.GOLDEN_MIGRATION_ERA_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_JARLS_SWORD = INSTANCE.addMedievalWeaponItem("steel_jarls_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.JARLS_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_LANGSEAX = INSTANCE.addMedievalWeaponItem("steel_langseax", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.LANGSEAX);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_MAGYAR_SABRE = INSTANCE.addMedievalWeaponItem("steel_magyar_sabre", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.MAGYAR_SABRE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_RICH_NORDIC_SWORD = INSTANCE.addMedievalWeaponItem("steel_rich_nordic_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.RICH_NORDIC_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_RICH_SAXON_SWORD = INSTANCE.addMedievalWeaponItem("steel_rich_saxon_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.RICH_SAXON_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_RUNIC_SWORD = INSTANCE.addMedievalWeaponItem("steel_runic_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.RUNIC_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SCRAMASAX = INSTANCE.addMedievalWeaponItem("steel_scramasax", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SCRAMASAX);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SITTINGBOURNE_SEAX = INSTANCE.addMedievalWeaponItem("steel_sittingbourne_seax", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SITTINGBOURNE_SEAX);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SMALL_SEAX = INSTANCE.addMedievalWeaponItem("steel_small_seax", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SMALL_SEAX);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SUTTON_HOO_SWORD = INSTANCE.addMedievalWeaponItem("steel_sutton_hoo_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.SUTTON_HOO_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_VIKING_SWORD = INSTANCE.addMedievalWeaponItem("steel_viking_sword", new Item.Properties(), ModItemTier.STEEL, AddonWeaponTypes.VIKING_SWORD);

	//Armor
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BALYK_SOOK_LAMELLAR_CHESTPLATE = INSTANCE.addMedievalArmorItem("balyk_sook_lamellar_chestplate", AddonArmorTypes.BALYK_SOOK_LAMELLAR, ArmorItem.Type.CHESTPLATE, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> YELLOW_RICH_EASTERN_CAFTAN = INSTANCE.addDyeableMedievalArmorItem("yellow_rich_eastern_caftan", AddonArmorTypes.YELLOW_EASTERN_RICH_KAFTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROWN_RICH_EASTERN_CAFTAN = INSTANCE.addDyeableMedievalArmorItem("brown_rich_eastern_caftan", AddonArmorTypes.BROWN_EASTERN_RICH_KAFTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEN_RICH_EASTERN_CAFTAN = INSTANCE.addDyeableMedievalArmorItem("green_rich_eastern_caftan", AddonArmorTypes.GREEN_EASTERN_RICH_KAFTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> RED_RICH_EASTERN_CAFTAN = INSTANCE.addDyeableMedievalArmorItem("red_rich_eastern_caftan", AddonArmorTypes.RED_EASTERN_RICH_KAFTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_RICH_EASTERN_CAFTAN = INSTANCE.addDyeableMedievalArmorItem("black_rich_eastern_caftan", AddonArmorTypes.BLACK_EASTERN_RICH_KAFTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> WHITE_RICH_EASTERN_CAFTAN = INSTANCE.addDyeableMedievalArmorItem("white_rich_eastern_caftan", AddonArmorTypes.WHITE_EASTERN_RICH_KAFTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
//	public static final @Nullable RegistrySupplier<MedievalArmorItem> EASTERN_RICH_KAFTAN_BOOTS = INSTANCE.addDyeableMedievalArmorItem("eastern_rich_kaftan_boots", AddonArmorTypes.EASTERN_RICH_KAFTAN, ArmorItem.Type.BOOTS, new Item.Properties(), 0xFFFFFF); # Not texture.

//	public static final @Nullable RegistrySupplier<MedievalArmorItem> BIRKA_TUNIC_BOOTS = INSTANCE.addDyeableMedievalArmorItem("birka_tunic_boots", AddonArmorTypes.BIRKA_TUNIC, ArmorItem.Type.BOOTS, new Item.Properties(), 0xFFFFFF); # Not texture.

//	public static final @Nullable RegistrySupplier<MedievalArmorItem> LOMBARD_LAMELLAR_CHESTPLATE = INSTANCE.addMedievalArmorItem("lombard_lamellar_chestplate", AddonArmorTypes.LOMBARD_LAMELLAR, ArmorItem.Type.CHESTPLATE, new Item.Properties()); # Not texture.
//	public static final @Nullable RegistrySupplier<MedievalArmorItem> LOMBARD_LAMELLAR_BOOTS = INSTANCE.addMedievalArmorItem("lombard_lamellar_boots", AddonArmorTypes.LOMBARD_LAMELLAR, ArmorItem.Type.BOOTS, new Item.Properties()); # Not texture.

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BYRNIE_CHESTPLATE = INSTANCE.addMedievalArmorItem("byrnie_chestplate", AddonArmorTypes.BYRNIE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
//	public static final @Nullable RegistrySupplier<MedievalArmorItem> BYRNIE_BOOTS = INSTANCE.addMedievalArmorItem("byrnie_boots", AddonArmorTypes.BYRNIE, ArmorItem.Type.BOOTS, new Item.Properties()); # Not texture.

//	public static final @Nullable RegistrySupplier<MedievalArmorItem> NORTHERN_GAMBESON = INSTANCE.addMedievalArmorItem("northern_gambeson", AddonArmorTypes.NORTHERN_GAMBESON, ArmorItem.Type.CHESTPLATE, new Item.Properties()); # Not texture.

	public static final @Nullable RegistrySupplier<MedievalArmorItem> COMMON_HAUBERK = INSTANCE.addMedievalArmorItem("common_hauberk", AddonArmorTypes.COMMON_HAUBERK, ArmorItem.Type.CHESTPLATE, new Item.Properties());
//	public static final @Nullable RegistrySupplier<MedievalArmorItem> COMMON_HAUBERK_BOOTS = INSTANCE.addMedievalArmorItem("common_hauberk_boots", AddonArmorTypes.COMMON_HAUBERK, ArmorItem.Type.BOOTS, new Item.Properties()); # Not texture.

	public static final @Nullable RegistrySupplier<MedievalArmorItem> RICH_BYRNIE_CHESTPLATE = INSTANCE.addMedievalArmorItem("rich_byrnie_chestplate", AddonArmorTypes.RICH_BYRNIE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
//	public static final @Nullable RegistrySupplier<MedievalArmorItem> RICH_BYRNIE_BOOTS = INSTANCE.addMedievalArmorItem("rich_byrnie_boots", AddonArmorTypes.RICH_BYRNIE, ArmorItem.Type.BOOTS, new Item.Properties()); # Not texture.

	public static final @Nullable RegistrySupplier<MedievalArmorItem> VENDEL_GREAVES = INSTANCE.addMedievalArmorItem("vendel_greaves", AddonArmorTypes.VENDEL_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BANDENHELM = INSTANCE.addMedievalArmorItem("bandenhelm", AddonArmorTypes.BANDENHELM, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BENTY_GRANGE_HELMET = INSTANCE.addMedievalArmorItem("benty_grange_helmet", AddonArmorTypes.BENTY_GRANGE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BIRKA_HELMET = INSTANCE.addMedievalArmorItem("birka_helmet", AddonArmorTypes.BIRKA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROA_HELMET = INSTANCE.addMedievalArmorItem("broa_helmet", AddonArmorTypes.BROA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> COPPERGATE_HELMET = INSTANCE.addMedievalArmorItem("coppergate_helmet", AddonArmorTypes.COPPERGATE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DESJATINNA_HELMET = INSTANCE.addMedievalArmorItem("desjatinna_helmet", AddonArmorTypes.DESJATINNA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DESJATINNA_HELMET = INSTANCE.addMedievalArmorItem("gilded_desjatinna_helmet", AddonArmorTypes.GILDED_DESJATINNA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_TJELE = INSTANCE.addMedievalArmorItem("gilded_tjele", AddonArmorTypes.GILDED_TJELE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GJERMUNDBU_HELMET = INSTANCE.addMedievalArmorItem("gjermundbu_helmet", AddonArmorTypes.GJERMUNDBU_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GORZUCHY_HELMET = INSTANCE.addMedievalArmorItem("gorzuchy_helmet", AddonArmorTypes.GORZUCHY_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LOKRUME_HELMET = INSTANCE.addMedievalArmorItem("lokrume_helmet", AddonArmorTypes.LOKRUME_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PECS_HELMET = INSTANCE.addMedievalArmorItem("pecs_helmet", AddonArmorTypes.PECS_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SOMME_HELMET = INSTANCE.addMedievalArmorItem("somme_helmet", AddonArmorTypes.SOMME_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> STAFFORSHIRE_HELMET = INSTANCE.addMedievalArmorItem("stafforshire_helmet", AddonArmorTypes.STAFFORSHIRE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SUTTON_HOO_HELMET = INSTANCE.addMedievalArmorItem("sutton_hoo_helmet", AddonArmorTypes.SUTTON_HOO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LEIDEN_BANDHELMET = INSTANCE.addMedievalArmorItem("leiden_bandhelmet", AddonArmorTypes.LEIDEN_BANDHELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TELJE = INSTANCE.addMedievalArmorItem("telje", AddonArmorTypes.TELJE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ULTUNA_HELMET = INSTANCE.addMedievalArmorItem("ultuna_helmet", AddonArmorTypes.ULTUNA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> VALSGARDE_5 = INSTANCE.addMedievalArmorItem("valsgarde_5", AddonArmorTypes.VALSGARDE_5, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> VALSGARDE_8 = INSTANCE.addMedievalArmorItem("valsgarde_8", AddonArmorTypes.VALSGARDE_8, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> VENDEL_1 = INSTANCE.addMedievalArmorItem("vendel_1", AddonArmorTypes.VENDEL_1, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> VENDEL_HELMET = INSTANCE.addMedievalArmorItem("vendel_helmet", AddonArmorTypes.VENDEL_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> VERDEN_HELMET = INSTANCE.addMedievalArmorItem("verden_helmet", AddonArmorTypes.VERDEN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> WOLLASTON_HELMET = INSTANCE.addMedievalArmorItem("wollaston_helmet", AddonArmorTypes.WOLLASTON_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> YARM_HELMET = INSTANCE.addMedievalArmorItem("yarm_helmet", AddonArmorTypes.YARM_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> STROMOVKA_HELMET = INSTANCE.addMedievalArmorItem("stromovka_helmet", AddonArmorTypes.STROMOVKA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ZLIN_HELMET = INSTANCE.addMedievalArmorItem("zlin_helmet", AddonArmorTypes.ZLIN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> KERCH_HELMET = INSTANCE.addMedievalArmorItem("kerch_helmet", AddonArmorTypes.KERCH_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TROSINO_HELMET = INSTANCE.addMedievalArmorItem("trosino_helmet", AddonArmorTypes.TROSINO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EASTERN_HAT = INSTANCE.addDyeableMedievalArmorItem("eastern_hat", AddonArmorTypes.EASTERN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PILLBOX_CAP = INSTANCE.addDyeableMedievalArmorItem("pillbox_cap", AddonArmorTypes.PILLBOX_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> YELLOW_OATERNED_PILLBOX_CAP = INSTANCE.addDyeableMedievalArmorItem("yellow_oaterned_pillbox_cap", AddonArmorTypes.WHITE_OATERNED_PILLBOX_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROWN_OATERNED_PILLBOX_CAP = INSTANCE.addDyeableMedievalArmorItem("brown_oaterned_pillbox_cap", AddonArmorTypes.GREEN_OATERNED_PILLBOX_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEN_OATERNED_PILLBOX_CAP = INSTANCE.addDyeableMedievalArmorItem("green_oaterned_pillbox_cap", AddonArmorTypes.YELLOW_OATERNED_PILLBOX_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> RED_OATERNED_PILLBOX_CAP = INSTANCE.addDyeableMedievalArmorItem("red_oaterned_pillbox_cap", AddonArmorTypes.RED_OATERNED_PILLBOX_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_OATERNED_PILLBOX_CAP = INSTANCE.addDyeableMedievalArmorItem("black_oaterned_pillbox_cap", AddonArmorTypes.BROWN_OATERNED_PILLBOX_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> WHITE_OATERNED_PILLBOX_CAP = INSTANCE.addDyeableMedievalArmorItem("white_oaterned_pillbox_cap", AddonArmorTypes.BLACK_OATERNED_PILLBOX_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> YELLOW_PATTERNED_EASTERN_HAT = INSTANCE.addDyeableMedievalArmorItem("yellow_patterned_eastern_hat", AddonArmorTypes.YELLOW_PATTERNED_EASTERN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROWN_PATTERNED_EASTERN_HAT = INSTANCE.addDyeableMedievalArmorItem("brown_patterned_eastern_hat", AddonArmorTypes.BROWN_PATTERNED_EASTERN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEN_PATTERNED_EASTERN_HAT = INSTANCE.addDyeableMedievalArmorItem("green_patterned_eastern_hat", AddonArmorTypes.GREEN_PATTERNED_EASTERN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> RED_PATTERNED_EASTERN_HAT = INSTANCE.addDyeableMedievalArmorItem("red_patterned_eastern_hat", AddonArmorTypes.RED_PATTERNED_EASTERN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_PATTERNED_EASTERN_HAT = INSTANCE.addDyeableMedievalArmorItem("black_patterned_eastern_hat", AddonArmorTypes.BLACK_PATTERNED_EASTERN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> WHITE_PATTERNED_EASTERN_HAT = INSTANCE.addDyeableMedievalArmorItem("white_patterned_eastern_hat", AddonArmorTypes.WHITE_PATTERNED_EASTERN_HAT, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FUR_PILLBOX_CAP = INSTANCE.addDyeableMedievalArmorItem("fur_pillbox_cap", AddonArmorTypes.FUR_PILLBOX_CAP, ArmorItem.Type.HELMET, new Item.Properties(), 0x764e30);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> WININGAS = INSTANCE.addDyeableMedievalArmorItem("winingas", AddonArmorTypes.WININGAS, ArmorItem.Type.LEGGINGS, new Item.Properties(), 0xFFFFFF);


	//Decoration
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> YELLOW_BIRKA_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("yellow_birka_tunic_decoration", AddonArmorTypes.YELLOW_BIRKA_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BROWN_BIRKA_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("brown_birka_tunic_decoration", AddonArmorTypes.BROWN_BIRKA_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> GREEN_BIRKA_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("green_birka_tunic_decoration", AddonArmorTypes.GREEN_BIRKA_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> RED_BIRKA_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("red_birka_tunic_decoration", AddonArmorTypes.RED_BIRKA_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BLACK_BIRKA_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("black_birka_tunic_decoration", AddonArmorTypes.BLACK_BIRKA_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> WHITE_BIRKA_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("white_birka_tunic_decoration", AddonArmorTypes.WHITE_BIRKA_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> YELLOW_EARLY_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("yellow_early_tunic_decoration", AddonArmorTypes.YELLOW_EARLY_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BROWN_EARLY_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("brown_early_tunic_decoration", AddonArmorTypes.BROWN_EARLY_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> GREEN_EARLY_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("green_early_tunic_decoration", AddonArmorTypes.GREEN_EARLY_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> RED_EARLY_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("red_early_tunic_decoration", AddonArmorTypes.RED_EARLY_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BLACK_EARLY_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("black_early_tunic_decoration", AddonArmorTypes.BLACK_EARLY_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> WHITE_EARLY_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("white_early_tunic_decoration", AddonArmorTypes.WHITE_EARLY_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> YELLOW_KLAPPENROCK_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("yellow_klappenrock_tunic_decoration", AddonArmorTypes.YELLOW_KLAPPENROCK_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BROWN_KLAPPENROCK_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("brown_klappenrock_tunic_decoration", AddonArmorTypes.BROWN_KLAPPENROCK_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> GREEN_KLAPPENROCK_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("green_klappenrock_tunic_decoration", AddonArmorTypes.GREEN_KLAPPENROCK_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> RED_KLAPPENROCK_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("red_klappenrock_tunic_decoration", AddonArmorTypes.RED_KLAPPENROCK_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BLACK_KLAPPENROCK_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("black_klappenrock_tunic_decoration", AddonArmorTypes.BLACK_KLAPPENROCK_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> WHITE_KLAPPENROCK_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("white_klappenrock_tunic_decoration", AddonArmorTypes.WHITE_KLAPPENROCK_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> YELLOW_LATE_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("yellow_late_saxon_tunic_decoration", AddonArmorTypes.YELLOW_LATE_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BROWN_LATE_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("brown_late_saxon_tunic_decoration", AddonArmorTypes.BROWN_LATE_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> GREEN_LATE_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("green_late_saxon_tunic_decoration", AddonArmorTypes.GREEN_LATE_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> RED_LATE_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("red_late_saxon_tunic_decoration", AddonArmorTypes.RED_LATE_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BLACK_LATE_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("black_late_saxon_tunic_decoration", AddonArmorTypes.BLACK_LATE_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> WHITE_LATE_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("white_late_saxon_tunic_decoration", AddonArmorTypes.WHITE_LATE_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> YELLOW_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("yellow_saxon_tunic_decoration", AddonArmorTypes.YELLOW_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BROWN_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("brown_saxon_tunic_decoration", AddonArmorTypes.BROWN_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> GREEN_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("green_saxon_tunic_decoration", AddonArmorTypes.GREEN_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> RED_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("red_saxon_tunic_decoration", AddonArmorTypes.RED_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> BLACK_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("black_saxon_tunic_decoration", AddonArmorTypes.BLACK_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> WHITE_SAXON_TUNIC_DECORATION = INSTANCE.addDyeableWearableArmorDecorationItem("white_saxon_tunic_decoration", AddonArmorTypes.WHITE_SAXON_TUNIC, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);

	public static final RegistrySupplier<DyeableArmorDecorationItem> YELLOW_PRACHTMANTEL_DECORATION = INSTANCE.addDyeableArmorDecorationItem("yellow_prachtmantel_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "yellow_prachtmantel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BROWN_PRACHTMANTEL_DECORATION = INSTANCE.addDyeableArmorDecorationItem("brown_prachtmantel_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "brown_prachtmantel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GREEN_PRACHTMANTEL_DECORATION = INSTANCE.addDyeableArmorDecorationItem("green_prachtmantel_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "green_prachtmantel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> RED_PRACHTMANTEL_DECORATION = INSTANCE.addDyeableArmorDecorationItem("red_prachtmantel_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "red_prachtmantel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_PRACHTMANTEL_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_prachtmantel_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "black_prachtmantel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> WHITE_PRACHTMANTEL_DECORATION = INSTANCE.addDyeableArmorDecorationItem("white_prachtmantel_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "white_prachtmantel"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<ArmorDecorationItem> BOAR_DECORATION = INSTANCE.addArmorDecorationItem("boar_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "boar"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<DyeableArmorDecorationItem> HAIRY_BOAR_DECORATION = INSTANCE.addDyeableArmorDecorationItem("hairy_boar_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "hairy_boar"), new Item.Properties(), ArmorItem.Type.HELMET, 0x202020));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_BOAR_DECORATION = INSTANCE.addArmorDecorationItem("gilded_boar_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "gilded_boar"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GILDED_HAIRY_BOAR_DECORATION = INSTANCE.addDyeableArmorDecorationItem("gilded_hairy_boar_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "gilded_hairy_boar"), new Item.Properties(), ArmorItem.Type.HELMET, 0x202020));
	public static final RegistrySupplier<DyeableArmorDecorationItem> COMMON_WALLET_DECORATION = INSTANCE.addDyeableArmorDecorationItem("common_wallet_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "common_wallet"), new Item.Properties(), ArmorItem.Type.LEGGINGS, 0x664c33));
	public static final RegistrySupplier<DyeableArmorDecorationItem> EARLY_CLOAK_DECORATION = INSTANCE.addDyeableArmorDecorationItem("early_cloak_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "early_cloak"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
	public static final RegistrySupplier<DyeableArmorDecorationItem> PILE_WOVEN_CLOAK_DECORATION = INSTANCE.addDyeableArmorDecorationItem("pile_woven_cloak_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "pile_woven_cloak"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xd4d4d4));
	public static final RegistrySupplier<DyeableArmorDecorationItem> HEDEBY_BAG_DECORATION = INSTANCE.addDyeableArmorDecorationItem("hedeby_bag_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "hedeby_bag"), new Item.Properties(), ArmorItem.Type.LEGGINGS));
	public static final RegistrySupplier<ArmorDecorationItem> MAILLE_AVENTAIL_DECORATION = INSTANCE.addArmorDecorationItem("maille_aventail_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "maille_aventail"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ORKNEY_HOOD_DECORATION = INSTANCE.addDyeableArmorDecorationItem("orkney_hood_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "orkney_hood"), new Item.Properties(), ArmorItem.Type.HELMET));
	public static final RegistrySupplier<ArmorDecorationItem> VALSGARDE_VAMBRACES_DECORATION = INSTANCE.addArmorDecorationItem("valsgarde_vambraces_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsDarkAges.ID, "valsgarde_vambraces"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));

	public AddonItems()
	{
		super(EpicKnightsDarkAges.ID);
	}
}
