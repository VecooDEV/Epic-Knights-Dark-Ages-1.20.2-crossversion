package com.magistuarmory.darkages.client.render.model;

import com.magistuarmory.darkages.EpicKnightsDarkAges;
import com.magistuarmory.darkages.client.render.model.armor.*;
import com.magistuarmory.darkages.client.render.model.decoration.*;
import com.magistuarmory.api.client.render.model.ModModelsProvider;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;

public class AddonModels extends ModModelsProvider
{
	public static AddonModels INSTANCE = new AddonModels(EpicKnightsDarkAges.ID);

	// Armor
	public static final ModelLayerLocation BALYK_SOOK_LAMELLAR_LOCATION = INSTANCE.addArmorModel("balyk_sook_lamellar", BalykSookLamellarModel::createLayer);
	public static final ModelLayerLocation TUNIC_LOCATION = INSTANCE.addArmorModel("tunic", TunicModel::createLayer);
	public static final ModelLayerLocation VENDEL_GREAVES_LOCATION = INSTANCE.addArmorModel("vendel_greaves", VendelGreavesModel::createLayer);
	public static final ModelLayerLocation BANDENHELM_LOCATION = INSTANCE.addArmorModel("bandenhelm", BandenhelmModel::createLayer);
	public static final ModelLayerLocation BENTY_GRANGE_HELMET_LOCATION = INSTANCE.addArmorModel("benty_grange_helmet", BentyGrangeHelmetModel::createLayer);
	public static final ModelLayerLocation BIRKA_HELMET_LOCATION = INSTANCE.addArmorModel("birka_helmet", BirkaHelmetModel::createLayer);
	public static final ModelLayerLocation BROA_HELMET_LOCATION = INSTANCE.addArmorModel("broa_helmet", BroaHelmetModel::createLayer);
	public static final ModelLayerLocation COPPERGATE_HELMET_LOCATION = INSTANCE.addArmorModel("coppergate_helmet", CoppergateHelmetModel::createLayer);
	public static final ModelLayerLocation DESJATINNA_HELMET_LOCATION = INSTANCE.addArmorModel("desjatinna_helmet", DesjatinnaHelmetModel::createLayer);
	public static final ModelLayerLocation TJELE_HELMET_LOCATION = INSTANCE.addArmorModel("tjele_helmet", TjeleHelmetModel::createLayer);
	public static final ModelLayerLocation GJERMUNDBU_HELMET_LOCATION = INSTANCE.addArmorModel("gjermundbu_helmet", GjermundbuHelmetModel::createLayer);
	public static final ModelLayerLocation GORZUCHY_HELMET_LOCATION = INSTANCE.addArmorModel("gorzuchy_helmet", GorzuchyHelmetModel::createLayer);
	public static final ModelLayerLocation LOKRUME_HELMET_LOCATION = INSTANCE.addArmorModel("lokrume_helmet", LokrumeHelmetModel::createLayer);
	public static final ModelLayerLocation PECS_HELMET_LOCATION = INSTANCE.addArmorModel("pecs_helmet", PecsHelmetModel::createLayer);
	public static final ModelLayerLocation SOMME_HELMET_LOCATION = INSTANCE.addArmorModel("somme_helmet", SommeHelmetModel::createLayer);
	public static final ModelLayerLocation STAFFORDSHIRE_HELMET_LOCATION = INSTANCE.addArmorModel("staffordshire_helmet", StaffordshireHelmetModel::createLayer);
	public static final ModelLayerLocation SUTTON_HOO_LOCATION = INSTANCE.addArmorModel("sutton_hoo", SuttonHooModel::createLayer);
	public static final ModelLayerLocation VALSGARDE_LOCATION = INSTANCE.addArmorModel("valsgarde", ValsgardeModel::createLayer);
	public static final ModelLayerLocation VALSGARDE_8_LOCATION = INSTANCE.addArmorModel("valsgarde_8", Valsgarde8Model::createLayer);
	public static final ModelLayerLocation VENDEL_1_HELMET_LOCATION = INSTANCE.addArmorModel("vendel_1_helmet", Vendel1HelmetModel::createLayer);
	public static final ModelLayerLocation VENDEL_14_HELMET_LOCATION = INSTANCE.addArmorModel("vendel_14_helmet", Vendel14HelmetModel::createLayer);
	public static final ModelLayerLocation VERDEN_HELMET_LOCATION = INSTANCE.addArmorModel("verden_helmet", VerdenHelmetModel::createLayer);
	public static final ModelLayerLocation WOLLASTON_HELMET_LOCATION = INSTANCE.addArmorModel("wollaston_helmet", WollastonHelmetModel::createLayer);
	public static final ModelLayerLocation YARM_HELMET_LOCATION = INSTANCE.addArmorModel("yarm_helmet", YarmHelmetModel::createLayer);
	public static final ModelLayerLocation STROMOVKA_HELMET_LOCATION = INSTANCE.addArmorModel("stromovka_helmet", StromovkaHelmetModel::createLayer);
	public static final ModelLayerLocation ZLIN_HELMET_LOCATION = INSTANCE.addArmorModel("zlin_helmet", ZlinHelmetModel::createLayer);
	public static final ModelLayerLocation KERCH_HELMET_LOCATION = INSTANCE.addArmorModel("kerch_helmet", KerchHelmetModel::createLayer);
	public static final ModelLayerLocation TROSINO_HELMET_LOCATION = INSTANCE.addArmorModel("trosino_helmet", TrosinoHelmetModel::createLayer);
	public static final ModelLayerLocation EASTERN_HAT_LOCATION = INSTANCE.addArmorModel("eastern_hat", EasternHatModel::createLayer);
	public static final ModelLayerLocation PILLBOX_CAP_LOCATION = INSTANCE.addArmorModel("pillbox_cap", PillboxCapModel::createLayer);

