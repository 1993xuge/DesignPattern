package com.example.proxymode.staticproxy.searcher;

import com.example.proxymode.staticproxy.searcher.util.AccessValidator;
import com.example.proxymode.staticproxy.searcher.util.Logger;

/**
 * Created at 2018/1/30 下午5:34.
 *
 * @author yixu.wang
 */

public class ProxySearcher implements Searcher {

    private RealSearcher realSearcher;
    private AccessValidator accessValidator;
    private Logger logger;

    public ProxySearcher() {
        realSearcher = new RealSearcher();
        accessValidator = new AccessValidator();
        logger = new Logger();
    }

    @Override
    public void doSearch(String userId, String keyWord) {
        if (accessValidator.validate(userId)) {
            System.out.println("Validate Success !");
            realSearcher.doSearch(userId, keyWord);
            logger.log(userId);
        } else {
            System.out.println("Validate Fail !");
        }
    }
}
