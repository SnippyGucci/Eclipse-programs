package snippy.lake.commands;

import java.awt.Color;
import java.util.List;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import snippy.lake.Lake;
import org.slf4j.*;

public class Clear extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		System.out.println("clear running");
		
		if (args[0].equalsIgnoreCase(Lake.prefix + "clear")) {
			
			if (args.length < 2) {
				EmbedBuilder usage = new EmbedBuilder();
				usage.setColor(Color.BLUE);
				usage.setTitle("Specify amount to delete");
				usage.setDescription("Usage: `" + Lake.prefix + "clear [# of messages]`");
				event.getChannel().sendMessage(usage.build()).queue();
			} else {
				try {
					String channel = new String();
					channel = channel + event.getChannel();
					String idOnly = channel.replaceAll("[^0-9]", "");
					System.out.println(idOnly);
					
					List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
					event.getChannel().deleteMessages(messages).queue();
					
					EmbedBuilder success = new EmbedBuilder();
					success.setColor(Color.GREEN);
					success.setTitle(":white_check_mark: Successfully deleted");
					success.setDescription("Cleared " + Integer.parseInt(args[1]) + " messages from <#" + idOnly + ">.");
					event.getChannel().sendMessage(success.build()).queue();
					
				} catch (IllegalArgumentException e) {
					EmbedBuilder error = new EmbedBuilder();
					if (Integer.parseInt(args[1]) > 100 || Integer.parseInt(args[1]) <= 1) {
						error.setColor(Color.RED);
						error.setTitle(":red_circle: Too many messages selected!");
						error.setDescription("`[# of messages]` must be between 2-100.");
						event.getChannel().sendMessage(error.build()).queue();
					}
					else {
						error.setColor(Color.RED);
						error.setTitle(":red_circle: Too many messages selected!");
						error.setDescription("Cannot delete messages older than 2 weeks.");
						event.getChannel().sendMessage(error.build()).queue();
					}
				}
				
			}
		}
		
	}
}
