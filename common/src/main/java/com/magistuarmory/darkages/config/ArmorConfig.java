package com.magistuarmory.darkages.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

@Config(name = "armors")
public class ArmorConfig implements ConfigData
{
    @ConfigEntry.Gui.CollapsibleObject
    public BalykSookLamellarConfig balykSookLamellar;
    @ConfigEntry.Gui.CollapsibleObject
    public EasternRichKaftanConfig easternRichKaftan;
    @ConfigEntry.Gui.CollapsibleObject
    public BirkaTunicConfig birkaTunic;
    @ConfigEntry.Gui.CollapsibleObject
    public LombardLamellarConfig lombardLamellar;
    @ConfigEntry.Gui.CollapsibleObject
    public ByrnieConfig byrnie;
    @ConfigEntry.Gui.CollapsibleObject
    public NorthernGambesonConfig northernGambeson;
    @ConfigEntry.Gui.CollapsibleObject
    public CommonHauberkConfig commonHauberk;
    @ConfigEntry.Gui.CollapsibleObject
    public RichByrnieConfig richByrnie;
    @ConfigEntry.Gui.CollapsibleObject
    public VendelGreavesConfig vendelGreaves;
    @ConfigEntry.Gui.CollapsibleObject
    public BandenhelmConfig bandenhelm;
    @ConfigEntry.Gui.CollapsibleObject
    public BentyGrangeHelmetConfig bentyGrangeHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public BirkaHelmetConfig birkaHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public BroaHelmetConfig broaHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public CoppergateHelmetConfig coppergateHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public DesjatinnaHelmetConfig desjatinnaHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public GildedDesjatinnaHelmetConfig gildedDesjatinnaHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public GildedTjeleHelmetConfig gildedTjeleHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public GjermundbuHelmetConfig gjermundbuHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public GorzuchyHelmetConfig gorzuchyHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public LokrumeHelmetConfig lokrumeHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public PecsHelmetConfig pecsHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public SommeHelmetConfig sommeHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public StafforshireHelmetConfig stafforshireHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public SuttonHooHelmetConfig suttonHooHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public LeidenBandhelmetConfig leidenBandhelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public TeljeHelmetConfig teljeHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public UltunaHelmetConfig ultunaHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public Valsgarde5Config valsgarde5;
    @ConfigEntry.Gui.CollapsibleObject
    public Valsgarde8Config valsgarde8;
    @ConfigEntry.Gui.CollapsibleObject
    public Vendel1Config vendel1;
    @ConfigEntry.Gui.CollapsibleObject
    public VendelHelmetConfig vendelHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public VerdenHelmetConfig verdenHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public WollastonHelmetConfig wollastonHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public YarmHelmetConfig yarmHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public StromovkaHelmetConfig stromovkaHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public ZlinHelmetConfig zlinHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public KerchHelmetConfig kerchHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public TrosinoHelmetConfig trosinoHelmet;
    @ConfigEntry.Gui.CollapsibleObject
    public PatternedEasternHatConfig patternedEasternHat;
    @ConfigEntry.Gui.CollapsibleObject
    public EasternHatConfig easternHat;
    @ConfigEntry.Gui.CollapsibleObject
    public PillboxCapConfig pillboxCap;
    @ConfigEntry.Gui.CollapsibleObject
    public OaternedPillboxCapConfig oaternedPillboxCap;
    @ConfigEntry.Gui.CollapsibleObject
    public FurPillboxCapConfig furPillboxCap;
    @ConfigEntry.Gui.CollapsibleObject
    public WiningasConfig winingas;

    public ArmorConfig() {
        this.balykSookLamellar = new BalykSookLamellarConfig();
        this.easternRichKaftan = new EasternRichKaftanConfig();
        this.birkaTunic = new BirkaTunicConfig();
        this.lombardLamellar = new LombardLamellarConfig();
        this.byrnie = new ByrnieConfig();
        this.northernGambeson = new NorthernGambesonConfig();
        this.commonHauberk = new CommonHauberkConfig();
        this.richByrnie = new RichByrnieConfig();
        this.vendelGreaves = new VendelGreavesConfig();
        this.bandenhelm = new BandenhelmConfig();
        this.bentyGrangeHelmet = new BentyGrangeHelmetConfig();
        this.birkaHelmet = new BirkaHelmetConfig();
        this.broaHelmet = new BroaHelmetConfig();
        this.coppergateHelmet = new CoppergateHelmetConfig();
        this.desjatinnaHelmet = new DesjatinnaHelmetConfig();
        this.gildedDesjatinnaHelmet = new GildedDesjatinnaHelmetConfig();
        this.gildedTjeleHelmet = new GildedTjeleHelmetConfig();
        this.gjermundbuHelmet = new GjermundbuHelmetConfig();
        this.gorzuchyHelmet = new GorzuchyHelmetConfig();
        this.lokrumeHelmet = new LokrumeHelmetConfig();
        this.pecsHelmet = new PecsHelmetConfig();
        this.sommeHelmet = new SommeHelmetConfig();
        this.stafforshireHelmet = new StafforshireHelmetConfig();
        this.suttonHooHelmet = new SuttonHooHelmetConfig();
        this.leidenBandhelmet = new LeidenBandhelmetConfig();
        this.teljeHelmet = new TeljeHelmetConfig();
        this.ultunaHelmet = new UltunaHelmetConfig();
        this.valsgarde5 = new Valsgarde5Config();
        this.valsgarde8 = new Valsgarde8Config();
        this.vendel1 = new Vendel1Config();
        this.vendelHelmet = new VendelHelmetConfig();
        this.verdenHelmet = new VerdenHelmetConfig();
        this.wollastonHelmet = new WollastonHelmetConfig();
        this.yarmHelmet = new YarmHelmetConfig();
        this.stromovkaHelmet = new StromovkaHelmetConfig();
        this.zlinHelmet = new ZlinHelmetConfig();
        this.kerchHelmet = new KerchHelmetConfig();
        this.trosinoHelmet = new TrosinoHelmetConfig();
        this.patternedEasternHat = new PatternedEasternHatConfig();
        this.easternHat = new EasternHatConfig();
        this.pillboxCap = new PillboxCapConfig();
        this.oaternedPillboxCap = new OaternedPillboxCapConfig();
        this.furPillboxCap = new FurPillboxCapConfig();
        this.winingas = new WiningasConfig();
    }

