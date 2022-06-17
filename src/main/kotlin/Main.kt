
import org.bukkit.plugin.java.JavaPlugin

class Main :JavaPlugin(){
    override fun onEnable() {
        server.pluginManager.registerEvents(EntityDamageByEntityEvent,this)
        server.pluginManager.registerEvents(OnPlayerMoveEvent,this)
        getCommand("addobstacle")?.setExecutor(Command)
        getCommand("deleteobstacle")?.setExecutor(Command)
        Timer().runTaskTimerAsynchronously(this, 0L, 20L)
    }
}