package snippy.lake.commands;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import snippy.lake.Lake;

public class Commands extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split(" ");
		
		if (args[0].equalsIgnoreCase(Lake.prefix + "info")) {
			EmbedBuilder embInfo = new EmbedBuilder();
			embInfo.setTitle("Water Information");
			embInfo.setDescription("Finding Weather information in your area...");
			embInfo.setColor(Color.BLUE);
			embInfo.setFooter("Created by Snippy#5386", event.getMember().getUser().getAvatarUrl());
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embInfo.build()).queue();
			embInfo.clear();
		}
	}

}
