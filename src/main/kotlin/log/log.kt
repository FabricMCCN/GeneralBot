package log

import net.mamoe.mirai.utils.info

fun info(msg: String?) {
    log.Logger.logger.info(msg)
}

fun info(e: Throwable?) {
    log.Logger.logger.info(e)
}

fun info(msg: String?, e: Throwable?) {
    log.Logger.logger.info(msg, e)
}

fun info(msg: () -> String, e: Throwable?) {
    log.Logger.logger.info(msg, e)
}

fun error(msg: String?) {
    log.Logger.logger.error(msg)
}

fun error(e: Throwable?) {
    log.Logger.logger.error(e)
}

fun error(msg: String?, e: Throwable?) {
    log.Logger.logger.error(msg, e)
}


fun debug(msg: String?) {
    log.Logger.logger.debug(msg)
}

fun debug(e: Throwable?) {
    log.Logger.logger.debug(e)
}

fun debug(msg: String?, e: Throwable?) {
    log.Logger.logger.debug(msg, e)
}
