package snippy.lake.commands;

import java.awt.Color;
import java.util.List;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import snippy.lake.Lake;
import org.slf4j.*;

public class Clear extends ListenerAdapter {
	public void onGuildMessagereceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Lake.prefix + "clear")) {
			if (args.length < 2) {
				// TODO error
			} else {
				try {
					List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
					event.getChannel().deleteMessages(messages).queue();
					
				} catch (IllegalArgumentException e) {
					if (Integer.parseInt(args[1]) > 100) {
						EmbedBuilder error = new EmbedBuilder();
						error.setColor(Color.RED);
						error.setTitle(":red_circle: Too many messages selected!");
						error.setDescription("Cannot delete more than 100 messages at a time.");
						event.getChannel().sendMessage(error.build()).queue();
					}
					else
						event.getChannel().sendMessage("Cannot delete messages over 2 weeks old.").queue();
				}
				
			}
		}
		
	}
}
