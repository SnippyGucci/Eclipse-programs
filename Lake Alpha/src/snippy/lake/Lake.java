package snippy.lake;

import javax.security.auth.login.LoginException;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import snippy.lake.commands.Clear;
import snippy.lake.commands.Commands;

public class Lake {
	public static JDA jda;
	public static String prefix = ">";

	public static void main(String[] args) throws LoginException {
		jda = JDABuilder.createDefault("ODUyNzE4MjA4OTE2OTE0MTc4.YMK5tw.mB_kBnRogE_FlXyomQuvbHROyag").build();
		jda.getPresence().setStatus(OnlineStatus.ONLINE);
		jda.getPresence().setActivity(Activity.playing("the game of death."));
		jda.addEventListener(new Commands());
		jda.addEventListener(new Clear());
		
		
		//discord rich presence
        DiscordRPC lib = DiscordRPC.INSTANCE;
        String applicationId = "852718208916914178";
        String steamId = "";
        DiscordEventHandlers handlers = new DiscordEventHandlers();
        handlers.ready = (user) -> System.out.println("Ready!");
        lib.Discord_Initialize(applicationId, handlers, true, steamId);
        DiscordRichPresence discordPresence = new DiscordRichPresence();
        discordPresence.state = "Harvesting Computer Souls";
        discordPresence.details = "Competitive";
        discordPresence.startTimestamp = 999;
        //discordPresence.endTimestamp = 1507665886;
        discordPresence.largeImageKey = "scythe-pfp";
        discordPresence.largeImageText = "Numbani";
        discordPresence.smallImageKey = "scythe-pfp-smol";
        discordPresence.smallImageText = "Rogue - Level 100";
        discordPresence.partyId = "ae488379-351d-4a4f-ad32-2b9b01c91657";
        discordPresence.partySize = 999;
        discordPresence.partyMax = 999;
        discordPresence.joinSecret = "MTI4NzM0OjFpMmhuZToxMjMxMjM= ";
        lib.Discord_UpdatePresence(discordPresence);
        // in a worker thread
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                lib.Discord_RunCallbacks();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {}
            }
        }, "RPC-Callback-Handler").start();

	}

}
