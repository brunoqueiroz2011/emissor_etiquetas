class Greeting {
    private val platform = getPlatform()

    private val versionApp = "1.0.0"

    fun greet(): String {
        return "Versão, ${versionApp}!"
    }
}