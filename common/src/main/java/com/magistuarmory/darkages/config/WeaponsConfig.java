package com.magistuarmory.darkages.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

@Config(name = "weapons")
public class WeaponsConfig implements ConfigData
{
	@ConfigEntry.Gui.CollapsibleObject
    public ByzantineAxeConfig byzantineAxe;
	@ConfigEntry.Gui.CollapsibleObject
    public FalkopingAxeConfig falkopingAxe;
	@ConfigEntry.Gui.CollapsibleObject
    public MigrationEraAxeConfig migrationEraAxe;
	@ConfigEntry.Gui.CollapsibleObject
    public SmallBroadaxeConfig smallBroadaxe;
	@ConfigEntry.Gui.CollapsibleObject
    public SuttonHooAxeConfig suttonHooAxe;
	@ConfigEntry.Gui.CollapsibleObject
    public CraykeAxeConfig craykeAxe;
	@ConfigEntry.Gui.CollapsibleObject
    public DecoratedSpearConfig decoratedSpear;
	@ConfigEntry.Gui.CollapsibleObject
    public HarnhamSpearConfig harnhamSpear;
	@ConfigEntry.Gui.CollapsibleObject
    public JavelinConfig javelin;
	@ConfigEntry.Gui.CollapsibleObject
    public KingstonSpearConfig kingstonSpear;
	@ConfigEntry.Gui.CollapsibleObject
    public GoldenMigrationEraSwordConfig goldenMigrationEraSword;
	@ConfigEntry.Gui.CollapsibleObject
    public JarlsSwordConfig jarlsSword;
	@ConfigEntry.Gui.CollapsibleObject
    public LangseaxConfig langseax;
	@ConfigEntry.Gui.CollapsibleObject
    public MagyarSabreConfig magyarSabre;
	@ConfigEntry.Gui.CollapsibleObject
    public RichNordicSwordConfig richNordicSword;
	@ConfigEntry.Gui.CollapsibleObject
    public RichSaxonSwordConfig richSaxonSword;
	@ConfigEntry.Gui.CollapsibleObject
    public RunicSwordConfig runicSword;
	@ConfigEntry.Gui.CollapsibleObject
    public ScramasaxConfig scramasax;
	@ConfigEntry.Gui.CollapsibleObject
    public SittingbourneSeaxConfig sittingbourneSeax;
	@ConfigEntry.Gui.CollapsibleObject
    public SmallSeaxConfig smallSeax;
	@ConfigEntry.Gui.CollapsibleObject
    public SuttonHooSwordConfig suttonHooSword;
	@ConfigEntry.Gui.CollapsibleObject
    public VikingSwordConfig vikingSword;

    public WeaponsConfig() {
		this.byzantineAxe = new ByzantineAxeConfig();
		this.falkopingAxe = new FalkopingAxeConfig();
		this.migrationEraAxe = new MigrationEraAxeConfig();
		this.smallBroadaxe = new SmallBroadaxeConfig();
		this.suttonHooAxe = new SuttonHooAxeConfig();
		this.craykeAxe = new CraykeAxeConfig();
		this.decoratedSpear = new DecoratedSpearConfig();
		this.harnhamSpear = new HarnhamSpearConfig();
		this.javelin = new JavelinConfig();
		this.kingstonSpear = new KingstonSpearConfig();
		this.goldenMigrationEraSword = new GoldenMigrationEraSwordConfig();
		this.jarlsSword = new JarlsSwordConfig();
		this.langseax = new LangseaxConfig();
		this.magyarSabre = new MagyarSabreConfig();
		this.richNordicSword = new RichNordicSwordConfig();
		this.richSaxonSword = new RichSaxonSwordConfig();
		this.runicSword = new RunicSwordConfig();
		this.scramasax = new ScramasaxConfig();
		this.sittingbourneSeax = new SittingbourneSeaxConfig();
		this.smallSeax = new SmallSeaxConfig();
		this.suttonHooSword = new SuttonHooSwordConfig();
		this.vikingSword = new VikingSwordConfig();
	}

	public static class ByzantineAxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public ByzantineAxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.30f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class FalkopingAxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public FalkopingAxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.30f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class MigrationEraAxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public MigrationEraAxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.30f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class SmallBroadaxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public SmallBroadaxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.30f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class SuttonHooAxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public SuttonHooAxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 4.30f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class CraykeAxeConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public CraykeAxeConfig() {
            this.enabled = true;
            this.baseAttackDamage = 7.20f;
            this.baseAttackSpeed = 0.94f;
            this.bonusAttackReach = 0.90f;
        }
    }
	public static class DecoratedSpearConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public DecoratedSpearConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.00f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 1.45f;
        }
    }
	public static class HarnhamSpearConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public HarnhamSpearConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.00f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 1.45f;
        }
    }
	public static class JavelinConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public JavelinConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.00f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 1.45f;
        }
    }
	public static class KingstonSpearConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public KingstonSpearConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.00f;
            this.baseAttackSpeed = 1.20f;
            this.bonusAttackReach = 1.45f;
        }
    }
	public static class GoldenMigrationEraSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public GoldenMigrationEraSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class JarlsSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public JarlsSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class LangseaxConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public LangseaxConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class MagyarSabreConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public MagyarSabreConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class RichNordicSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public RichNordicSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class RichSaxonSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public RichSaxonSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class RunicSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public RunicSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class ScramasaxConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public ScramasaxConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class SittingbourneSeaxConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public SittingbourneSeaxConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class SmallSeaxConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public SmallSeaxConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class SuttonHooSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public SuttonHooSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
	public static class VikingSwordConfig
    {
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackDamage;
        @ConfigEntry.Gui.RequiresRestart
        public float baseAttackSpeed;
        @ConfigEntry.Gui.RequiresRestart
        public float bonusAttackReach;
        
        public VikingSwordConfig() {
            this.enabled = true;
            this.baseAttackDamage = 3.50f;
            this.baseAttackSpeed = 1.60f;
            this.bonusAttackReach = 0.00f;
        }
    }
}
