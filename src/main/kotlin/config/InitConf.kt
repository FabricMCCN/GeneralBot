package config

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import mu.KotlinLogging
import java.io.File
import kotlin.system.exitProcess

class InitConf {

    private val logger = KotlinLogging.logger {}

    constructor() {
        try {
            val gson = Gson()
            val fileState = File("config.json")
            if (!fileState.exists()) {
                fileState.createNewFile()
                fileState.writeBytes(
                    gson.toJson(ConfigStorage.configContent).toByteArray()
                )

                logger.info { "you should change config.json file into yours info!" }
                exitProcess(1)

            }
            val configContent = fileState.readBytes()
            config.ConfigStorage.configContent = gson.fromJson(configContent.decodeToString(), ConfigStruct::class.java)
        } catch (e: JsonSyntaxException) {
            logger.error { "json syntax error!" }
            e.printStackTrace()
            exitProcess(1)
        }
    }

}