    public static class BalykSookLamellarConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;

        public BalykSookLamellarConfig() {
            this.enabled = true;
            this.toughness = 0.20f;
            this.chestplateDurability = 220;
            this.chestplateDefense = 6;
        }
    }
    public static class EasternRichKaftanConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDefense;

        public EasternRichKaftanConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.chestplateDurability = 140;
            this.chestplateDefense = 1;
            this.bootsDurability = 90;
            this.bootsDefense = 1;
        }
    }
    public static class BirkaTunicConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDefense;

        public BirkaTunicConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.chestplateDurability = 140;
            this.chestplateDefense = 1;
            this.bootsDurability = 90;
            this.bootsDefense = 1;
        }
    }
    public static class LombardLamellarConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDefense;

        public LombardLamellarConfig() {
            this.enabled = true;
            this.toughness = 0.20f;
            this.chestplateDurability = 220;
            this.chestplateDefense = 6;
            this.bootsDurability = 200;
            this.bootsDefense = 2;
        }
    }
    public static class ByrnieConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDefense;

        public ByrnieConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.chestplateDurability = 240;
            this.chestplateDefense = 5;
            this.bootsDurability = 0;
            this.bootsDefense = 0;
        }
    }
    public static class NorthernGambesonConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;

        public NorthernGambesonConfig() {
            this.enabled = true;
            this.toughness = 0.30f;
            this.chestplateDurability = 128;
            this.chestplateDefense = 3;
        }
    }
    public static class CommonHauberkConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDefense;

        public CommonHauberkConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.chestplateDurability = 240;
            this.chestplateDefense = 5;
            this.bootsDurability = 0;
            this.bootsDefense = 0;
        }
    }
    public static class RichByrnieConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDefense;

        public RichByrnieConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.chestplateDurability = 240;
            this.chestplateDefense = 5;
            this.bootsDurability = 0;
            this.bootsDefense = 0;
        }
    }
    public static class VendelGreavesConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int leggingsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int leggingsDefense;

        public VendelGreavesConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.leggingsDurability = 180;
            this.leggingsDefense = 2;
        }
    }
    public static class BandenhelmConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public BandenhelmConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class BentyGrangeHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public BentyGrangeHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class BirkaHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public BirkaHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.30f;
            this.helmetDurability = 240;
            this.helmetDefense = 2;
        }
    }
    public static class BroaHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public BroaHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class CoppergateHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public CoppergateHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class DesjatinnaHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public DesjatinnaHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class GildedDesjatinnaHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public GildedDesjatinnaHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class GildedTjeleHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public GildedTjeleHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class GjermundbuHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public GjermundbuHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class GorzuchyHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public GorzuchyHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.30f;
            this.helmetDurability = 240;
            this.helmetDefense = 2;
        }
    }
    public static class LokrumeHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public LokrumeHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class PecsHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public PecsHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.30f;
            this.helmetDurability = 240;
            this.helmetDefense = 2;
        }
    }
    public static class SommeHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public SommeHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class StafforshireHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public StafforshireHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class SuttonHooHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public SuttonHooHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class LeidenBandhelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public LeidenBandhelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class TeljeHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public TeljeHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class UltunaHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public UltunaHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class Valsgarde5Config
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public Valsgarde5Config() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class Valsgarde8Config
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public Valsgarde8Config() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class Vendel1Config
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public Vendel1Config() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class VendelHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public VendelHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class VerdenHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public VerdenHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class WollastonHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public WollastonHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class YarmHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public YarmHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class StromovkaHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public StromovkaHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class ZlinHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public ZlinHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class KerchHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public KerchHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class TrosinoHelmetConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public TrosinoHelmetConfig() {
            this.enabled = true;
            this.toughness = 0.60f;
            this.helmetDurability = 180;
            this.helmetDefense = 2;
        }
    }
    public static class PatternedEasternHatConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public PatternedEasternHatConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.helmetDurability = 100;
            this.helmetDefense = 1;
        }
    }
    public static class EasternHatConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public EasternHatConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.helmetDurability = 100;
            this.helmetDefense = 1;
        }
    }
    public static class PillboxCapConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public PillboxCapConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.helmetDurability = 100;
            this.helmetDefense = 1;
        }
    }
    public static class OaternedPillboxCapConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public OaternedPillboxCapConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.helmetDurability = 100;
            this.helmetDefense = 1;
        }
    }
    public static class FurPillboxCapConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;

        public FurPillboxCapConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.helmetDurability = 100;
            this.helmetDefense = 1;
        }
    }
    public static class WiningasConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public int leggingsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int leggingsDefense;

        public WiningasConfig() {
            this.enabled = true;
            this.toughness = 0.00f;
            this.leggingsDurability = 100;
            this.leggingsDefense = 1;
        }
    }
}
