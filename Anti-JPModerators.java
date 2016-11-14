import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class AntiJPModerators implements Listener{

	List<String> JP = new ArrayList<>(); //JP共のリストを作成
	private Plugin plugin;

	public AntiJPModerators(Plugin plugin)
	{
		this.plugin = plugin;
	}
  
	/**
	 * プレイヤーが入ってきたときの処理
	 * 
	 */
	@EventHandler
	public void onJoin(PlayerJoinEvent e)
	{
		Player player = e.getPlayer();
		String check = player.getUniqueId().toString(); //UUIDの取得

		for(String JPs : list()) //for文で回して
		{
			if(check.equals(JPs)) //結合する人の時の処理
			{
				//ここは自分の好きなように書き換えておｋ
				Bukkit.getServer().getPluginManager().disablePlugin(plugin); //プラグイン無効化
				return;
			}
		}

		/*
		 * monocrafty   3722b8f2-7df8-492f-af3d-853af2379905
		 * ayunyan      3a97c50f-2a56-4a93-9d5e-b9157cd306d3
		 *
		 * houraibito0  81bb1031-a309-4ff8-8592-42c489e9c71a
		 * alt013       39d5d734-0375-4be9-ac79-48b4a9d642f5
		 * gonnti       c7ef8e23-a964-4e01-81b8-e9a81d680d68
		 * Lunasys      b0fd8126-9557-433a-9dfc-a68afcfb9e88
		 * kitakubu_esu 258287ef-bc59-45b3-b6df-5e619fb6d333
		 * njj12        d67059c4-ee07-42d3-b4dc-e96cb446c5df
		 * hayatarou_   4326bd90-c8c9-4551-9581-ac708edc1514
		 * mako0617     be84c978-5181-42fc-b89e-8e3174af449c
		 * avgvstvs_13  888835bd-ef04-40a5-804c-322db1eb2a94
		 * yamazakura   5544708e-14a9-4e46-9637-f44b2dc99da8
		 *
		 * k4n1_        4cfcf9cf-ca36-4f50-9f2f-c132bca55a21
		 *
		 * ikura_032    668da6d2-6751-40b7-8e15-cc3d8a70c92f
		 * ainau        913959f2-d0a1-4b41-b22f-79e43cf448b9
		 *
		 * Uey          c36676e7-3221-4680-bb60-e5e94b8461c5
		 * kishisuwa    1e0da927-6405-41c3-8c7d-789518d5e2ba
		 * mottyo_1216  04608488-3e81-49c3-9b91-c74a0cb44452
		 * tossy_XD     d09383a7-d5aa-405f-bc61-c66235d3e94f
		 * aquadetteiu  24e861f0-8366-44d5-a12e-ef3d58ef30a6
		 * tuxikin      c6e85a59-e8a3-49ba-a984-7ead45f97375
		 * nissi0709    112e8718-0409-47fe-af28-74d80fb504ca
		 * Freeed1      1b0c7ae2-b171-4013-8306-fca69b6b3762
		 * Bimyou       b3c5666d-b4d2-425d-94c3-a39884f4626b
		 *
		 * 2016/11/14 追加
		 *
		 * hayatarou_	c65b1558-6410-4da7-9aef-cff42a2c1399
		 *
		 * nekonero		1fe51780-035d-446f-b468-99e458b29436
		 * 2ku			49aa7d97-7865-4fb2-8e07-05678755c147
		 *
		 * shop_		cb8d67b7-f0af-4394-b7d6-48c6ea5cb29d
		 * hito1104		23b50b11-9cc7-4820-93dd-7e506859a866
		 *
		 * toufuu3		1345cc86-790b-4d34-bdd1-532506cb7224
		 * kishisuwa	1e0da927-6405-41c3-8c7d-789518d5e2ba
		 * t03y			accd75b1-dc33-463c-a10e-5045452c2ce2
		 * seafoxy		7c16cd9c-844e-48e0-a6aa-f33dc894794d
		 */
	}
	public static List<String> list()//JP運営のUUIDリスト
	{
		List<String> JP = new ArrayList<>();
		JP.add("3722b8f2-7df8-492f-af3d-853af2379905");
		JP.add("3a97c50f-2a56-4a93-9d5e-b9157cd306d3");
		JP.add("81bb1031-a309-4ff8-8592-42c489e9c71a");
		JP.add("39d5d734-0375-4be9-ac79-48b4a9d642f5");
		JP.add("c7ef8e23-a964-4e01-81b8-e9a81d680d68");
		JP.add("b0fd8126-9557-433a-9dfc-a68afcfb9e88");
		JP.add("258287ef-bc59-45b3-b6df-5e619fb6d333");
		JP.add("d67059c4-ee07-42d3-b4dc-e96cb446c5df");
		JP.add("4326bd90-c8c9-4551-9581-ac708edc1514");
		JP.add("be84c978-5181-42fc-b89e-8e3174af449c");
		JP.add("888835bd-ef04-40a5-804c-322db1eb2a94");
		JP.add("5544708e-14a9-4e46-9637-f44b2dc99da8");
		JP.add("4cfcf9cf-ca36-4f50-9f2f-c132bca55a21");
		JP.add("668da6d2-6751-40b7-8e15-cc3d8a70c92f");
		JP.add("913959f2-d0a1-4b41-b22f-79e43cf448b9");
		JP.add("c36676e7-3221-4680-bb60-e5e94b8461c5");
		JP.add("1e0da927-6405-41c3-8c7d-789518d5e2ba");
		JP.add("04608488-3e81-49c3-9b91-c74a0cb44452");
		JP.add("d09383a7-d5aa-405f-bc61-c66235d3e94f");
		JP.add("24e861f0-8366-44d5-a12e-ef3d58ef30a6");
		JP.add("c6e85a59-e8a3-49ba-a984-7ead45f97375");
		JP.add("112e8718-0409-47fe-af28-74d80fb504ca");
		JP.add("1b0c7ae2-b171-4013-8306-fca69b6b3762");
		JP.add("b3c5666d-b4d2-425d-94c3-a39884f4626b");
		JP.add("c65b1558-6410-4da7-9aef-cff42a2c1399");
		JP.add("1fe51780-035d-446f-b468-99e458b29436");
		JP.add("49aa7d97-7865-4fb2-8e07-05678755c147");
		JP.add("cb8d67b7-f0af-4394-b7d6-48c6ea5cb29d");
		JP.add("23b50b11-9cc7-4820-93dd-7e506859a866");
		JP.add("1345cc86-790b-4d34-bdd1-532506cb7224");
		JP.add("1e0da927-6405-41c3-8c7d-789518d5e2ba");
		JP.add("accd75b1-dc33-463c-a10e-5045452c2ce2");
		JP.add("7c16cd9c-844e-48e0-a6aa-f33dc894794d");
		return JP;
	}
}
