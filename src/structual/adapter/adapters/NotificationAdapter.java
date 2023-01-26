package structual.adapter.adapters;

import structual.adapter.Notification;
import structual.adapter.caching.ICache;

public class NotificationAdapter implements ICache {
    @Override
    public void cache() {
        Notification notification = new Notification();
        notification.notification();
    }
}
