package chalkboardmods.floralflair;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;


@Config(name =FloralFlair.MOD_ID)
public class FloralConfig implements ConfigData {
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Pulse Petal flowers generating in forests [default = 6]")
    @ConfigEntry.BoundedDiscrete(max = 24L)
    public int pulsePetalDensity = 6;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Foxnip flowers generating in taigas [default = 4]")
    public int foxnipDensity = 4;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("Frosted Foxnip flower spawning density in game [default = 4]")
    public int frostedFoxnipDensity = 4;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Fairy Blossom flowers generating in flower forests [default = 8]")
    public int fairyBlossomDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Gem of the Jungle flowers in jungles [default = 5]")
    public int jungleGemDensity = 5;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Rose flowers in forests and plains [default = 6]")
    public int roseDensity = 6;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @Comment("The density of Muscari flowers in snowy places [default = 8]")
    public int muscariDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Sunset Poppy flowers in savannas [default = 6]")
    public int sunsetPoppyDensity = 6;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Purpureum flowers in swamps [default = 7]")
    public int purpureumDensity = 7;

    public static void init() {
        AutoConfig.register(FloralConfig.class, JanksonConfigSerializer::new);
    }
    public static FloralConfig get() {
        return AutoConfig.getConfigHolder(FloralConfig.class).getConfig();
    }

}
