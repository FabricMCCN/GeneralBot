package bot

import net.mamoe.mirai.Bot

object BotManager {
    private var botInstances = mutableMapOf<String, Bot>()

    fun getBotInstanceByName(name: String): Bot? {
        return botInstances[name]
    }

    fun setBotInstanceByName(name: String, bot: Bot): Boolean {
        if (getBotInstanceByName(name) == null) {
            botInstances[name] = bot
        }
        return false
    }

    fun stopBot() {
        for (i in botInstances) {
            i.value.close()
        }
    }

    fun stopBot(name: String) {
        botInstances[name]?.close()
    }

}