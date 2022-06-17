import org.bukkit.Bukkit.getPlayer
import org.bukkit.entity.Player


object Game {
    var obstaclePlayers = mutableListOf<Player>()
    fun addObstacle(name: String){
        getPlayer(name)?.let { obstaclePlayers.add(it) }
    }
    fun deleteObstacle(name:String){
        obstaclePlayers.remove(getPlayer(name))
    }




    }



