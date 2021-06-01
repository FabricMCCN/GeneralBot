import bot.BotManager
import config.InfoPair
import net.mamoe.mirai.BotFactory

suspend fun main() {

    log.info("init bot...")
    log.info("reading necessary info from config file...")
    config.InitConf()
    log.info("succeed to get config!")

    for (infoPair: InfoPair in config.ConfigStorage.configContent.List) {
        log.info("login for ${infoPair.Name}...")
        val bot = BotFactory.newBot(infoPair.Num, infoPair.Passwd)
        BotManager.setBotInstanceByName(
            infoPair.Name, bot
        )

        bot.configuration.noNetworkLog()
        bot.configuration.noBotLog()

        bot.login()
    }

}