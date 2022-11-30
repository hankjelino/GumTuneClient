package rosegold.gumtuneclient.config.pages;

import cc.polyfrost.oneconfig.config.annotations.Switch;

public class NukerBlockFilter {
    @Switch(
            name = "Hardstone",
            description = "Stone in Crystal Hollows"
    )
    public static boolean nukerBlockFilterHardstone = false;

    @Switch(
            name = "Gemstones",
            description = "Glass in Crystal Hollows"
    )
    public static boolean nukerBlockFilterGemstones = false;

    @Switch(
            name = "Mithril",
            description = "Mithril blocks in Dwarven Mines and Crystal Hollows"
    )
    public static boolean nukerBlockFilterMithril = false;

    @Switch(
            name = "Crimson Isle Excavatables",
            description = "Mycelium and red sand in Crimson Isle"
    )
    public static boolean nukerBlockFilterExcavatables = false;

    @Switch(
            name = "Gold",
            description = "Gold Blocks"
    )
    public static boolean nukerBlockFilterGold = false;

    @Switch(
            name = "Stone",
            description = "All stone & cobblestone"
    )
    public static boolean nukerBlockFilterStone = false;

    @Switch(
            name = "Ores",
            description = "All ores"
    )
    public static boolean nukerBlockFilterOres = false;

    @Switch(
            name = "Crops",
            description = "All crops"
    )
    public static boolean nukerBlockFilterCrops = false;

    @Switch(
            name = "Wood",
            description = "All logs"
    )
    public static boolean nukerBlockFilterWood = false;

    @Switch(
            name = "Sand",
            description = "Sand and red sand"
    )
    public static boolean nukerBlockFilterSand = false;

    @Switch(
            name = "Glowstone",
            description = "Glowstone"
    )
    public static boolean nukerBlockFilterGlowstone = false;

    @Switch(
            name = "Netherrack",
            description = "Netherrack"
    )
    public static boolean nukerBlockFilterNetherrack = false;
}
