package awem.autotests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:config/${type}.properties"})

//@Config.Sources({
//        "system:properties",
//        "classpath:config/local.properties",
//        "classpath:config/remote.properties"
//})
public interface ProjectConfig extends Config {
    String hyi = "remote";
    String str = "текст" + hyi +"текст-3";
    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("91.0")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    String browserMobileView();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    String videoStorage();
//    @Key("webUrl")
//    String webUrl();
}
