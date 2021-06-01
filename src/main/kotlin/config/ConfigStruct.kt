package config

data class ConfigStruct(
    val Name:String,
    val List: MutableList<InfoPair>,
    val DBInfo: DBInfo
)

data class InfoPair(
    val Name: String,
    val Num: Long,
    val Passwd: String,
    val FuncList: MutableMap<String, Boolean>
)

data class DBInfo(
    val DBUser: String,
    val DBPasswd: String,
    val DBName: String,
    val DBAddress: String,
    val DBPort: Int
)