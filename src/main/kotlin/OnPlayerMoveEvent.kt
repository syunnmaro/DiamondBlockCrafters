import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.event.player.PlayerToggleSneakEvent

object OnPlayerMoveEvent :Listener{
    @EventHandler
    fun getNearEntities(e: PlayerMoveEvent): MutableList<Entity> {
        if ((e.player in Game.obstaclePlayers).not()) {
            return mutableListOf()
        }
        val nearObstaclePlayers = e.player.getNearbyEntities(3.0, 3.0, 3.0)
        return nearObstaclePlayers

    }
    fun checkIfValidRange(obstacle: Player,nearPlayer:Player): MutableList<Player> {
        var validRangePlayer = mutableListOf<Player>()
        if (obstacle.location.subtract(nearPlayer.location).length()>=3){
            validRangePlayer.add(nearPlayer)
        }
        return validRangePlayer
    }

    fun rubItems(player:Player){
        player.inventory.clear((0..35).random())
    }
    @EventHandler
    fun main(e:PlayerMoveEvent){
        if (e.player.isSneaking && e.player in Game.obstaclePlayers){
            for (nearPlayer in getNearEntities(e)){
                e.player.sendMessage("${nearPlayer.name}")
                if (nearPlayer is Player){
                    for (player in checkIfValidRange(nearPlayer,e.player)){
                        rubItems(player)
                    }

                }
            }

        }
    }


}