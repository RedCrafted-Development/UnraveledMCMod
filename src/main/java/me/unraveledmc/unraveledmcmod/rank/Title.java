package me.unraveledmc.unraveledmcmod.rank;

import lombok.Getter;
import org.bukkit.ChatColor;

public enum Title implements Displayable
{

    PRESIDENT("the", "President of RedCrafted", ChatColor.DARK_BLUE, "President"),
    MASTER_BUILDER("a", "Master Builder", ChatColor.DARK_BLUE, "Master-Builder"),
    DEVELOPER("a", "TotalFreedom Developer", ChatColor.DARK_PURPLE, "TF-Dev"),
    RCDEV("a", "RedCrafted Developer", ChatColor.DARK_PURPLE, "RC-Dev"),
    EXEC("an", "Executive Admin", ChatColor.GOLD, "Executive"),
    COOWNER("a", "Co-Owner", ChatColor.BLUE, "Co-Owner"),
    OWNER("an", "Owner", ChatColor.BLUE, "Owner");

    @Getter
    private final String determiner;
    @Getter
    private final String name;
    @Getter
    private final String tag;
    @Getter
    private final String coloredTag;
    @Getter
    private final ChatColor color;

    private Title(String determiner, String name, ChatColor color, String tag)
    {
        this.determiner = determiner;
        this.name = name;
        this.tag = "[" + tag + "]";
        this.coloredTag = ChatColor.DARK_GRAY + "[" + color + tag + ChatColor.DARK_GRAY + "]" + color;
        this.color = color;
    }

    @Override
    public String getColoredName()
    {
        return color + name;
    }

    @Override
    public String getColoredLoginMessage()
    {
        return determiner + " " + color + ChatColor.ITALIC + name;
    }
    
    @Override
    public String getDeterminer()
    {
        return determiner;
    }
    
    @Override
    public String getItalicColoredName()
    {
        return color.toString() + ChatColor.ITALIC + name;
    }

}
