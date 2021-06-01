package config

object ConfigStorage {

    public var configContent = config.ConfigStruct(
        "GeneralBot",
        mutableListOf(
            InfoPair(
                "Test1",
                112233,
                "112233",
                mutableMapOf(
                    "func1" to false
                )
            )
        ),
        DBInfo("root", "example", "qqmsg", "0.0.0.0", 27017)
    )

    fun getFuncListByName(name: String): MutableMap<String, Boolean>? {
        for (i: InfoPair in configContent.List) {
            if (i.Name == name) {
                return i.FuncList
            }
        }
        return null
    }
}