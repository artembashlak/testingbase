package com.waverleysoftware;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.aeonbits.owner.Reloadable;

/**
 * Config.properties reader.
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("classpath:config.properties")
public interface BaseConfig extends Config,Reloadable{

    BaseConfig BASE_CONFIG = ConfigFactory.create(BaseConfig.class, System.getenv(), System.getProperties());


    @Key("explicit.wait.timeout")
    @DefaultValue("3")
    long waitTimeout();

    @DefaultValue("https://github.com")
    @Key("url")
    String url();

}
