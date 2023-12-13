package net.wyatt.companionmod.entity.custom;

import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public class SpeedrunnerEntity extends PathfinderMob {
    public static final int MAX_HEALTH = 20;
    public SpeedrunnerEntity(EntityType<? extends PathfinderMob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20)
                .add(Attributes.ATTACK_DAMAGE, 1.0D)
                .add(Attributes.MOVEMENT_SPEED, (double) 0.1F)
                .add(Attributes.ATTACK_SPEED)
                .add(Attributes.FOLLOW_RANGE, 100)
                .add(net.minecraftforge.common.ForgeMod.BLOCK_REACH.get())
                .add(Attributes.ATTACK_KNOCKBACK)
                .add(net.minecraftforge.common.ForgeMod.ENTITY_REACH.get());
    }
}
