package log

import net.mamoe.mirai.utils.MiraiLogger

object Logger {
    val logger = MiraiLogger.create(config.ConfigStorage.configContent.Name)
}