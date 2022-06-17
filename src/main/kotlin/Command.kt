import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object Command :CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (command.name.equals("addobstacle")){
            if (args != null){
                Game.addObstacle(args[0])
                Bukkit.getPlayer(args[0])?.let { Obstacle.addEffects(it) }

                return true
            }
        }
        if (command.name.equals("deleteobstacle")){
            if (args != null){
                Game.deleteObstacle(args[0])
                return true
            }
        }

        return false
    }

}