	// Decorations
	public static final LayerDefinition BIRKA_TUNIC_MODEL = BirkaTunicModel.createLayer();
	public static final LayerDefinition BOAR_MODEL = BoarModel.createLayer();
	public static final LayerDefinition COMMON_WALLET_MODEL = CommonWalletModel.createLayer();
	public static final LayerDefinition EARLY_CLOAK_MODEL = EarlyCloakModel.createLayer();
	public static final LayerDefinition HEDEBY_BAG_MODEL = HedebyBagModel.createLayer();
	public static final LayerDefinition MAILLE_AVENTAIL_MODEL = MailleAventailModel.createLayer();
	public static final LayerDefinition ORKNEY_HOOD_MODEL = OrkneyHoodModel.createLayer();
	public static final LayerDefinition VALSGARDE_VAMBRACES_MODEL = ValsgardeVambracesModel.createLayer();
	public static final LayerDefinition WININGAS_MODEL = WiningasModel.createLayer();

	public static final ModelLayerLocation BIRKA_TUNIC_LOCATION = INSTANCE.addDecorationModel("birka_tunic", () -> BIRKA_TUNIC_MODEL);
	public static final ModelLayerLocation BOAR_LOCATION = INSTANCE.addDecorationModel("boar", () -> BOAR_MODEL);
	public static final ModelLayerLocation COMMON_WALLET_LOCATION = INSTANCE.addDecorationModel("common_wallet", () -> COMMON_WALLET_MODEL);
	public static final ModelLayerLocation EARLY_CLOAK_LOCATION = INSTANCE.addDecorationModel("early_cloak", () -> EARLY_CLOAK_MODEL);
	public static final ModelLayerLocation HEDEBY_BAG_LOCATION = INSTANCE.addDecorationModel("hedeby_bag", () -> HEDEBY_BAG_MODEL);
	public static final ModelLayerLocation MAILLE_AVENTAIL_LOCATION = INSTANCE.addDecorationModel("maille_aventail", () -> MAILLE_AVENTAIL_MODEL);
	public static final ModelLayerLocation ORKNEY_HOOD_LOCATION = INSTANCE.addDecorationModel("orkney_hood", () -> ORKNEY_HOOD_MODEL);
	public static final ModelLayerLocation VALSGARDE_VAMBRACES_LOCATION = INSTANCE.addDecorationModel("valsgarde_vambraces", () -> VALSGARDE_VAMBRACES_MODEL);
	public static final ModelLayerLocation WININGAS_LOCATION = INSTANCE.addDecorationModel("winingas", () -> WININGAS_MODEL);

	public AddonModels(String modId)
	{
		super(modId);
	}
}