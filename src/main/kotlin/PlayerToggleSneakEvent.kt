//import org.bukkit.Bukkit
//import org.bukkit.Bukkit.getOnlineEntitys
//import org.bukkit.entity.Player
//import org.bukkit.event.EventHandler
//import org.bukkit.event.Listener
//import org.bukkit.inventory.ItemStack
//import kotlin.random.Random
//import org.bukkit.event.player.PlayerToggleSneakEvent
//
//object OnPlayerToggleSneakEvent : Listener {
//    var isSneaking = String
//    fun getNearPlayer(obstacle: Player): MutableList<Player> {
//
//        return succeedNearPlayer
//    }

//    fun isSneaked(obstacle: Player,): MutableList<Player> {
//        val nearPlayers =obstacle.getNearbyEntities(3.0,3.0,3.0).filterIsInstance<Player>()
//        var succeedNearPlayer = mutableListOf<Player>()
//        for (i in 0..2) {
//            for (i in nearPlayers ){
//                if (i in obstacle.getNearbyEntities(3.0,3.0,3.0)) {
//                    succeedNearPlayer.remove(i)
//                }
//            }
//            Thread.sleep(1000)
//        }
//        return succeedNearPlayer
//    }
//
//    fun rubItem(Players: MutableList<Player>){
//        for (i in Players){
//            i.inventory.clear((0..35).random())
//        }
//    }
//    @EventHandler
//    fun isSneaking(e:PlayerToggleSneakEvent){
//        if (e.isSneaking){
//            isSneaking="isSneaking"
//        }
//    }
//    @EventHandler
//    fun main(e:PlayerToggleSneakEvent){
//        e.player.sendMessage("occured")
//        if (e.isSneaking){
//            isSneaking = "sneaking"
//        }
//
//    }
//}
