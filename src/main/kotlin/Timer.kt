import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.boss.BarColor
import org.bukkit.boss.BarStyle
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitRunnable


class Timer : BukkitRunnable() {
    private var time = 1000
    var bossBar = Bukkit.createBossBar("countdown", BarColor.YELLOW, BarStyle.SEGMENTED_10);

    override fun run() {

        if (time < 0) {
            cancel()

            return

        }
        bossBar.progress = time / (time*100.0)
        bossBar.show()
//        Bukkit.broadcastMessage("残り " + time + "秒")
        time--
    }



}