package com.example.examplemod.item;

import java.util.function.Supplier;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;


public enum ModItemTier implements Tier {

    CHEESIUM(2, 69, 6f, 2f, 10, ()->Ingredient.of(ModItems.CHEESIUM.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level=level;
        this.uses=uses;
        this.speed=speed;
        this.damage=damage;
        this.enchantmentValue=enchantmentValue;
        this.repairIngredient=new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        // TODO Auto-generated method stub
        return uses;
    }

    @Override
    public float getSpeed() {
        // TODO Auto-generated method stub
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        // TODO Auto-generated method stub
        return damage;
    }

    @Override
    public int getLevel() {
        // TODO Auto-generated method stub
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        // TODO Auto-generated method stub
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return repairIngredient.get();
    }
    
}
