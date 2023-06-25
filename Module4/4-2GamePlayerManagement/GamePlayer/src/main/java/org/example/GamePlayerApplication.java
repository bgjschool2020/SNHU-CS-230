package org.example;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class GamePlayerApplication extends Application<GamePlayerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new GamePlayerApplication().run(args);
    }

    @Override
    public String getName() {
        return "GamePlayer";
    }

    @Override
    public void initialize(final Bootstrap<GamePlayerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final GamePlayerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
