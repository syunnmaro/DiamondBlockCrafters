import org.bukkit.Bukkit
import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent


object EntityDamageByEntityEvent :Listener{
    @EventHandler
    fun disableObstacleAttack(e: EntityDamageByEntityEvent) {

        if (e.damager is Player){
            if (e.damager in Game.obstaclePlayers){
                e.setCancelled(true)
                e.damager.sendMessage("you hit")
                Bukkit.broadcastMessage("work")
            }


        }

    }


}
