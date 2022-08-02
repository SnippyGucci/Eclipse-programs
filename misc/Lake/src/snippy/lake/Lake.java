package snippy.lake;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import snippy.lake.commands.Commands;

public class Lake {
	public static JDA jda;
	public static String prefix = ">";

	public static void main(String[] args) throws LoginException {
		jda = JDABuilder.createDefault("ODUyNzE4MjA4OTE2OTE0MTc4.YMK5tw.mB_kBnRogE_FlXyomQuvbHROyag").build();
		jda.getPresence().setStatus(OnlineStatus.ONLINE);
		jda.getPresence().setActivity(Activity.watching("fish swim"));
		jda.addEventListener(new Commands());

	}

}
