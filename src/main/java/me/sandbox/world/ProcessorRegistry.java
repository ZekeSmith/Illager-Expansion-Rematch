package me.sandbox.world;

import com.google.common.collect.ImmutableList;
import me.sandbox.IllagerExpansion;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorList;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;

public class ProcessorRegistry {
    public static StructureProcessorType<NoWaterlogProcessor> NO_WATERLOG_PROCESSOR = () -> NoWaterlogProcessor.CODEC;

    public static final RegistryEntry<StructureProcessorList> WATERLOGGED_LIST = ProcessorRegistry.register("waterlogged_processor_list", ImmutableList.of(new NoWaterlogProcessor()));


    public static void registerProcessors() {
        Registry.register(Registry.STRUCTURE_PROCESSOR, new Identifier(IllagerExpansion.MOD_ID, "waterlog"), NO_WATERLOG_PROCESSOR);
    }
    public static RegistryEntry<StructureProcessorList> register(String id, ImmutableList<StructureProcessor> processorList) {
        Identifier identifier = new Identifier(IllagerExpansion.MOD_ID, id);
        StructureProcessorList structureProcessorList = new StructureProcessorList(processorList);
        return BuiltinRegistries.add(BuiltinRegistries.STRUCTURE_PROCESSOR_LIST, identifier, structureProcessorList);
    }
}
