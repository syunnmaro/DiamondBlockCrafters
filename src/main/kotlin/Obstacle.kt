import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import org.bukkit.potion.PotionType

object Obstacle {
    fun addEffects(player: Player){
        player.addPotionEffect(PotionEffect(PotionEffectType.REGENERATION,999999,0))
        player.addPotionEffect(PotionEffect(PotionEffectType.INVISIBILITY,999999,0))
    }

}