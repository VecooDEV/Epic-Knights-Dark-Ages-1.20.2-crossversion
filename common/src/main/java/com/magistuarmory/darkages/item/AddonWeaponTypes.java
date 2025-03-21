package com.magistuarmory.darkages.item;

import com.magistuarmory.darkages.EpicKnightsDarkAges;
import com.magistuarmory.darkages.config.WeaponsConfig;
import com.magistuarmory.item.WeaponType;

public class AddonWeaponTypes
{
	public static final WeaponsConfig WEAPONS_CONFIG = EpicKnightsDarkAges.CONFIG.weapons;
	
	public static final WeaponType BYZANTINE_AXE = new WeaponType(WEAPONS_CONFIG.byzantineAxe.baseAttackDamage, WEAPONS_CONFIG.byzantineAxe.baseAttackSpeed, WEAPONS_CONFIG.byzantineAxe.bonusAttackReach, 0.00f, 2.4f, 0, WEAPONS_CONFIG.byzantineAxe.enabled);
	public static final WeaponType FALKOPING_AXE = new WeaponType(WEAPONS_CONFIG.falkopingAxe.baseAttackDamage, WEAPONS_CONFIG.falkopingAxe.baseAttackSpeed, WEAPONS_CONFIG.falkopingAxe.bonusAttackReach, 0.00f, 2.4f, 0, WEAPONS_CONFIG.falkopingAxe.enabled);
	public static final WeaponType MIGRATION_ERA_AXE = new WeaponType(WEAPONS_CONFIG.migrationEraAxe.baseAttackDamage, WEAPONS_CONFIG.migrationEraAxe.baseAttackSpeed, WEAPONS_CONFIG.migrationEraAxe.bonusAttackReach, 0.00f, 2.4f, 0, WEAPONS_CONFIG.migrationEraAxe.enabled);
	public static final WeaponType SMALL_BROADAXE = new WeaponType(WEAPONS_CONFIG.smallBroadaxe.baseAttackDamage, WEAPONS_CONFIG.smallBroadaxe.baseAttackSpeed, WEAPONS_CONFIG.smallBroadaxe.bonusAttackReach, 0.00f, 2.4f, 0, WEAPONS_CONFIG.smallBroadaxe.enabled);
	public static final WeaponType SUTTON_HOO_AXE = new WeaponType(WEAPONS_CONFIG.suttonHooAxe.baseAttackDamage, WEAPONS_CONFIG.suttonHooAxe.baseAttackSpeed, WEAPONS_CONFIG.suttonHooAxe.bonusAttackReach, 0.00f, 2.4f, 0, WEAPONS_CONFIG.suttonHooAxe.enabled);
	public static final WeaponType CRAYKE_AXE = new WeaponType(WEAPONS_CONFIG.craykeAxe.baseAttackDamage, WEAPONS_CONFIG.craykeAxe.baseAttackSpeed, WEAPONS_CONFIG.craykeAxe.bonusAttackReach, 0.05f, 2.5f, 0, WEAPONS_CONFIG.craykeAxe.enabled).setTwoHanded(2).setMaxBlockDamage(4.00f);
	public static final WeaponType DECORATED_SPEAR = new WeaponType(WEAPONS_CONFIG.decoratedSpear.baseAttackDamage, WEAPONS_CONFIG.decoratedSpear.baseAttackSpeed, WEAPONS_CONFIG.decoratedSpear.bonusAttackReach, 0.00f, 1.7f, 0, WEAPONS_CONFIG.decoratedSpear.enabled).setTwoHanded(1).setMaxBlockDamage(2.00f);
	public static final WeaponType HARNHAM_SPEAR = new WeaponType(WEAPONS_CONFIG.harnhamSpear.baseAttackDamage, WEAPONS_CONFIG.harnhamSpear.baseAttackSpeed, WEAPONS_CONFIG.harnhamSpear.bonusAttackReach, 0.00f, 1.7f, 0, WEAPONS_CONFIG.harnhamSpear.enabled).setTwoHanded(1).setMaxBlockDamage(2.00f);
	public static final WeaponType JAVELIN = new WeaponType(WEAPONS_CONFIG.javelin.baseAttackDamage, WEAPONS_CONFIG.javelin.baseAttackSpeed, WEAPONS_CONFIG.javelin.bonusAttackReach, 0.00f, 1.7f, 0, WEAPONS_CONFIG.javelin.enabled).setTwoHanded(1).setMaxBlockDamage(2.00f);
	public static final WeaponType KINGSTON_SPEAR = new WeaponType(WEAPONS_CONFIG.kingstonSpear.baseAttackDamage, WEAPONS_CONFIG.kingstonSpear.baseAttackSpeed, WEAPONS_CONFIG.kingstonSpear.bonusAttackReach, 0.00f, 1.7f, 0, WEAPONS_CONFIG.kingstonSpear.enabled).setTwoHanded(1).setMaxBlockDamage(2.00f);
	public static final WeaponType GOLDEN_MIGRATION_ERA_SWORD = new WeaponType(WEAPONS_CONFIG.goldenMigrationEraSword.baseAttackDamage, WEAPONS_CONFIG.goldenMigrationEraSword.baseAttackSpeed, WEAPONS_CONFIG.goldenMigrationEraSword.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.goldenMigrationEraSword.enabled);
	public static final WeaponType JARLS_SWORD = new WeaponType(WEAPONS_CONFIG.jarlsSword.baseAttackDamage, WEAPONS_CONFIG.jarlsSword.baseAttackSpeed, WEAPONS_CONFIG.jarlsSword.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.jarlsSword.enabled);
	public static final WeaponType LANGSEAX = new WeaponType(WEAPONS_CONFIG.langseax.baseAttackDamage, WEAPONS_CONFIG.langseax.baseAttackSpeed, WEAPONS_CONFIG.langseax.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.langseax.enabled);
	public static final WeaponType MAGYAR_SABRE = new WeaponType(WEAPONS_CONFIG.magyarSabre.baseAttackDamage, WEAPONS_CONFIG.magyarSabre.baseAttackSpeed, WEAPONS_CONFIG.magyarSabre.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.magyarSabre.enabled);
	public static final WeaponType RICH_NORDIC_SWORD = new WeaponType(WEAPONS_CONFIG.richNordicSword.baseAttackDamage, WEAPONS_CONFIG.richNordicSword.baseAttackSpeed, WEAPONS_CONFIG.richNordicSword.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.richNordicSword.enabled);
	public static final WeaponType RICH_SAXON_SWORD = new WeaponType(WEAPONS_CONFIG.richSaxonSword.baseAttackDamage, WEAPONS_CONFIG.richSaxonSword.baseAttackSpeed, WEAPONS_CONFIG.richSaxonSword.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.richSaxonSword.enabled);
	public static final WeaponType RUNIC_SWORD = new WeaponType(WEAPONS_CONFIG.runicSword.baseAttackDamage, WEAPONS_CONFIG.runicSword.baseAttackSpeed, WEAPONS_CONFIG.runicSword.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.runicSword.enabled);
	public static final WeaponType SCRAMASAX = new WeaponType(WEAPONS_CONFIG.scramasax.baseAttackDamage, WEAPONS_CONFIG.scramasax.baseAttackSpeed, WEAPONS_CONFIG.scramasax.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.scramasax.enabled);
	public static final WeaponType SITTINGBOURNE_SEAX = new WeaponType(WEAPONS_CONFIG.sittingbourneSeax.baseAttackDamage, WEAPONS_CONFIG.sittingbourneSeax.baseAttackSpeed, WEAPONS_CONFIG.sittingbourneSeax.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.sittingbourneSeax.enabled);
	public static final WeaponType SMALL_SEAX = new WeaponType(WEAPONS_CONFIG.smallSeax.baseAttackDamage, WEAPONS_CONFIG.smallSeax.baseAttackSpeed, WEAPONS_CONFIG.smallSeax.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.smallSeax.enabled);
	public static final WeaponType SUTTON_HOO_SWORD = new WeaponType(WEAPONS_CONFIG.suttonHooSword.baseAttackDamage, WEAPONS_CONFIG.suttonHooSword.baseAttackSpeed, WEAPONS_CONFIG.suttonHooSword.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.suttonHooSword.enabled);
	public static final WeaponType VIKING_SWORD = new WeaponType(WEAPONS_CONFIG.vikingSword.baseAttackDamage, WEAPONS_CONFIG.vikingSword.baseAttackSpeed, WEAPONS_CONFIG.vikingSword.bonusAttackReach, 0.00f, 1.1f, 0, WEAPONS_CONFIG.vikingSword.enabled);
}
