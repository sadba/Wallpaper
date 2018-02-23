package com.lab.sadba.wallpaper2.Common;

import com.lab.sadba.wallpaper2.Interface.NewsService;
import com.lab.sadba.wallpaper2.Remote.RetrofitClient;

/**
 * Created by sadba on 15-Feb-18.
 */

public class Common {

    private static final String BASE_URl="http://13.95.172.201/fgc-admin/C_api_mobile";

    public static NewsService getNewsService(){
        return RetrofitClient.getClient(BASE_URl).create(NewsService.class);
    }
}
