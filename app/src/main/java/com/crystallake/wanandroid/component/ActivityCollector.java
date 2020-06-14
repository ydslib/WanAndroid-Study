package com.crystallake.wanandroid.component;

import android.app.Activity;
import android.os.Process;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yds
 * on 2020/5/23.
 */
public class ActivityCollector {
    private volatile static ActivityCollector activityCollector;

    public static ActivityCollector getInstance() {
        if (activityCollector == null) {
            synchronized (ActivityCollector.class) {
                if (activityCollector == null) {
                    activityCollector = new ActivityCollector()
                    ;
                }
            }
        }
        return activityCollector;
    }

    private Set<Activity> allActivities;

    public void addActivity(Activity act) {
        if (allActivities == null) {
            allActivities = new HashSet<>();
        }
        allActivities.add(act);
    }

    public void removeActivity(Activity act) {
        if (allActivities != null) {
            allActivities.remove(act);
        }
    }

    public void exitApp(){
        if (allActivities!=null){
            synchronized (allActivities){
                for (Activity act:allActivities){
                    act.finish();
                }
            }
        }
        Process.killProcess(Process.myUid());
        System.exit(0);
    }
}
