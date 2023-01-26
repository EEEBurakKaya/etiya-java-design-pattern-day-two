package structual.facade.facades;

import structual.facade.authorization.Authorization;
import structual.facade.authorization.IAuthorization;
import structual.facade.caching.ICaching;
import structual.facade.caching.RedisCaching;
import structual.facade.logging.DatabaseLogger;
import structual.facade.logging.ILogger;

public class CrossCuttingConcernsFacade {
    public ILogger logger;
    public ICaching caching;
    public IAuthorization authorization;

    public CrossCuttingConcernsFacade() {
        // IoC, DI Container
        this.logger = new DatabaseLogger();
        this.caching = new RedisCaching();
        this.authorization = new Authorization();
    }
}
