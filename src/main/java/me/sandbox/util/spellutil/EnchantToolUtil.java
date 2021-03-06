package me.sandbox.util.spellutil;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import me.sandbox.entity.ArchivistEntity;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.IllagerEntity;
import net.minecraft.item.*;
import net.minecraft.world.LocalDifficulty;

import java.util.*;
import java.util.function.Predicate;

public class EnchantToolUtil {
    Item mainhanditem;
    Item offhanditem;
    ItemStack mainStack;
    ItemStack offStack;

    public boolean eligibleForEnchant(LivingEntity entity) {
        mainhanditem = entity.getEquippedStack(EquipmentSlot.MAINHAND).getItem();
        offhanditem = entity.getEquippedStack(EquipmentSlot.OFFHAND).getItem();
        return (mainhanditem instanceof BowItem || mainhanditem instanceof CrossbowItem || mainhanditem instanceof SwordItem || mainhanditem instanceof AxeItem || offhanditem instanceof BowItem
        || offhanditem instanceof CrossbowItem || offhanditem instanceof SwordItem || offhanditem instanceof AxeItem);
    }

    public void doEnchant(Enchantment enchantment, int enchantLevel, LivingEntity entity) {
        ItemStack mainhanditem = entity.getEquippedStack(EquipmentSlot.MAINHAND);
        ItemStack offhanditem = entity.getEquippedStack(EquipmentSlot.OFFHAND);
        HashMap<Enchantment, Integer> map = Maps.newHashMap();
        map.put(enchantment, enchantLevel);
        EnchantmentHelper.set(map, mainhanditem);
        EnchantmentHelper.set(map, offhanditem);
    }

    public void enchant(LivingEntity entity) {
        mainhanditem = entity.getEquippedStack(EquipmentSlot.MAINHAND).getItem();
        offhanditem = entity.getEquippedStack(EquipmentSlot.OFFHAND).getItem();
        mainStack = entity.getEquippedStack(EquipmentSlot.MAINHAND);
        offStack = entity.getEquippedStack(EquipmentSlot.OFFHAND);
        if (mainhanditem instanceof BowItem || offhanditem instanceof BowItem) {
            doEnchant(Enchantments.POWER, 3, entity);
            }
        if (mainhanditem instanceof AxeItem || mainhanditem instanceof SwordItem || offhanditem instanceof SwordItem || offhanditem instanceof AxeItem) {
            doEnchant(Enchantments.SHARPNESS, 3, entity);
        }
        if (mainhanditem instanceof CrossbowItem || offhanditem instanceof CrossbowItem) {
            Random random = new Random();
            int randvalue = random.nextInt(2);
            if (randvalue == 1) {
                doEnchant(Enchantments.PIERCING, 4, entity);
            }
            if (randvalue == 0) {
                doEnchant(Enchantments.MULTISHOT, 1, entity);
            }
        }
        entity.equipStack(EquipmentSlot.MAINHAND, mainStack);
        entity.equipStack(EquipmentSlot.OFFHAND, offStack);
    }
}
